package seol.study.gumball.state;

import lombok.RequiredArgsConstructor;
import seol.study.gumball.GumballMachine;

/**
 * 동전 없음.
 */
@RequiredArgsConstructor
public class NoQuarterState implements State {
    private final GumballMachine gumballMachine;

    @Override
    public void insertQuarter() {
        System.out.println("동전을 넣으셨습니다.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣어주세요.");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전을 넣어주세요.");
    }

    @Override
    public void dispense() {
        System.out.println("동전을 넣어주세요.");
    }


    public void refill() {
    }

}
