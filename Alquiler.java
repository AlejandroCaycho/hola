package hct.caycho.carlos.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table("alquiler")
public class Alquiler {

    @Id
    private Long id;
    @Column("clienteid")
    private Integer clienteId;
    private Integer dias;
    @JsonFormat(pattern="yyyy-MM-dd")
    @Column("fechainicio")
    private LocalDate fechaInicio;

    @JsonFormat(pattern="yyyy-MM-dd")
    @Column("fechafin")
    private LocalDate fechaFin;
    private Integer total;
    @Builder.Default
    private Boolean estado = true;
}