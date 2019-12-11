package com.springboot.manageBalance.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection ="manageBalance")
public class ManageBalance {
	
	@Id
	private String id;

}
