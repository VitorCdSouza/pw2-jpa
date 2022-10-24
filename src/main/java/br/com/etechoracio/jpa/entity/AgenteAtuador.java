package br.com.etechoracio.jpa.entity;
import javax.persistence.*;

import br.com.etechoracio.jpa.enums.StatusAgenteEnum;
import br.com.etechoracio.jpa.enums.TipoAgenteEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_AGENTE_AUTUADOR")
public class AgenteAtuador {

	@Id
	@Column(name = "ID_AGENTE_AUTUADOR")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "TX_NOME")
	private String nome;
	
	@Column(name = "TX_FONE")
	private String telefone;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TP_AGENTE")
	private TipoAgenteEnum tipo;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "ST_AGENTE")
	private StatusAgenteEnum status;
}
