package com.riffrain.dhlottery.module.lotto.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderLottoReqDTO {
    private List<LottoDataDTO> lottoData;


}
