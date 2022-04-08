package ds;

import java.util.Objects;

public class Pixel implements Comparable<Pixel>{

    private final int x, y;

    public Pixel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pixel pixel = (Pixel) o;
        return x == pixel.x && y == pixel.y;
    }

    @Override
    public int hashCode() {
//        return Objects.hash(x, y);
        return 31 * x + y; // x = 0, y = 31, hashCode = 31
                           // x = 1, y = 0, hashCode = 31
    }

    @Override
    public int compareTo(Pixel pixel) { // safety valve
        int results = Integer.compare(x, pixel.x);
        if (results != 0) return results;
        return Integer.compare(x, pixel.x);
    }
}
