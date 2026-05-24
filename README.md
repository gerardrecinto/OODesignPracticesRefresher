# OOP & Design Patterns Reference

Notes and Java code examples from studying object-oriented design principles and the Gang of Four design patterns.

![Java](https://img.shields.io/badge/Java-11%2B-007396?logo=openjdk&logoColor=white)
![Design Patterns](https://img.shields.io/badge/GoF-23%20Patterns-orange)
![SOLID](https://img.shields.io/badge/SOLID-5%20Principles-blue)

---

## SOLID Principles

| Principle | Description | Violation sign |
|---|---|---|
| **S** — Single Responsibility | One class, one reason to change | "God class" doing everything |
| **O** — Open/Closed | Open for extension, closed for modification | `if instanceof` chains |
| **L** — Liskov Substitution | Subtypes must be substitutable for their base | Subclass throws on inherited method |
| **I** — Interface Segregation | No forced implementation of unused methods | Fat interface with many irrelevant methods |
| **D** — Dependency Inversion | Depend on abstractions, not concretions | `new ConcreteService()` inside business logic |

---

## Creational Patterns

| Pattern | Intent | When to use |
|---|---|---|
| **Singleton** | Single instance across the app | Shared config, logger, connection pool |
| **Factory Method** | Subclass decides which object to create | Framework needs to defer instantiation |
| **Abstract Factory** | Families of related objects | UI toolkit that must be consistent (dark/light theme) |
| **Builder** | Construct complex objects step by step | Object with many optional parameters |
| **Prototype** | Clone existing objects | Expensive construction, need independent copies |

---

## Structural Patterns

| Pattern | Intent | When to use |
|---|---|---|
| **Adapter** | Make incompatible interfaces work together | Integrating third-party library with your interface |
| **Decorator** | Add behavior without subclassing | Wrapping I/O streams, middleware chains |
| **Facade** | Simplified interface to a complex subsystem | Hiding library complexity behind one entry point |
| **Composite** | Tree structures of objects | File system, UI component hierarchy |
| **Proxy** | Placeholder controlling access | Lazy loading, access control, caching |
| **Bridge** | Decouple abstraction from implementation | Cross-platform rendering (Shape + Renderer) |
| **Flyweight** | Share state across many fine-grained objects | Characters in a text editor, game sprites |

---

## Behavioral Patterns

| Pattern | Intent | When to use |
|---|---|---|
| **Observer** | Notify many objects when one changes | Event systems, MVC model → view updates |
| **Strategy** | Swap algorithms at runtime | Sorting, payment methods, compression |
| **Command** | Encapsulate requests as objects | Undo/redo, job queues, macro recording |
| **Iterator** | Traverse a collection without exposing its structure | Custom collection types |
| **Template Method** | Skeleton algorithm with customizable steps | Data mining pipelines, game loops |
| **Chain of Responsibility** | Pass request along a handler chain | Middleware, request filtering |
| **State** | Object behaves differently based on internal state | Vending machine, order lifecycle |
| **Mediator** | Centralize communication between objects | Chat rooms, air traffic control |
| **Memento** | Capture and restore object state | Undo history, checkpointing |
| **Visitor** | Add operations without modifying classes | AST transformations, export formats |
| **Interpreter** | Grammar for a language | SQL parsing, config DSLs |

---

## Quick reference: pattern vs. technique

```
Composition over inheritance       → prefer has-a over is-a
Program to an interface            → depend on abstractions (DIP)
Encapsulate what varies            → Strategy, Factory, Decorator
Favor open-closed extension        → Template Method, Observer, Decorator
```

---

## Resources

- *Design Patterns: Elements of Reusable OO Software* — Gamma, Helm, Johnson, Vlissides (GoF)
- *Head First Design Patterns* — Freeman & Robson
- *Clean Code* — Robert C. Martin
