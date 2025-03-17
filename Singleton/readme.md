Singleton Design Pattern: Implementation in Java

Singleton Design Pattern
Singleton Design Pattern | The Code Bean
While developing software applications, sometimes we need to ensure that a class has only one instance and that instance is easily accessible from anywhere in our application. This is where the Singleton Design Pattern roles comes to the rescue. In this blog post, we’ll dive deep into the Singleton pattern, understand its importance, and walk through Java code examples to implement it effectively.

Building a Singleton in Java
Let’s see how this works in Java with a practical example.

Step 1: Private Constructor
The first step in creating a Singleton is to make the constructor of the class private. This prevents other classes from directly creating instances of the Singleton class.

public class Singleton {
private static Singleton instance;

    // Private constructor
    private Singleton() {
        // Initialization code, if needed
    }

}
Step 2: Static Instance
Next, we create a static method that provides access to the single instance of the class. If an instance doesn’t exist, it creates one; otherwise, it returns the existing instance.

public class Singleton {
private static Singleton instance;

    private Singleton() {
        // Initialization code, if needed
    }

    // Static method to get the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
Step 3: Using the Singleton
Now, you can use the Singleton throughout your application:

public class Main {
public static void main(String[] args) {
// Get the Singleton instance
Singleton singleton = Singleton.getInstance();

        // Use the Singleton
        // ...
    }

}
Building a Thread-Safe Singleton in Java
Let’s dive into a Java code example to create a thread-safe Singleton:

Step 1: Private Constructor
The first step is to make the constructor of the class private. This prevents other classes from directly creating instances of the Singleton class.

public class Singleton {
private static Singleton instance;

    // Private constructor
    private Singleton() {
        // Initialization code, if needed
    }

}
Step 2: Static Instance with Double-Checked Locking
We create a static method that provides access to the single instance of the class. We use double-checked locking to ensure thread safety. This technique minimizes synchronization overhead by checking if the instance is null before entering a synchronized block.

public class Singleton {
private static volatile Singleton instance;

    private Singleton() {
        // Initialization code, if needed
    }

    // Static method to get the instance
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
Step 3: Using the Singleton
Now, you can use the Singleton throughout your application:

public class Main {
public static void main(String[] args) {
// Get the Singleton instance
Singleton singleton = Singleton.getInstance();

        // Use the Singleton
        // ...
    }

}
Conclusion
The Singleton Design Pattern ensures that there’s only one instance of a class in your application, promoting resource efficiency and providing global accessibility. It’s a valuable tool when you need to manage shared resources, settings, or functionality.
