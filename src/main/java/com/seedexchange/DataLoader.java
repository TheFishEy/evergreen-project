package com.seedexchange;

import com.seedexchange.model.SeedBox;
import com.seedexchange.model.SeedType;
import com.seedexchange.repository.SeedBoxRepository;
import com.seedexchange.repository.SeedTypeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final SeedTypeRepository seedTypeRepository;
    private final SeedBoxRepository seedBoxRepository;

    public DataLoader(SeedTypeRepository seedTypeRepository, SeedBoxRepository seedBoxRepository) {
        this.seedTypeRepository = seedTypeRepository;
        this.seedBoxRepository = seedBoxRepository;
    }

    @Override
    public void run(String... args) {
        // ===== ROW A =====

        // A1 - Cilantro
        SeedType cilantro = new SeedType(
                "Cilantro",
                "A fragrant herb often used in many dishes.",
                "0.25 inch",
                "Full sun to partial sun",
                "Keep soil moist",
                "6 inches",
                10,
                45
        );
        seedTypeRepository.save(cilantro);

        SeedBox boxA1 = new SeedBox("A1", 1, 1, 3, "Ready for pickup", cilantro);
        seedBoxRepository.save(boxA1);


        // A2 - Basil
        SeedType basil = new SeedType(
                "Basil",
                "A warm-weather herb commonly used in sauces and salads.",
                "0.25 inch",
                "Full sun",
                "Water regularly",
                "10 inches",
                7,
                60
        );
        seedTypeRepository.save(basil);

        SeedBox boxA2 = new SeedBox("A2", 2, 1, 3, "Ready for pickup", basil);
        seedBoxRepository.save(boxA2);


        // A3 - Parsley
        SeedType parsley = new SeedType(
                "Parsley",
                "A leafy herb used fresh in many savory dishes.",
                "0.25 inch",
                "Full sun to partial sun",
                "Keep soil evenly moist",
                "8 inches",
                14,
                75
        );
        seedTypeRepository.save(parsley);


        SeedBox boxA3 = new SeedBox("A3", 3, 1, 3, "Ready for pickup", parsley);
        seedBoxRepository.save(boxA3);


        // A4 - Thyme
        SeedType thyme = new SeedType(
                "Thyme",
                "A woody herb with small aromatic leaves.",
                "0.25 inch",
                "Full sun",
                "Water lightly",
                "8 inches",
                14,
                90
        );
        seedTypeRepository.save(thyme);

        SeedBox boxA4 = new SeedBox("A4", 4, 1, 3, "Ready for pickup", thyme);
        seedBoxRepository.save(boxA4);


        // A5 - Oregano
        SeedType oregano = new SeedType(
                "Oregano",
                "A hardy herb often used in Mediterranean cooking.",
                "0.25 inch",
                "Full sun",
                "Water moderately",
                "10 inches",
                10,
                80
        );
        seedTypeRepository.save(oregano);

        SeedBox boxA5 = new SeedBox("A5", 5, 1, 3, "Ready for pickup", oregano);
        seedBoxRepository.save(boxA5);


        // A6 - Dill
        SeedType dill = new SeedType(
                "Dill",
                "A feathery herb often paired with fish and pickles.",
                "0.5 inch",
                "Full sun",
                "Keep soil lightly moist",
                "12 inches",
                10,
                60
        );
        seedTypeRepository.save(dill);

        SeedBox boxA6 = new SeedBox("A6", 6, 1, 3, "Ready for pickup", dill);
        seedBoxRepository.save(boxA6);


        // A7 - Chives
        SeedType chives = new SeedType(
                "Chives",
                "A mild onion-flavored herb with hollow green leaves.",
                "0.25 inch",
                "Full sun",
                "Water regularly",
                "6 inches",
                14,
                80
        );
        seedTypeRepository.save(chives);

        SeedBox boxA7 = new SeedBox("A7", 7, 1, 3, "Ready for pickup", chives);
        seedBoxRepository.save(boxA7);


        // A8 - Mint
        SeedType mint = new SeedType(
                "Mint",
                "A fast-growing herb with a cool, refreshing flavor.",
                "0.25 inch",
                "Partial sun",
                "Keep soil moist",
                "12 inches",
                10,
                75
        );
        seedTypeRepository.save(mint);

        SeedBox boxA8 = new SeedBox("A8", 8, 1, 3, "Ready for pickup", mint);
        seedBoxRepository.save(boxA8);


        // A9 - Sage
        SeedType sage = new SeedType(
                "Sage",
                "An earthy herb with soft gray-green leaves.",
                "0.25 inch",
                "Full sun",
                "Water lightly",
                "12 inches",
                14,
                85
        );
        seedTypeRepository.save(sage);

        SeedBox boxA9 = new SeedBox("A9", 9, 1, 3, "Ready for pickup", sage);
        seedBoxRepository.save(boxA9);
        

        // ===== COLUMN B =====

        // B1 - Dwarf Grey Sugar Snap Peas
        SeedType peas = new SeedType(
                "Dwarf Grey Sugar Snap Peas",
                "An edible pod pea variety with sweet flavor.",
                "1 inch",
                "Full sun",
                "Keep soil evenly moist",
                "2 inches",
                10,
                65
        );
        seedTypeRepository.save(peas);

        SeedBox boxB1 = new SeedBox("B1", 1, 2, 3, "Ready for pickup", peas);
        seedBoxRepository.save(boxB1);


        // B2 - Green Beans
        SeedType greenBeans = new SeedType(
                "Green Beans",
                "A productive bean plant that grows crisp green pods.",
                "1 inch",
                "Full sun",
                "Water regularly",
                "4 inches",
                8,
                55
        );
        seedTypeRepository.save(greenBeans);

        SeedBox boxB2 = new SeedBox("B2", 2, 2, 3, "Ready for pickup", greenBeans);
        seedBoxRepository.save(boxB2);


        // B3 - Carrots
        SeedType carrots = new SeedType(
                "Carrots",
                "A root vegetable that grows best in loose soil.",
                "0.25 inch",
                "Full sun",
                "Keep soil evenly moist",
                "2 inches",
                14,
                70
        );
        seedTypeRepository.save(carrots);

        SeedBox boxB3 = new SeedBox("B3", 3, 2, 3, "Ready for pickup", carrots);
        seedBoxRepository.save(boxB3);


        // B4 - Radishes
        SeedType radishes = new SeedType(
                "Radishes",
                "A quick-growing root crop with crisp texture.",
                "0.5 inch",
                "Full sun",
                "Water regularly",
                "2 inches",
                5,
                30
        );
        seedTypeRepository.save(radishes);

        SeedBox boxB4 = new SeedBox("B4", 4, 2, 3, "Ready for pickup", radishes);
        seedBoxRepository.save(boxB4);


        // B5 - Lettuce
        SeedType lettuce = new SeedType(
                "Lettuce",
                "A cool-season leafy green great for salads.",
                "0.25 inch",
                "Full sun to partial sun",
                "Keep soil moist",
                "6 inches",
                7,
                45
        );
        seedTypeRepository.save(lettuce);

        SeedBox boxB5 = new SeedBox("B5", 5, 2, 3, "Ready for pickup", lettuce);
        seedBoxRepository.save(boxB5);


        // B6 - Spinach
        SeedType spinach = new SeedType(
                "Spinach",
                "A nutrient-rich leafy green for cool weather.",
                "0.5 inch",
                "Full sun to partial sun",
                "Keep soil moist",
                "4 inches",
                7,
                40
        );
        seedTypeRepository.save(spinach);

        SeedBox boxB6 = new SeedBox("B6", 6, 2, 3, "Ready for pickup", spinach);
        seedBoxRepository.save(boxB6);


        // B7 - Kale
        SeedType kale = new SeedType(
                "Kale",
                "A hardy leafy green with textured leaves.",
                "0.5 inch",
                "Full sun",
                "Water consistently",
                "12 inches",
                7,
                60
        );
        seedTypeRepository.save(kale);

        SeedBox boxB7 = new SeedBox("B7", 7, 2, 3, "Ready for pickup", kale);
        seedBoxRepository.save(boxB7);


        // B8 - Arugula
        SeedType arugula = new SeedType(
                "Arugula",
                "A peppery leafy green that grows quickly.",
                "0.25 inch",
                "Full sun to partial sun",
                "Keep soil moist",
                "4 inches",
                5,
                35
        );
        seedTypeRepository.save(arugula);

        SeedBox boxB8 = new SeedBox("B8", 8, 2, 3, "Ready for pickup", arugula);
        seedBoxRepository.save(boxB8);


        // B9 - Swiss Chard
        SeedType swissChard = new SeedType(
                "Swiss Chard",
                "A colorful leafy green with edible stems.",
                "0.5 inch",
                "Full sun",
                "Water regularly",
                "10 inches",
                7,
                55
        );
        seedTypeRepository.save(swissChard);

        SeedBox boxB9 = new SeedBox("B9", 9, 2, 3, "Ready for pickup", swissChard);
        seedBoxRepository.save(boxB9);

        // ===== COLUMN C =====

        // C1 - Tomato
        SeedType tomato = new SeedType(
                "Tomato",
                "A classic garden fruit used in countless dishes.",
                "0.25 inch",
                "Full sun",
                "Water deeply and regularly",
                "24 inches",
                7,
                80
        );
        seedTypeRepository.save(tomato);

        SeedBox boxC1 = new SeedBox("C1", 1, 3, 3, "Ready for pickup", tomato);
        seedBoxRepository.save(boxC1);


        // C2 - Cherry Tomato
        SeedType cherryTomato = new SeedType(
                "Cherry Tomato",
                "A small sweet tomato that grows in clusters.",
                "0.25 inch",
                "Full sun",
                "Water deeply and regularly",
                "24 inches",
                7,
                70
        );
        seedTypeRepository.save(cherryTomato);

        SeedBox boxC2 = new SeedBox("C2", 2, 3, 3, "Ready for pickup", cherryTomato);
        seedBoxRepository.save(boxC2);


        // C3 - Bell Pepper
        SeedType bellPepper = new SeedType(
                "Bell Pepper",
                "A sweet pepper that grows in warm conditions.",
                "0.25 inch",
                "Full sun",
                "Keep soil evenly moist",
                "18 inches",
                10,
                75
        );
        seedTypeRepository.save(bellPepper);

        SeedBox boxC3 = new SeedBox("C3", 3, 3, 3, "Ready for pickup", bellPepper);
        seedBoxRepository.save(boxC3);


        // C4 - Jalapeño
        SeedType jalapeno = new SeedType(
                "Jalapeño",
                "A medium-heat pepper often used fresh or pickled.",
                "0.25 inch",
                "Full sun",
                "Water regularly",
                "18 inches",
                10,
                80
        );
        seedTypeRepository.save(jalapeno);

        SeedBox boxC4 = new SeedBox("C4", 4, 3, 3, "Ready for pickup", jalapeno);
        seedBoxRepository.save(boxC4);


        // C5 - Cucumber
        SeedType cucumber = new SeedType(
                "Cucumber",
                "A vining plant that produces crisp refreshing fruits.",
                "1 inch",
                "Full sun",
                "Water consistently",
                "12 inches",
                7,
                60
        );
        seedTypeRepository.save(cucumber);

        SeedBox boxC5 = new SeedBox("C5", 5, 3, 3, "Ready for pickup", cucumber);
        seedBoxRepository.save(boxC5);


        // C6 - Zucchini
        SeedType zucchini = new SeedType(
                "Zucchini",
                "A fast-growing summer squash plant.",
                "1 inch",
                "Full sun",
                "Water deeply",
                "24 inches",
                7,
                55
        );
        seedTypeRepository.save(zucchini);

        SeedBox boxC6 = new SeedBox("C6", 6, 3, 3, "Ready for pickup", zucchini);
        seedBoxRepository.save(boxC6);


        // C7 - Sunflower
        SeedType sunflower = new SeedType(
                "Sunflower",
                "A tall flowering plant that attracts pollinators.",
                "1 inch",
                "Full sun",
                "Water moderately",
                "12 inches",
                7,
                80
        );
        seedTypeRepository.save(sunflower);

        SeedBox boxC7 = new SeedBox("C7", 7, 3, 3, "Ready for pickup", sunflower);
        seedBoxRepository.save(boxC7);


        // C8 - Marigold
        SeedType marigold = new SeedType(
                "Marigold",
                "A bright flower often planted near vegetables.",
                "0.25 inch",
                "Full sun",
                "Water moderately",
                "8 inches",
                5,
                50
        );
        seedTypeRepository.save(marigold);

        SeedBox boxC8 = new SeedBox("C8", 8, 3, 3, "Ready for pickup", marigold);
        seedBoxRepository.save(boxC8);


        // C9 - Lavender
        SeedType lavender = new SeedType(
                "Lavender",
                "A fragrant flowering herb with purple blooms.",
                "0.25 inch",
                "Full sun",
                "Water lightly",
                "12 inches",
                14,
                90
        );
        seedTypeRepository.save(lavender);

        SeedBox boxC9 = new SeedBox("C9", 9, 3, 3, "Ready for pickup", lavender);
        seedBoxRepository.save(boxC9);
        }

}