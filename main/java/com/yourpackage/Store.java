package com.yourpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {
    private List<Product> products = new ArrayList<>();
    private List<Brand> brands = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public Store() {
        // Örnek markalar ekleyin
        brands.add(new Brand("Samsung"));
        brands.add(new Brand("Apple"));
        brands.add(new Brand("Lenovo"));
    }

    public void run() {
        while (true) {
            System.out.println("1. Ürün Ekle");
            System.out.println("2. Ürün Listele");
            System.out.println("3. Ürün Sil");
            System.out.println("4. Çıkış");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Enter tuşunu temizleyin

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    listProducts();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }

    private void addProduct() {
        System.out.println("Ürün türü seçin: 1. Telefon 2. Notebook");
        int type = scanner.nextInt();
        scanner.nextLine(); // Enter tuşunu temizleyin

        System.out.println("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Enter tuşunu temizleyin

        System.out.println("Fiyat: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Enter tuşunu temizleyin

        System.out.println("İndirim: ");
        double discount = scanner.nextDouble();
        scanner.nextLine(); // Enter tuşunu temizleyin

        System.out.println("Miktar: ");
        int amount = scanner.nextInt();
        scanner.nextLine(); // Enter tuşunu temizleyin

        System.out.println("İsim: ");
        String name = scanner.nextLine();

        System.out.println("Marka: ");
        String brandName = scanner.nextLine();
        Brand brand = findBrandByName(brandName);

        if (brand == null) {
            System.out.println("Marka bulunamadı.");
            return;
        }

        if (type == 1) {
            System.out.println("Hafıza: ");
            int memory = scanner.nextInt();
            scanner.nextLine(); // Enter tuşunu temizleyin

            System.out.println("Ekran Boyutu: ");
            double screenSize = scanner.nextDouble();
            scanner.nextLine(); // Enter tuşunu temizleyin

            System.out.println("Batarya: ");
            int battery = scanner.nextInt();
            scanner.nextLine(); // Enter tuşunu temizleyin

            System.out.println("RAM: ");
            int ram = scanner.nextInt();
            scanner.nextLine(); // Enter tuşunu temizleyin

            products.add(new Phone(id, price, discount, amount, name, brand, memory, screenSize, battery, ram));
        } else if (type == 2) {
            System.out.println("Hafıza: ");
            int memory = scanner.nextInt();
            scanner.nextLine(); // Enter tuşunu temizleyin

            System.out.println("Ekran Boyutu: ");
            double screenSize = scanner.nextDouble();
            scanner.nextLine(); // Enter tuşunu temizleyin

            System.out.println("RAM: ");
            int ram = scanner.nextInt();
            scanner.nextLine(); // Enter tuşunu temizleyin

            products.add(new Notebook(id, price, discount, amount, name, brand, memory, screenSize, ram));
        } else {
            System.out.println("Geçersiz ürün türü.");
        }
    }

    private Brand findBrandByName(String name) {
        for (Brand brand : brands) {
            if (brand.getName().equalsIgnoreCase(name)) {
                return brand;
            }
        }
        return null;
    }

    private void listProducts() {
        for (Product product : products) {
            System.out.println("ID: " + product.getId());
            System.out.println("İsim: " + product.getName());
            System.out.println("Marka: " + product.getBrand().getName());
            System.out.println("Fiyat: " + product.getPrice());
            System.out.println("İndirim: " + product.getDiscount());
            System.out.println("Miktar: " + product.getAmount());
            System.out.println("-----");
        }
    }

    private void deleteProduct() {
        System.out.println("Silmek istediğiniz ürünün ID'sini girin: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Enter tuşunu temizleyin

        Product productToRemove = null;
        for (Product product : products) {
            if (product.getId() == id) {
                productToRemove = product;
                break;
            }
        }

        if (productToRemove != null) {
            products.remove(productToRemove);
            System.out.println("Ürün silindi.");
        } else {
            System.out.println("Ürün bulunamadı.");
        }
    }
}
