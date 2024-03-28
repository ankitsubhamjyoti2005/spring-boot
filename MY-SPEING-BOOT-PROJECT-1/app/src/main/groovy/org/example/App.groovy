package org.example

import org.springframework.boot.SpringApplication

class App {
    String getGreeting() {
        return 'Hello World!'
    }
    static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
