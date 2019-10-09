package ru.example.JPATestProject.entities;

import com.sun.istack.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

import static lombok.AccessLevel.PRIVATE;

/**
 * Created by Admin on 09.10.2019.
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = PRIVATE)
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @NotNull
            @Size(
                 min = 0,
                    max = 10,
                    message =
                            "This value must be contains 10 or " +
                                    "min symbol"
            )
    String street;

    int numberHouse;

    String corpus;

    int numberAppartament;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY)
    User user;
}
