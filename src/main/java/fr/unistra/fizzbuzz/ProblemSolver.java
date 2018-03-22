package fr.unistra.fizzbuzz;

public class ProblemSolver {
    Int2String converter;
    Displayer displayer;

    public void solve(int max) {
        for (int i = 0; i < max; i++) {
            displayer.display(converter.convert(max));
        }
    }
}
