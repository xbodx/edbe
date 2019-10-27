package ru.kasovsky.edbe.h2.dto;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.jsondoc.core.annotation.ApiObject;
import org.jsondoc.core.annotation.ApiObjectField;
import ru.kasovsky.edbe.h2.doc.Consts;
import ru.kasovsky.edbe.h2.res.SmallResource;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiObject(name = SmallResource.TAG, group = Consts.GROUP_TEST, description = SmallResource.DESC)
public class SmallCreateDto {

    @ApiObjectField(required = true, order = 1)
    private UUID uuid;

    @Length(min = 3, max = 20)
    @ApiObjectField(required = true, order = 2)
    private String name;

    @ApiObjectField(required = true, order = 3)
    private String data;
}
