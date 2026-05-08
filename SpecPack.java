public class SpecPack extends Pack {

    public static final int MIN_DEADLINE = 9;
    public static final int MAX_DEADLINE = 16;

    private int deadline;

   
    public SpecPack() {
        super();
        try {
            setDeadline(MIN_DEADLINE);
        } catch (SpecPackException e) {}
    }

   
    public SpecPack(String companyName, String zone, Date deliveryDate, int weight, int volume, int deadline) throws PackException, SpecPackException {
        super(companyName, zone, deliveryDate, weight, volume);
        setDeadline(deadline);
    }

    // Deep copy constructor
    public SpecPack(SpecPack other) throws PackException, SpecPackException {
        super(other);
        setDeadline(other.deadline); 
    }

    public void setDeadline(int deadline) throws SpecPackException {
        if (deadline < MIN_DEADLINE || deadline > MAX_DEADLINE)
            throw new SpecPackException("Deadline must be from 9 to 16. You gave: " + deadline);
        this.deadline = deadline;
    }

    public int getDeadline() {
        return deadline;
    }

    public String toString() {
        return super.toString() + " Deadline:" + deadline + ":00";
    }
}
