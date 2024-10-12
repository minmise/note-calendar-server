package org.application.notecalendarserver.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private LocalDate date;
    private Boolean isTimeIncluded;
    private Integer hours;
    private Integer minutes;
    private Long accountId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private User user;

}
