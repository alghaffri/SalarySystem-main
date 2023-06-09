package com.codeline.sampleProject.RequestObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetAccountRequstObject {
    String bankName;

    Integer accountNumber;

    String bankBranch;
}
