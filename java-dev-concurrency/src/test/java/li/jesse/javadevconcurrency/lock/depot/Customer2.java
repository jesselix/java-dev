package li.jesse.javadevconcurrency.lock.depot;

public class Customer2 {

    private Depot2 depot;

    public Customer2(Depot2 depot) {
        this.depot = depot;
    }

    // 消费产品：新建一个线程从仓库中消费产品。
    public void consume(final int val) {
        new Thread() {
            public void run() {
                depot.consume(val);
            }
        }.start();
    }
}
