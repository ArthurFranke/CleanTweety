import org.tweetyproject.logics.cl.reasoner.SimpleCReasoner;
import org.tweetyproject.logics.cl.syntax.*;
import org.tweetyproject.logics.pl.syntax.*;

public class ReasonerExample {
    public static void main(String[] args){
        Proposition f = new Proposition("f");
        Proposition b = new Proposition("b");
        Proposition p = new Proposition("p");

        Conditional c1 = new Conditional(b,f);
        Conditional c2 = new Conditional(p,b);
        Conditional c3 = new Conditional(p,new Negation(f));

        ClBeliefSet bs = new ClBeliefSet();
        bs.add(c1);
        bs.add(c2);
        bs.add(c3);

        System.out.println(bs);

        SimpleCReasoner reasoner = new SimpleCReasoner();

        System.out.println(reasoner.getModel(bs));

    }
}
