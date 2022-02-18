package br.com.zup.Investimento.Services;

import br.com.zup.Investimento.dtos.CarteiraDTO;
import br.com.zup.Investimento.dtos.InvestimentoDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvestimentoService {
    private List<InvestimentoDTO> investimentosDTO = new ArrayList<>();
    private List<CarteiraDTO> respostaInvestimento = new ArrayList<>();

    public CarteiraDTO salvarInvestimento(InvestimentoDTO novoInvestimento){
        CarteiraDTO carteiraDTO = investimentosDTO.add(novoInvestimento.getValorInvestido());
        return carteiraDTO;
    }

    public void salvarInvestimento(CarteiraDTO novoInvestimento) {
        respostaInvestimento.add(novoInvestimento);
    }

    public List<CarteiraDTO> exibirInvestimentos() {
        return respostaInvestimento;
    }

    public double calcularMontante(InvestimentoDTO novoInvestimento) {
        double valorTotal = novoInvestimento.getValorInvestido() * Math.pow(1 + novoInvestimento.getRisco().getTaxa(), novoInvestimento.getPeriodoDeAplicacaoMeses());
        return valorTotal;
    }

    public double exibirResposta(InvestimentoDTO investimentoDTO) {
        return calcularMontante(investimentoDTO);
    }


}