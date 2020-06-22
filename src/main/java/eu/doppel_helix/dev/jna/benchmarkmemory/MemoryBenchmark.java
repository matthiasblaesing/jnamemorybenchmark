
package eu.doppel_helix.dev.jna.benchmarkmemory;

import com.sun.jna.Memory;
import com.sun.jna.Memory2;
import com.sun.jna.Memory3;
import com.sun.jna.Memory4;
import com.sun.jna.Memory5;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.infra.Blackhole;

public class MemoryBenchmark {

    @Benchmark
    public void allocateWithMemory(Blackhole blackhole) {
        blackhole.consume(new Memory(1));
    }

    @Benchmark
    public void allocateWithMemory2(Blackhole blackhole) {
        blackhole.consume(new Memory2(1));
    }

    @Benchmark
    public void allocateWithMemory3(Blackhole blackhole) {
        blackhole.consume(new Memory3(1));
    }

    @Benchmark
    public void allocateWithMemory4(Blackhole blackhole) {
        blackhole.consume(new Memory4(1));
    }

    @Benchmark
    public void allocateWithMemory5(Blackhole blackhole) {
        blackhole.consume(new Memory5(1));
    }
}
