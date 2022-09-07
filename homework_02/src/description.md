1) В главном методе инициализирован массив объектов типа Person, необходимо:
   убрать дубликаты, отсортировать по идентификатору, сгруппировать по имени.
   Что должно получиться:

        0 - Harry
        0 - Harry
        1 - Harry
        2 - Harry
        3 - Emily
        4 - Jack
        4 - Jack
        5 - Amelia
        5 - Amelia
        6 - Amelia
        7 - Amelia
        8 - Amelia

        **************************************************

        Duplicate filtered, grouped by name, sorted by name and id:

        Amelia:
        1 - Amelia (5)
        2 - Amelia (6)
        3 - Amelia (7)
        4 - Amelia (8)
        Emily:
        1 - Emily (3)
        Harry:
        1 - Harry (0)
        2 - Harry (1)
        3 - Harry (2)
        Jack:
        1 - Jack (4)


2) На вход подается массив и число. 
   Нужно вывести первую пару чисел, которые дают в сумме исходное число.

       [3, 4, 2, 7], 10 -> [3, 7]

3) Реализовать функцию нечеткого поиска:

                    fuzzySearch("car", "ca6$$#_rtwheel"); // true
                    fuzzySearch("cwhl", "cartwheel"); // true
                    fuzzySearch("cwhee", "cartwheel"); // true
                    fuzzySearch("cartwheel", "cartwheel"); // true
                    fuzzySearch("cwheeel", "cartwheel"); // false
                    fuzzySearch("lw", "cartwheel"); // false