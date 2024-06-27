package br.dev.otao.infrastructure;

import br.dev.otao.application.UseCase;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(new UseCase().execute());
    }
}