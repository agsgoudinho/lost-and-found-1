package br.edu.utfpr.alunos.lostandfound.model.dto;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

import br.edu.utfpr.alunos.lostandfound.model.entity.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class ItemDTO {

	private Long id;
	
    @NotEmpty(message = "A decrição não pode ser nula")
	private String descricao;
    
    @NotEmpty(message = "O local não pode ser nulo")
	private String local;
    
    @NotEmpty(message = "O horaio não pode ser nulo")
	private String horario;
    
    @NotEmpty(message = "A data não pode ser nula")
	private String data;
    
	private char status;
	
	private UserDTO usersrecord;
	private UserDTO userfound;
	
    private String created;
    private String updated;


    public ItemDTO(Item item) {
    	this.id = item.getId();
    	this.descricao = item.getDescricao();
    	this.local = item.getLocal();
    	this.descricao = item.getDescricao();
    	this.horario = item.getHorario();
    	this.data = item.getData();
    	this.status = item.getStatus();
    	this.created = item.getCreated().toString();
    	this.updated = item.getUpdated().toString();
	}
}