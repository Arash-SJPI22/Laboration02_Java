Laborationsuppgift 2 – Java-Programmering
Den här uppgiften går ut på att lära sig syntaxen samt få viss förståelse för hur man använder
objektorienterad programmering med Java.

Uppgift 1:
Skapa två klasser kallade Rectangle och Circle.
Lägg till lämpliga fält på de båda klasserna och implementera konstruktorer och getters samt setters
metoder för att kunna initialisera, läsa och uppdatera fältens data.
Båda klasserna ska ärva från en abstrakt klass Shape som ska definiera de abstrakta metoderna
getArea() samt getPerimeter(). Implementera dessa metoder på våra konkreta Shape klasser.
På klassen Shape ska det även finnas en eller flera statiska metod som kan användas för att skapa
nya shapes av önskad typ. Fundera här på hur

Interface:
Låt våra shapes klasser implementera det generiska interfacet Comparable<T>. Gör standard
implementationen så att den jämför shapes baserat på deras area. Detta kallas då för naturliga
ordningen mellan våra shapes men andra implementationer skulle kunna användas för sortering tex
omkretsen.

Uppgift 2:
Skapa ett litet program som skapar ett par objekt av respektive Shape typ och sparar dessa i en
ArrayList.
Använd sedan sort metoden som finns på List/ArrayList med null som parameter för att utnyttja vår
naturliga sorteringsordning och skriv ut listan i sorterad ordning.

Uppgift 3:
Utöka programmet från uppgift2 till att även innehålla ett Set för att lagra Shape typer. Lämpligen
kan vi använda ett HashSet som implementation. Skapa ett antal olika shapes och lägg till dessa till
ditt Set. Låt minst två shapes som läggs till i Set implementationen ha samma mått och typ. Endast
ett av dessa objekt borde lagras men vad händer när du skriver ut innehållet i ditt Set?
För att det hela ska fungera som tänkt behöver vi göra implementationer av equals och hashCode
metoderna på våra Shape klasser. Efter att detta gjorts bör nu endast ett exemplar lagras med samma
mått och typ.