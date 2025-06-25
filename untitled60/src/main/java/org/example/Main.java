package org.example;

import com.google.gson.JsonParser;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = importarJugadores();
        //jugadores.forEach(System.out::println);
        System.out.println(jugadores.size());

        int puntosMinimo = 50;
        List<Jugador> jugadoresFiltro = jugadores.stream()
                .filter(j->j.getPuntuacion()>puntosMinimo)
                .peek(System.out::println)
                .toList();
        System.out.println(jugadoresFiltro.size());


        long cantidadDeportes = jugadores.stream()
                .map(j -> j.getDeporte())
                .distinct()
                .count();
        System.out.println(cantidadDeportes);

//        Map<String, Long> conteoPorDeporte = jugadores.stream()
//                .collect(Collectors.groupingBy(j ->
//                        j.getDeporte(), Collectors.counting()));
//
//        conteoPorDeporte.forEach((deporte, cantidad) ->
//                System.out.println(deporte + ": " + cantidad + " jugadores"));
        //jugadores.stream().forEach(System.out::println);


        Map<String, Optional<Jugador>> mejorPorDeporte = jugadores.stream()
                .collect(Collectors.groupingBy(
                        j -> j.getDeporte(),
                        Collectors.maxBy(Comparator.comparingInt(j ->
                                j.getPuntuacion))
                ));

        // Mostrar resultados
        mejorPorDeporte.forEach((deporte, jugadorOpt) ->
                jugadorOpt.ifPresent(j -> System.out.println(deporte + ": " + j.nombre + " (" + j.puntuacion + " puntos)"))
        );

        Map<String, Optional<Jugador>> maxPorDeporte = jugadores.stream()
                .collect(Collectors.groupingBy(Jugador::getDeporte,
                        Collectors.maxBy(Comparator.comparingInt(Jugador::getPuntuacion))));

        // 4. Promedio y total de equipo específico (ej. "Equipo A")
        String equipo = "Equipo A";
        Double promedio = jugadores.stream()
                .filter(j -> j.getEquipo().equals(equipo))
                .collect(Collectors.averagingInt(Jugador::getPuntuacion));

        int total = jugadores.stream()
                .filter(j -> j.getEquipo().equals(equipo))
                .mapToInt(Jugador::getPuntuacion)
                .sum();

        // 5. Promedio de puntuación por deporte
        Map<String, Double> promedioPorDeporte = jugadores.stream()
                .collect(Collectors.groupingBy(Jugador::getDeporte,
                        Collectors.averagingInt(Jugador::getPuntuacion)));

        // 6. Lista ordenada por puntuación desc
        List<Jugador> ordenados = jugadores.stream()
                .sorted(Comparator.comparingInt(Jugador::getPuntuacion).reversed())
                .collect(Collectors.toList());
        Files.write(Paths.get("jugadores_ordenados.json"), gson.toJson(ordenados).getBytes());

        // 7. Lista de nombres en mayúsculas
        List<String> nombresMayuscula = jugadores.stream()
                .map(j -> j.getNombre().toUpperCase())
                .collect(Collectors.toList());

        // Impresión de resultados
        System.out.println("Jugadores por deporte: " + porDeporte);
        System.out.println("Mayor puntuación por deporte: ");
        maxPorDeporte.forEach((dep, jug) ->
                jug.ifPresent(j -> System.out.println(dep + ": " + j.getNombre() + " (" + j.getPuntuacion() + ")"))
        );
        System.out.println("Promedio equipo " + equipo + ": " + promedio);
        System.out.println("Total equipo " + equipo + ": " + total);
        System.out.println("Promedio por deporte: " + promedioPorDeporte);
        System.out.println("Nombres en mayúsculas: " + nombresMayuscula.subList(0, 10)); // primeros 10



    }

    private static ArrayList<Jugador> importarJugadores() {
        JsonParser jsonParser = new JsonParser();
        ArrayList<Jugador> objs = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("jugadores.json"));
            JsonElement jsonElement = jsonParser.parse(br);
            objs = new Gson().fromJson(jsonElement, new
                    TypeToken<List<Jugador>>() { }.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return objs;
    }
}