package web.dto;

import java.util.Date;

public class ReviewReply { // 후기댓글
	
	private int replyNo; // 후기댓글 번호
	private String replyContent; // 내용
	private Date replyDate; // 작성일
	private String adminId; // 작성자 아이디
	private int reviewNo; // 후기번호 (fk)

}
