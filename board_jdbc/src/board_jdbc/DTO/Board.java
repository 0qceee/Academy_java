package board_jdbc.DTO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 *  (DTO)
 *  게시글 정보		
 *  				Java			DB
 *  - 게시글 번호		no				no	
 *  - 제목			title			title
 *  - 작성자			writer			writer
 *  - 내용			content			content
 *  - 등록일자			createdAt		created_at
 *  - 수정일자			updatedAt		updated_at
 */
@Data
// public Board() { }
@NoArgsConstructor
// public Board(String title, String writer, String content) { }
@RequiredArgsConstructor
// public Board(int no, String title, String writer, String content, Date createdAt, Date updatedAt) { }
@AllArgsConstructor
public class Board {

	private int no;
	@NonNull private String title;
	@NonNull private String writer;
	@NonNull private String content;
	private Date createdAt;
	private Date updatedAt;
	
}