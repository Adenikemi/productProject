package com.example.springbootdemo.PI.userinfo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity

public class ProductDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String Product;
    private int Price;
    private String ExtraDescription;

    @ManyToMany
    private Set<Users> users = new HashSet<>();

    public ProductDetails() {
    }

    public ProductDetails(String product, int price, String extraDescription) {
        Product = product;
        Price = price;
        ExtraDescription = extraDescription;
    }


    public String getProduct() {
        return Product;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        this.Id = id;
    }

    public void setProduct(String product) {
        Product = product;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getExtraDescription() {
        return ExtraDescription;
    }

    public void setExtraDescription(String extraDescription) {
        ExtraDescription = extraDescription;
    }

    public Set<Users> getUsers() {
        return users;
    }

    public void setUsers(Set<Users> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDetails that = (ProductDetails) o;
        return Objects.equals(Id, that.Id);
    }

    @Override
    public int hashCode() {
        return 0;
    }


    @Override
    public String toString() {
        return "ProductDetails{" +
                "Id=" + Id +
                ", Product='" + Product + '\'' +
                ", Price=" + Price +
                ", ExtraDescription='" + ExtraDescription + '\'' +
                '}';
    }


}
