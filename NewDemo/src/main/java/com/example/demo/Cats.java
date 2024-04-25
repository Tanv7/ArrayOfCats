package com.example.demo;

public class Cats {
        private int id;
        private String name;
        private String color;

        private double age;

        public Cats (int id, String name,String color, double age) throws Exception {
            if (age < 0)
                throw new Exception("такого возраста не существует");
            if (age >25)
                throw new Exception("такого возраста не существует");

            this.id = id;
            this.name = name;
            this.color = color;
            this.age= age;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getAge() {
            return age;
        }

        public void set(double age) {
            this.age = age;
        }
    }

