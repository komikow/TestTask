package by.komikow.demo.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private String message;
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

}
