package com.alura.forohub.domain.topico;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(

        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fecha_creacion,
        Boolean status,
        String autor,
        Curso nombre_curso
) {
}
