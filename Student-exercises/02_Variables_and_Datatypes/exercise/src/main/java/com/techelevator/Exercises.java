package com.techelevator;

public class Exercises {

    public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
        // ### EXAMPLE:
        int birdsOnABranch = 4;
        int birdsThatFlyAway = 1;
        int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
        // ### EXAMPLE:
        int numberOfBirds = 6;
        int numberOfNests = 3;
        int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
        int numberOfRaccoons = 3;
        int racoonsThatLeft = 2;
        int remaining = numberOfRaccoons - racoonsThatLeft;

        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
        int flowers = 5;
        int bees = 3;
        int less = flowers - bees;

        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
        int current = 1;
        int newComer = 1;
        int total = current + newComer;

        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
        int currentNumberOfOwls = 3;
        int newOwls = 2;
        int totalNumberOfOwls = currentNumberOfOwls + newOwls;

        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */

        int currentBeavers = 2;
        int beaversThatLeft = 1;
        int remainingBeavers = currentBeavers - beaversThatLeft;

        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */

        int currentToucans = 2;
        int newToucans = 1;
        int totalToucans = currentToucans + newToucans;

        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */

        int numberOfSqirrels = 4;
        int numberOfNuts = 2;
        int moreSquirrels = numberOfSqirrels - numberOfNuts;

        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */

        double quarter = 0.25, dime = 0.1, nickel = 0.05;
        int numberOfNickels = 2;
        double totalNumberOfMoney = (nickel * numberOfNickels) + quarter + dime;

        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
        int brierClass = 18, macAdams = 20, flannery = 17;
        int totalNumberOfMuffins = brierClass + macAdams + flannery;

        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
        double yoyo = .24, whistle = .14;
        double spentInTotal = yoyo + whistle;

        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */

        int largeMarshMallows = 8, smallOnes = 10;
        int totalMarshMallows = largeMarshMallows + smallOnes;

        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
        int currentSnow = 29, secondValue = 17;
        int moreSnow = currentSnow - secondValue;

        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2.50 on a pencil
        case. How much money does she have left?
        */

        double startedOff = 10.0, toyTruck = 3, pencil = 2.5;
        double changeAfter = startedOff - toyTruck - pencil;

        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */

        int marblesToBeginWith = 16, amountHeLost = 7;
        int remainderOfMarbles = marblesToBeginWith - amountHeLost;

        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */

        int numberOfSeashells = 19, reachAmount = 25;
        int reachGoal = reachAmount - numberOfSeashells;

        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */

        int numberOfBalloons = 17, redBalloons = 8;
        int greenBalloons = numberOfBalloons - redBalloons;

        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */

        int numberOfBooks = 38, addedBooks = 10;
        int totalBooks = numberOfBooks + addedBooks;

        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */

        int numberOfLegs = 6, numberOfBees = 8;
        int totalLegs = numberOfLegs * numberOfBees;

        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */

        double iceCream = 0.99;
        double totalPriceOfIceCream = iceCream * 2;

        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */

        int numberOfRocks = 125, currentRocks = 64;
        int remainderRocks = numberOfRocks - currentRocks;

        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */

        int numberOfMarbles = 38, lostMarbles = 15;
        int leftOversMarbles = numberOfMarbles - lostMarbles;

        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */

        int startingPoint = 78, refill = 32;
        int leftToDrive = startingPoint - refill;

        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */

        int startingMinutes = 90, afterMinutes = 45;
        int totalMinutes = startingMinutes + afterMinutes;

        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */

        double priceOfHotDogs = 0.5;
        int numberOfHotDogs = 6;
        double totalPrice = priceOfHotDogs * numberOfHotDogs;

        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */

        int money = 50, priceOfPencil = 7;
        int numberOfPencils = money / priceOfPencil;


        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */

        int orangeButterflies = 20, totalButterflies = 33;
        int redButter = totalButterflies - orangeButterflies;

        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */

        double startedAmount = 1.0, candy = 0.54;
        double kateChange = startedAmount - candy;

        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */

        int startedTrees = 13, moreTrees = 12;
        int totalTrees = startedTrees + moreTrees;

        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */

        int hours = 2, hoursPerDay = 24;
        int hoursTill = hours * hoursPerDay;

        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */

        int amountOfCousins = 4, perPerson = 5;
        int totalGums = amountOfCousins * perPerson;

        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */

        double danInitialAmount = 3.00, candyBar = 1.00;
        double changeForDan = danInitialAmount - candyBar;

        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */

        int boats = 5, numberOfPeople = 3;
        int totalBoats = boats * numberOfPeople;

        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */

        int initialAmountOfLegos = 380, lostAmount = 57;
        int remainderLegos = initialAmountOfLegos - lostAmount;

        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */

        int initialMuffins = 35, numberOfMuffinsNeeded = 83;
        int remainderMuffins = numberOfMuffinsNeeded - initialMuffins;

        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */

        int willyCrayons = 1400, lucyCrayons = 290;
        int whoHasMoreCrayons = willyCrayons - lucyCrayons;

        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */

        int stickers = 10, pagesOfStickers = 22;
        int totalAmountOfStickers = stickers * pagesOfStickers;

        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */

        double cupcakes = 100, children = 8;
        double equallyShare = 100.0 / 8;

        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */

        int gingerBread = 47, tinyGlass = 6;
        int modCookes = gingerBread % tinyGlass;

        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */

        int crossiants = 59, neighbors = 8;
        int remainderOfCrossiants = 59 % 8;

        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */

        int tray = 12, targetCookes = 276;
        int numberOfPeopleThatNeedsCookes = targetCookes / tray;

        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */

        int numberOfPretzels = 480, oneServing = 12;
        int peopleServedPretzels = numberOfPretzels/ oneServing;

        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */

        int lemons = 53, boxesOfThree = 3, leftHome = 2;
        int gaveOut = (lemons - leftHome) / boxesOfThree;

        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */

        int modCarrots = 74 % 12;

        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */

        int totalTeddyBears = 98, maxBears = 7;
        int filledShelves = totalTeddyBears / maxBears;

        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */

        int picturesTotal = 480, canFit = 20;
        int howManyFilled = picturesTotal / canFit;

        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */

        int tradingBoxes = 94, fullBox = 8;
        int boxFilled = tradingBoxes / fullBox;
        int unfilledBox = tradingBoxes % fullBox;

        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

        int totalBooksReadingRoom = 210, numberOfShelves = 10;
        int shelfContain = totalBooksReadingRoom / numberOfShelves;

        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

        double crossiantsInTotal = 17, guests = 7;
        double eachReceive = crossiantsInTotal / guests;

	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a standard room in 2.15 hours, while
	    Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 standard
	    rooms?
	    Hint: Calculate the rate at which each painter can complete a room (rooms / hour), combine
	     those rates,
	    and then divide the total number of rooms to be painted by the combined rate.
	    */

        double bill = 1 / 2.15, jill = 1 / 1.9, hoursGiven = 5;
        double totalHoursBuilt = hoursGiven / (bill + jill);

	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using
	     concatenation,
		build an additional variable to hold the full name in the order of last name, first name,
		middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle
		initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle
		initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */

        String firstName = "Grace", lastName = "Hopper", middleInitial = "B", period = ".";
        String concat =  lastName + ", " + firstName + " " + middleInitial + period;

	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already
	    travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
        double totalDistance = 800.0, occupied = 537.0;
        double percentage = (occupied / totalDistance) * 100.0;
        int value = (int) percentage;
    }

}
