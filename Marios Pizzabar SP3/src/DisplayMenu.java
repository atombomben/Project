import javax.swing.*;
// @Author Rasmus Olsson
public class DisplayMenu {

    JFrame frame = new JFrame();
    JTextArea menuText = new JTextArea();

    public void displayMenu(){


        menuText.append(" 1. Vesuvio: tomatsauce, ost, skinke og oregano 57kr\n"+
                "2. Amerikaner: tomatsauce, ost, Oksefars og oregano 53kr\n"+
                "3. Cacciatore: tomatsauce, ost, pepperoni og oregano 57kr\n"+
                "4. Carbona: tomatsauce, ost, skinke, kødsauce, spaghetti, cocktailpølser og oregano 63kr\n"+
                "5. Dennis: tomatsauce, ost, skinke, cocktailpølser og oregano 65kr\n"+
                "6. Bertil: tomatsauce, ost, bacon og oregano 57kr\n"+
                "7. Silvia: tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano 61kr\n"+
                "8. Victoria: tomatsauce, ost, skinke, ananas, champignon, løg og oregano 61kr\n"+
                "9. Toronfo: tomatsauce, ost, skinke, bacon, kebab, chili og oregano 61kr\n"+
                "10. Capricciosa: tomatsauce, ost, skinke, champignon og oregano 61kr\n"+
                "11. Hawai: tomatsauce, ost, skinke, ananas og oregano 61kr\n"+
                "12. Le Blissola: tomatsauce, ost, skinke, rejer, oregano 61kr\n"+
                "13. Venezia: tomatsauce, ost, skinke, bacon og oregano 61kr\n"+
                "14. Mafia: tomatsauce, ost,pepperoni, bacon, løg og oregano 61kr\n"+
                "15. Margherita: tomatsauce, ost 65kr\n"+
                "16. Lations: tomatsauce, ost,artiskokker ,grillede auberginer og høvlet parmesan 76kr\n"+
                "17. Vegetariana: tomatsauce, ost, tynde skiver af kartofler og rosmarin 76kr\n"+
                "18. Quattro Stagioni: tomatsauce, ost, skinke, rejer, champignon og artiskokker 71kr\n"+
                "19. Italiana: tomatsauce, ost, kødsauce og løg 76kr\n"+
                "20. Calzone(lukket) tomatsauce, ost, skinke og champignon 74kr\n"+
                "21. Amada: tomatsauce, ost, tomatskiver, løg, bacon og hvidløg 60kr\n"+
                "22. Azzurra: tomatsauce, ost, pepperoni, champignon, peberfrugt, løg og dressing 60kr\n"+
                "23. Cesar: tomatsauce, ost, kebab, pepperoni og dressing 65kr\n"+
                "24. Ambra: tomatsauce, ost, cocktailpølser, løg og bacon 65kr\n"+
                "25. Erik: tomatsauce, ost, oksekød, skinke. champignon, pepperoni og peberfrugt 65kr\n"+
                "26. Asta: tomatsauce, ost, skinke, kebab, pepperoni, peberfrugt og bacon 70kr\n"+
                "27. Geddo: tomatsauce, ost, skinke, kebab, pepperoni, champignon, løg og bacon 70kr\n"+
                "28. Gabriel: tomatsauce, ost, kyllingetern løg, taco, oregano, chili og hvidløg 65kr\n"+
                "29. Robert: tomatsauce, ost, skinke, løg, gorgonzola og bacon 65kr\n"+
                "30. Michael: tomatsauce, ost, pepperoni, kyllingetern og peberfrugt 60kr\n"+
                "31. Kristina: tomatsauce, ost, oksekød, løg, peberfrugt, gorgonzola, og hvidløg 65kr\n"+
                "32. Ulf: tomatsauce, ost, kebab, pepperoni, champignon, gorgonzola, salat, dressing, chili og hvidløg 70kr\n"+
                "33. Brian (UDEN OST): tomatsauce, oksekød, pepperoni, løg, chili og hvidløg 55kr\n"+
                "34. Hvid: tomatsauce, ost, kebab, kyllingetern, løg, bacon, hvidløg og dressing 65kr");


        menuText.setEditable(false);
        frame.add(menuText);
        frame.setSize(600,600);
        frame.setVisible(true);
    }

    public void closeMenu() {
        frame.dispose();

    }

}