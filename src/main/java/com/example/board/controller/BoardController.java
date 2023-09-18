package com.example.board.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.board.dto.BoardDto;
import com.example.board.service.BoardService;
import com.example.board.vo.ResponseStdVo;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class BoardController {

	private final BoardService boardService;

	@PostMapping("/board")
	public ResponseStdVo<Long> createBoard(@RequestBody BoardDto boardDto) {
		Long boardId = boardService.create(boardDto);
		return new ResponseStdVo<>(HttpStatus.OK, "정상적으로 게시물이 생성되었습니다.", boardId);
	}

	@GetMapping("/board/{id}")
	public ResponseStdVo<BoardDto> getBoard(@PathVariable Long id) {
		BoardDto board = boardService.getOne(id);
		return new ResponseStdVo<>(HttpStatus.OK, "정상적으로 게시물을 불러왔습니다.", board);
	}

	@DeleteMapping("/board/{id}")
	public ResponseStdVo deleteBoard(@PathVariable Long id) {
		boardService.delete(id);
		return new ResponseStdVo<>(HttpStatus.OK, "정상적으로 게시물이 삭제되었습니다.");
	}

	@PutMapping("/board")
	public ResponseStdVo updateBoard(@RequestBody BoardDto boardDto) {
		boardService.update(boardDto);
		return new ResponseStdVo<>(HttpStatus.OK, "정상적으로 게시물을 수정하였습니다.");
	}
}
