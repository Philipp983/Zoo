# Zoo 🦒🦁🐕🐟
Continue the petshop example until we get to a "PetZoo".

_Note: This is just a rough sketch of ideas. There may be unforeseen 
surprises on the way!_

## Class: `Main`
* let your main method create a Zoo object

## Class: `Zoo`
* a Zoo shall contain 3 different `Areas` (own objects) as an array: Waterworld, Insects, Mammals - these objects shall be created within the Zoo (composition) 
* a Zoo shall contain one `PetShop` (passed as parameter to the constructor)

## Class: `Area`
* each Area shall hold an array of 5 Pets (initially empty)
* create method to add Pets to an Area object
* create a method to get the number of Pets in an area

## Class: `Zoo`
* create a method to "buy" a Pet from the PetShop (which is available as field) and assign it to the right Area
* create a "showtime" method which lets a visitor walk through all areas & let all Pets which are available "makeNoise()"

## Side notes:
* you may need getters, setters, toString() methods which are not mentioned above - feel free to change and adjust everything
  to get a well-designed zoo application 🌞

## Bonus: Visitors
Be creative and enable your Zoo to handle Visitor objects
