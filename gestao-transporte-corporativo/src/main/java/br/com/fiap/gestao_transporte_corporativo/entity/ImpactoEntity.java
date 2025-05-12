package br.com.fiap.gestao_transporte_corporativo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "impacto_transporte")
public class ImpactoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "empresa_id", nullable = false)
    private Long empresaId;

    @Column(name = "impacto_descricao", nullable = false)
    private String impactoDescricao;

    @Column(name = "impacto_valor", nullable = false)
    private Double impactoValor;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Long empresaId) {
        this.empresaId = empresaId;
    }

    public String getImpactoDescricao() {
        return impactoDescricao;
    }

    public void setImpactoDescricao(String impactoDescricao) {
        this.impactoDescricao = impactoDescricao;
    }

    public Double getImpactoValor() {
        return impactoValor;
    }

    public void setImpactoValor(Double impactoValor) {
        this.impactoValor = impactoValor;
    }
}