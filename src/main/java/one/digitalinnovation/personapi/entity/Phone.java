package one.digitalinnovation.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //ira gerar id automaticamente com o tipo identidade
    private Long id;

    @Enumerated(EnumType.STRING) //marcação de campo como ENUM e do tipo string
    @Column(nullable=false) //marcação para o banco de dados não permitir nulo
    private PhoneType type;

    @Column(nullable=false)
    private String number;
}
