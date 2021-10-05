package board.board.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BoardServiceImplTest {

    @Autowired
    BoardServiceImpl boardService;

    @Test
    @DisplayName("내가 테스트에서 필요로 한 boardService 클래스가 주입이 잘 되어서 Null이 아닌지 체크한다")
    public void test1(){
        assertThat(boardService).isNotNull();
    }


}