public class Week04EntryPoint {
    public static void main(String[] args) {
        GetInstanceFromEnumSingleton();
        GetInstanceWithDoubleCheckLocking();
    }

    /**
     * 通过枚举创建一个单例类
     */
    private static void GetInstanceFromEnumSingleton()
    {
        EnumSingletonCreator.INSTANCE.getInstance().GetCars("A", "Car1",";client:singleton");
    }

    /**
     * 通过Double check locking 创建一个单例对象
     */
    private static void GetInstanceWithDoubleCheckLocking()
    {
        DoubleCheckLockingInstanceCreator client = new DoubleCheckLockingInstanceCreator();
        client.getInstance().GetCars("B","Car2",";client:doubleCheck");
    }

}
