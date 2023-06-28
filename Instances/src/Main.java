public class Main {
    public static void main(String[] args) {
        Person p = new Person("太郎", 20, "Man");
        Person p1 = new Person("花子", 22, "Woman");
        Person n = new Person();

        System.out.println("名前：" + p.getName() + "　年齢：" + p.getAge() + "　性別：" + p.getSex());
        System.out.println("名前：" + p1.getName() + "　性別：" + p1.getAge() + "　性別：" + p1.getSex());
        System.out.println(getNumber());
    }
}