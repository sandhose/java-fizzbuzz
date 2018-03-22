package fr.unistra.fizzbuzz;

import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.mockito.Mockito.*;
import static org.mockito.Matchers.*;

@RunWith(MockitoJUnitRunner.class)
public class ProblemSolverMockitoTest {

    @Mock
    private Int2String converter;
    @Mock
    private Displayer printer;

    @InjectMocks
    private ProblemSolver solver;

    @Test
    public void displayAHundredTimes() {
        // given
        when(converter.convert(anyInt()))
        .thenReturn("first")
        .thenReturn("other");
        // when
        solver.solve(100);
        // then
        verify(converter, times(100)).convert(anyInt());
        verify(printer, times(1)).display("first");
        verify(printer, times(99)).display("other");
        verifyNoMoreInteractions(converter, printer);
    }
}
