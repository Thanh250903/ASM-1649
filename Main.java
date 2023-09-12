
import implementations.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            MyQueue queue = new MyQueue();
            MyStack stack = new MyStack();
            int choice = 0;

            do {
                System.out.println("---------------------Main menu---------------------------");
                System.out.println("1. Send the message");
                System.out.println("2. Add the message from queue to stack");
                System.out.println("3. Show all message");
                System.out.println("4. Delete message");
                System.out.println("5. Exit");
                System.out.println("Enter your choice:");
                long startTime = System.nanoTime();
                long endTime;
                long duration;

                try {
                    choice = sc.nextInt();
                    sc.nextLine();
                } catch (Exception e) {
                    System.out.println("Invalid choice " + e);
                    sc.nextLine();
                    break;
                }
                switch (choice) {
                    case 1:
                        System.out.println("Enter your message to send: ");
                        startTime = System.nanoTime();
                        String text = sc.nextLine();
                        if (text.length() >= 250) {
                            System.out.println("Your message is limited, \n PLEASE TRY AGAIN!!!");
                            break;
                        }
                        queue.enQueue(text);
                        System.out.println("Message sent successfully!");
                        endTime = System.nanoTime();
                        duration = (endTime - startTime);
                        System.out.println(duration + "ns");
                        break;
                    case 2:
                        startTime = System.nanoTime();
                        System.out.println("Move message to Stack");
                        if (queue.isEmpty()) {
                            System.out.println("Queue is empty, you can't add to Stack");
                        }
                        stack.pushMessage(queue.deQueue());
                        System.out.println("Move to Stack successfully");
                        endTime = System.nanoTime();
                        duration = (endTime - startTime);
                        System.out.println(duration + "ns");
                        break;
                    case 3:
                        startTime = System.nanoTime();
                        System.out.println("Display message");
                        if (stack.isEmpty()) {
                            System.out.println("Stack is empty, this can't display");
                            break;
                        }
                        stack.Display();
                        endTime = System.nanoTime();
                        duration = (endTime - startTime);
                        System.out.println(duration + "ns");
                        break;
                    case 4:
                        startTime = System.nanoTime();
                        System.out.println("Delete message");
                        if (stack.isEmpty()) {
                            System.out.println("Stack is empty, this can't delete");
                            break;
                        }
                        stack.popMessage();
                        System.out.println("Delete message successfully");
                        endTime = System.nanoTime();
                        duration = (endTime - startTime);
                        System.out.println(duration + "ns");
                        break;
                    case 5:
                        System.out.println("Exiting ...............................................\nThank you");
                        endTime = System.nanoTime();
                        duration = (endTime - startTime);
                        System.out.println(duration + "ns");
                        break;
                    default:
                        System.out.print("Please enter choice again! \n");
                        break;
                }
            } while (choice != 5);


        }

    }
}

