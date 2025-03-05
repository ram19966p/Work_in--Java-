class Test {
    int data;  // Instance variable

    Test(int da) {
        this.data = da;
        System.out.println(da);
    }

    void change(Test fun) {
        System.out.println(fun.data);
        data = 50;  // Object ke andar ke data ko modify kar diya
    }

    public static void main(String args[]) {
        Test obj = new Test(10);  // Object banaya, jisme data = 10
        System.out.println("Before change: " + obj.data); // Output: 10

        obj.change(obj);  // Function call, object ka reference pass kiya

        System.out.println("After change: " + obj.data); // Output: 50
    }
}

