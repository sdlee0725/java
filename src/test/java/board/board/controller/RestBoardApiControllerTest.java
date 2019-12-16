/**
 * 
 */
package board.board.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import board.board.dto.BoardDto;
import board.board.service.BoardService;

/**
 * @author sdlee
 *
 */
@SpringBootTest
class RestBoardApiControllerTest {

	@Autowired
	private BoardService boardService;
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	
	/**
	 * Test method for {@link board.board.controller.RestBoardApiController#insertBoard(board.board.dto.BoardDto)}.
	 */
	@Test
	void testInsertBoard() throws Exception {
		BoardDto board=new BoardDto();
		
		board.setTitle("Junit Title"); 
		board.setContents("Junit Content");
		 
		boardService.insertBoard(board);
	}

	
	/**
	 * Test method for {@link board.board.controller.RestBoardApiController#openBoardList()}.
	 */
	@Test
	void testOpenBoardList() throws Exception{		
		List<BoardDto> list = boardService.selectBoardList();
		
		for(BoardDto board:list){
			System.out.println("=======================");
			System.out.println(board.getBoardIdx());
			System.out.println(board.getTitle());
			System.out.println(board.getContents());
			System.out.println(board.getCreatorId());
			System.out.println(board.getCreatedDatetime());			
		}
	}

	
	
	/**
	 * Test method for {@link board.board.controller.RestBoardApiController#openBoardDetail(int)}.
	 */
	@Test
	void testOpenBoardDetail() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link board.board.controller.RestBoardApiController#updateBoard(board.board.dto.BoardDto)}.
	 */
	@Test
	void testUpdateBoard() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link board.board.controller.RestBoardApiController#deleteBoard(int)}.
	 */
	@Test
	void testDeleteBoard() {
		//fail("Not yet implemented");
	}

}
