
classDiagram
    direction LR

    class ProductController {
        -ProductService : productService
        +getAllProducts() List~Product~
        +getProductById(Long id) Product
        +addProduct(Product product) Product
        +deleteProduct(Long id) void
        +search(String name) List~Product~
    }

    class ProductService {
        -List~Product~ : products
        -Long : nextId
        +getAllProducts() List~Product~
        +addProduct(Product product) Product
        +getProductById(Long id) Optional~Product~
        +deleteProduct(Long id) void
        +findByName(String name) List~Product~
    }

    class Product {
        -Long : id
        -String : name
        -Double : price
        +Product()
        +Product(Long id, String name, Double price)
        +getId() Long
        +getName() String
        +getPrice() Double
        +setName(String name) void
        +setPrice(Double price) void
        +setId(Long aLong) void
    }

    ProductController ..> ProductService
    ProductService --> Product
