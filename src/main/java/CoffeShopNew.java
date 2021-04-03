public class CoffeShopNew {
    public class Coffee {
        public void grindCoffee() {
            System.out.println("перемалываем кофе");
            // перемалываем кофе
        }

        public void makeCoffee() {
            System.out.println("делаем кофе");
            // делаем кофе
        }

        public void pourIntoCup() {
            System.out.println("наливаем в чашку");
            // наливаем в чашку
        }
    }

    public class Americano extends Coffee {
        @Override
        public void pourIntoCup() {
            System.out.println("EEEналиваем в чашку");
            // наливаем в чашку
        }
    }

    public class Cappuccino extends Coffee {
    }

    public class CaffeLatte extends Coffee {
        @Override
        public void pourIntoCup() {
            System.out.println("LLLLLLLналиваем в чашку");
            // наливаем в чашку
        }
    }

    public class Espresso extends Coffee {
    }

    public enum CoffeeType {
        ESPRESSO,
        AMERICANO,
        CAFFE_LATTE,
        CAPPUCCINO
    }

//    public class CoffeeShop {
//
//        private final SimpleCoffeeFactory coffeeFactory;
//
//        public CoffeeShop(SimpleCoffeeFactory coffeeFactory) {
//            this.coffeeFactory = coffeeFactory;
//        }
//
//        public Coffee orderCoffee(CoffeeType type) {
//            Coffee coffee = coffeeFactory.createCoffee(type);
//            coffee.grindCoffee();
//            coffee.makeCoffee();
//            coffee.pourIntoCup();
//
//            System.out.println("Вот ваш кофе! Спасибо, приходите еще!");
//            return coffee;
//        }
//    }

    public static void main(String[] args) {
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee am = factory.createCoffee(CoffeeType.AMERICANO);
        Coffee latte = factory.createCoffee(CoffeeType.CAFFE_LATTE);

        am.grindCoffee();
        am.makeCoffee();
        am.pourIntoCup();
        latte.grindCoffee();
        latte.makeCoffee();
        latte.pourIntoCup();
    }
}