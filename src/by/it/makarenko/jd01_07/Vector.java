package by.it.makarenko.jd01_07;

class Vector extends Var{
    private  double [] values;
    public Vector(double[] values){
        this.values = values;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append('{');
        String delimiter ="";
        for (double value: values){
            out.append(delimiter).append(value);
            delimiter=", ";
        }
        out.append('}');
        return out.toString();
    }

    Vector (Vector otherVec){
        this.values = otherVec.values;
    }

}
