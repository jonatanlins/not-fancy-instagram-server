package com.ServerSpring.Instagrao.models;



import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


import javax.persistence.Id;

@Getter
@Setter
@Document
public class Instagrao {

    @Id
    private String id;
    private String author;
    private String description;
    private String local;
    private Integer likes = 0;
    private String image;




    public void newLike(){
        this.likes++;
    }


}
