public class Conversor {

    public double millasAkm(int x) {

        if (x < 0)
            return 0;
        else {
            double toReturn = x * 1.6;
            return ((double) Math.round(toReturn * 100d) / 100d);
        }
    }

    public double metroApie(int x) {
        if (x < 0)
            return 0;
        else {
            double toReturn = x * 3.28;
            return ((double) Math.round(toReturn * 100d) / 100d);
        }
    }

    public boolean sonEquivalentes(double millas, double km) {

        if (km / 1.6 == millas)
            return true;
        else return false;
    }

}
