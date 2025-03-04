Factory Design Pattern: Implementation in Java

Factory Design Pattern
Factory Design Pattern | The Code Bean
The Factory Pattern is a powerful design pattern that simplifies object creation, enhances code organization, and promotes maintainability. By abstracting the creation process and delegating it to subclasses or specialized factories, it enables flexible, extensible, and clean code.

Factory Pattern
At its core, the Factory Pattern is a creational design pattern that abstracts the process of object creation. It allows you to create objects without specifying their exact types, delegating the responsibility to subclasses or specialized factory classes. This abstraction promotes flexibility and code maintainability.

Understanding the Factory Pattern Components
Before we dive into implementation details, let’s get acquainted with the primary components of the Factory Pattern:

Product: This is an interface or abstract class that defines the type of objects to be created.
Concrete Product: These are the classes that implement the Product interface or extend the Product abstract class. They represent the actual objects created by the factory.
Factory: This is an interface or abstract class responsible for declaring the factory method, which creates objects of the Product type.
Concrete Factory: These are the classes that implement the Factory interface or extend the Factory abstract class. They override the factory method to produce specific instances of Product.
Implementing the Factory Pattern: A Vehicle Example
In our example, we’ll create a food ordering system that allows customers to order different types of dishes, such as pizza and sushi, using the Factory Pattern.

Step 1: Define the Product Interface
// Product interface
interface Dish {
void prepare();
void serve();
}
Step 2: Create Concrete Products
// Concrete products
class Pizza implements Dish {
@Override
public void prepare() {
System.out.println("Preparing pizza...");
}

    @Override
    public void serve() {
        System.out.println("Serving pizza...");
    }

}

class Sushi implements Dish {
@Override
public void prepare() {
System.out.println("Preparing sushi...");
}

    @Override
    public void serve() {
        System.out.println("Serving sushi...");
    }

}
Step 3: Define the Factory Interface
// Factory interface
interface DishFactory {
Dish createDish();
}
Step 4: Create Concrete Factories
// Concrete factories
class PizzaFactory implements DishFactory {
@Override
public Dish createDish() {
return new Pizza();
}
}

class SushiFactory implements DishFactory {
@Override
public Dish createDish() {
return new Sushi();
}
}
Step 5: Client Code
Now, let’s use the Factory Pattern to create instances of vehicles without specifying their concrete types:

public class PizzaMain{
public static void main(String[] args) {
// Order a pizza using the PizzaFactory
DishFactory pizzaFactory = new PizzaFactory();
Dish pizza = pizzaFactory.createDish();
pizza.prepare();
pizza.serve();

        // Order sushi using the SushiFactory
        DishFactory sushiFactory = new SushiFactory();
        Dish sushi = sushiFactory.createDish();
        sushi.prepare();
        sushi.serve();
    }

}
Pros and Cons of the Factory Pattern
Pros:
The Factory Pattern encapsulates object creation logic, ensuring it remains hidden from client code. This promotes cleaner and more maintainable code.
It allows for the addition of new object types (Concrete Products) without altering existing code. New Concrete Factories can be introduced for creating these objects, enhancing code extensibility.
By centralizing object creation in factories, you can reuse the same factory logic across multiple parts of your application, reducing redundancy.
The Factory Pattern enforces uniform object creation following a common interface (Product). This consistency simplifies code maintenance and minimizes errors.
The Factory Pattern plays a significant role in dependency injection frameworks, allowing for the creation and management of dependencies.
Cons:
Implementing factories can raise the overall complexity of the codebase.
The Factory Pattern introduces an extra layer of abstraction, potentially confusing developers unfamiliar with the pattern. Adequate documentation and training may be necessary.
While client code is decoupled from Concrete Products, it remains tightly coupled with Concrete Factories. Significant changes in factory logic can impact multiple parts of the code.
The Factory Pattern is useful when object creation is complex or variable. In situations with straightforward creation processes and little variability, using the Factory Pattern may introduce unnecessary complexity.
Like any design pattern, the Factory Pattern can be overused. It’s essential to assess whether the pattern is the right solution for your specific problem.
Conclusion
In this article, we’ve explored the Factory Pattern in the context of a food ordering system. Keep in mind that this is just one of many applications for this pattern. Whether you’re building a complex software system or a small application, understanding and applying design patterns like the Factory Pattern can lead to more organized, maintainable, and scalable code.
