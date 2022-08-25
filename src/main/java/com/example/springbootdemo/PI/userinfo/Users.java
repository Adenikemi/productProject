package com.example.springbootdemo.PI.userinfo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity

public class Users {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long Id;
   private String Firstname;
   private String Lastname;
   private String Username;
   private String Password;

   @ManyToMany
   @JoinTable(name ="Users_Product", joinColumns = @JoinColumn(name = "Users_id"),
        inverseJoinColumns = @JoinColumn(name = "Product_id"))
   private Set<ProductDetails> productDetails = new HashSet<>();

   public Users(){
   }
   public Users(String firstname, String lastname, String username, String password) {
      Firstname = firstname;
      Lastname = lastname;
      Username = username;
      Password = password;
   }

   public long getId() {
      return Id;
   }

   public void setId(long id) {
      Id = id;
   }

   public String getFirstname() {
      return Firstname;
   }

   public void setFirstname(String firstname) {
      Firstname = firstname;
   }

   public String getLastname() {
      return Lastname;
   }

   public void setLastname(String lastname) {
      Lastname = lastname;
   }

   public String getUsername() {
      return Username;
   }

   public void setUsername(String username) {
      Username = username;
   }

   public String getPassword() {
      return Password;
   }

   public void setPassword(String password) {
      Password = password;
   }

   public Set<ProductDetails> getProductDetails() {
      return productDetails;
   }

   public void setProductDetails(Set<ProductDetails> productDetails) {
      this.productDetails = productDetails;
   }

   @Override
   public String toString() {
      return "Users{" +
              "Id=" + Id +
              ", Firstname='" + Firstname + '\'' +
              ", Lastname='" + Lastname + '\'' +
              ", Username='" + Username + '\'' +
              ", Password='" + Password + '\'' +
              '}';
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Users users = (Users) o;
      return Objects.equals(Id, users.Id);
   }

   @Override
   public int hashCode() {
      return 0;
   }


}
