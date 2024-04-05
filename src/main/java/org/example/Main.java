package org.example;

import org.json.JSONObject;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject("{\"members\": [{\"name\": \"John\"}, {\"name\": \"Alice\"}]}");

        // Print the names of all members
        System.out.println("Members:");
        obj.getJSONArray("members").forEach(person -> {
            System.out.println(((JSONObject) person).getString("name"));
        });
    }
}