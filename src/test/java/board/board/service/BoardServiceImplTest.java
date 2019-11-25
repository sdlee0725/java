package board.board.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import board.BoardApplication;
import board.board.dto.BoardDto;
import board.board.mapper.BoardMapper;

@RunWith(SpringRunner.class)
//@SpringBootTest(classes=BoardApplication.class)
@SpringBootTest
@ActiveProfiles(profiles="testbed")
class BoardServiceImplTest {
	
	@Autowired
	private BoardMapper boardMapper;
	

	@Test
	void testSelectBoardList()  throws Exception {
		System.out.println("====================Start");
		
		List<BoardDto> lists=boardMapper.selectBoardList();
				
		for(int i=0;i<lists.size();i++) {			
			System.out.println("---------------------------");
			System.out.println("getBoardIdx : "+lists.get(i).getBoardIdx());
			System.out.println("getTitle : "+lists.get(i).getTitle());			
			System.out.println("getContents : "+lists.get(i).getContents());			
			System.out.println("getCreatedDatetime : "+lists.get(i).getCreatedDatetime());
		}
		
		System.out.println("====================End");
	}

//	@Test
//	void testInsertBoard() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testSelectBoardDetail() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testUpdateBoard() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testDeleteBoard() {
//		fail("Not yet implemented");
//	}

}
