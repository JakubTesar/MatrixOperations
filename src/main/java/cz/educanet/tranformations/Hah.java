package cz.educanet.tranformations;

public class Hah {
    public static void main(String[] args) {
        double[][] polea = {
                {1,0,3},
                {2,3,5},
                {1,5,0}
        };
        double[][] poleb = {
                {1,0,3},
                {2,3,5},
                {1,5,0}
        };

        IMatrix a = MatrixFactory.create(polea);
        IMatrix b = MatrixFactory.create(poleb);

         double vypisA = a.get(0,0);
         double vypisB = b.get(0,0);

    }
}
