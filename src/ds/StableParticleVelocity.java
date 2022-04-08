package ds;

public class StableParticleVelocity {

    public int solution (int [] A) {

        int total_period = 0;
        int particle_size = A.length;

        for (int i = 0; i < particle_size; i++) {

            for (int count = 0; i + 2 < particle_size && A[i + 1] - A[i] == A[i + 2] - A[i + 1]; i++) {

                 count++;
                 total_period += count;
            }
        }

        return total_period < 1000000000 ? total_period : -1;
    }
}
