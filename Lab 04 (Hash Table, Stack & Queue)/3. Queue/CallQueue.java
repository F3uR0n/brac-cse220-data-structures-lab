class CallQueue {

    private LinkedListQueue vipQueue;
    private LinkedListQueue regularQueue;

    public CallQueue() {
        this.vipQueue = new LinkedListQueue();
        this.regularQueue = new LinkedListQueue();
    }

    public void enqueueCall(int customerId, boolean isVip) {
        if(isVip){
            System.out.println(customerId+ " added to VIP queue.");
            vipQueue.enqueue(customerId);
        }
        else{
            System.out.println(customerId+ " added to Regular queue.");
            regularQueue.enqueue(customerId);
        }
    }

    public void dequeueCall() {
        if(!vipQueue.isEmpty()){
            vipQueue.dequeue();
        }
        else if(!regularQueue.isEmpty()){
            regularQueue.dequeue();
        }
    }

    public void displayQueue() {
        System.out.println("VIP Queue: ");
        vipQueue.displayQueue();
        System.out.println("Regular Queue: ");
        regularQueue.displayQueue();
    }

    public static void main(String[] args) {
        //      ::Expected Ouput::
        // Customer 101 added to Regular queue.
        // Customer 201 added to VIP queue.
        // Customer 102 added to Regular queue.
        // Customer 202 added to VIP queue.
        // Customer 103 added to Regular queue.

        // VIP Queue:
        // Queue (front to rear): 201 -> 202 -> NULL
        // Regular Queue:
        // Queue (front to rear): 101 -> 102 -> 103 -> NULL

        // Processing VIP Customer 201.
        // Processing VIP Customer 202.
        // Processing Regular Customer 101.
        // Processing Regular Customer 102.
        // Processing Regular Customer 103.
        // No calls in the queue.

        // VIP Queue:
        // Queue (front to rear): NULL
        // Regular Queue:
        // Queue (front to rear): NULL

        CallQueue callCenter = new CallQueue();
        // Enqueueing customers 
        callCenter.enqueueCall(101, false);
        // Regular customer
        callCenter.enqueueCall(201, true);
        // VIP customer
        callCenter.enqueueCall(102, false);
        // Regular customer
        callCenter.enqueueCall(202, true);
        // VIP customer
        callCenter.enqueueCall(103, false);
        // Regular customer
        callCenter.displayQueue();
        // Processing calls
        callCenter.dequeueCall();
        callCenter.dequeueCall();
        callCenter.dequeueCall();
        callCenter.dequeueCall();
        callCenter.dequeueCall();
        callCenter.dequeueCall();
        // No more calls
        callCenter.displayQueue();
    }
}