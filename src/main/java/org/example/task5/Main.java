package org.example.task5;

import org.example.task5.webPage.WebPage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static final Map<String, List<WebPage>> mapContents = new HashMap<>();

    public static void main(String[] args) {
        mapContents.put("функции", new ArrayList<>());
        mapContents.put("создает", new ArrayList<>());
        mapContents.put("факториала", new ArrayList<>());

        addWebPageInList(new WebPage("qqq", "tns", "Рекурсивные функции тоже используют стек вызовов! Посмотрим, как это\n" +
                "делается, на примере функции вычисления факториала. Вызов factorial(5)\n" +
                "записывается в виде 5! и определяется следующим образом: 5! = 5*4*3*2*1.\n" +
                "По тому же принципу factorial(3) соответствует 3*2*1. Рекурсивная функция для вычисления факториала числа выглядит так:"));

        addWebPageInList(new WebPage("rrr", "pimp", "Здесь важно, что каждый вызов создает собственную копию x. Обратиться\n" +
                "к переменной x, принадлежащей другой функции, невозможно.\n" +
                "Стек играет важную роль в рекурсии. В начальном примере были представлены два решения поиска ключа. Вспомните, как выглядел первый:"));


    }

    private static void addWebPageInList(WebPage webPage) {
        String[] arrContent = webPage.getContent().replace(",", "").split(" ");
        for (int i = 0; i < arrContent.length; i++) {
            if (mapContents.containsKey(arrContent[i])) {
                mapContents.get(arrContent[i]).add(webPage);
            }
        }
    }
    private static void searchKey(String key) {
        if (mapContents.containsKey())
    }
}
