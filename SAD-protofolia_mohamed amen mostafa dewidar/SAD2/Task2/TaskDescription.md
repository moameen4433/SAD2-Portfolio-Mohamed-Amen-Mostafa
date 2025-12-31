# Task Description

This project implements the **Strategy Design Pattern** to handle
multiple payment methods.

## Includes

-   `PayStrategy` interface defining payment behavior.
-   Concrete strategies:
    -   `PayByCreditCard`
    -   `PayByPayPal`
-   `CreditCard` class storing card information.
-   `Order` class that uses a selected payment strategy.
-   `Demo` class demonstrating choosing and applying a payment strategy.
-   `OrderTests.java` for basic testing of order and payment flow.

## Goal

To understand how to separate algorithms from the object that uses them,
making the system flexible, extensible, and easy to maintain.
