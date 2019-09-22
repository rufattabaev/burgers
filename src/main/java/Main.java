public class Main {
    public static void main(String[] args) {
        Burger longerBBQ = new Burger();
        Burger chisburger = new Burger();

        longerBBQ.id = 1018;
        longerBBQ.pictureUrl = "https:// www.longer-picture.com";
        longerBBQ.name = "Лонгер BBQ";
        longerBBQ.weightInGram = 107;
        longerBBQ.composition = "Сочная курочка, маринованные огурчики, лук и аппетитный соус барбекю! Спешите попробовать!";
        longerBBQ.calories = 236;
        longerBBQ.proteinsInGram = 9.7;
        longerBBQ.fatsInGram = 7.1;
        longerBBQ.carbohydratesInGram = 33.3;

        chisburger.id = 2336 ;
        chisburger.pictureUrl = "https://www.chisburger-picture.com";
        chisburger.name = "Чизбургер";
        chisburger.weightInGram = 167;
        chisburger.composition = "Пряный горчичный соус, кетчуп, сочные стрипсы в оригинальной панировке, лук, сыр Чеддер, огурцы на пшеничной булочке с кукурузной посыпкой.";
        chisburger.calories = 237;
        chisburger.proteinsInGram = 13.2;
        chisburger.fatsInGram = 8.6;
        chisburger.carbohydratesInGram = 26.6;
    }
}
