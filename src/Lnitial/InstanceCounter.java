package Lnitial;

public class InstanceCounter {
    private static int numInstances = 0;
    public static final int BOXWIDTH = 6;
    final int value = 10;
    static final String TITLE = "Manager";
    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    InstanceCounter() {
        InstanceCounter.addInstance();
    }
    public final void changeValue(){
        //value = 12; //将输出一个错误
    }
    public void InstanceCounterMain() {
        System.out.println("Starting with " +
                InstanceCounter.getCount() + " instances");
        for (int i = 0; i < 500; ++i){
            new InstanceCounter();
        }
        System.out.println("Created " +
                InstanceCounter.getCount() + " instances");
        String name = "James";
        boolean result = name instanceof String; // 由于 name 是 String 类型，所以返回真
        System.out.println("result:"+result);
    }
}
