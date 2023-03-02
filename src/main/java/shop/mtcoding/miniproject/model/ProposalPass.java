package shop.mtcoding.miniproject.model;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProposalPass {
    private int id;
    private int pInfoId;
    private int pProposalId;
    private String comment;
    private Timestamp createdAt;
}