public class L2022211906_10_Test {
//   测试类命名规则“L学号_X_Test.java”，其中X为所分配题号
// – 使用单元测试技术
// – 测试类最开始要给出测试用例设计的总体原则，如等价类划分原则等
// – 各个测试方法前面给出方法的测试目的、用到的测试用例

    public static void main(String[] args) {
        //测试两个分数相加（结果为负）
        test1();
        //测试两个分数相加（结果为正）
        test2();
        //测试两个分数相加（结果为0）
        test3();
        //测试多个分数相加（结果为正）
        test4();

    }
    //测试两个分数相加（结果为负）
    public static void test1() {
        Solution10 solution = new Solution10();
        String expression = "-1/2+1/3";
        String expected = "-1/6";
        String actual = solution.fractionAddition(expression);
        if (expected.equals(actual)) {
            System.out.println("测试两个分数相加: 通过");
        } else {
            System.out.println("测试两个分数相加: 不通过. Expected " + expected + ", but got " + actual);
        }
    }
    //测试两个分数相加（结果为正）
    public static void test2() {
        Solution10 solution = new Solution10();
        String expression = "1/2+1/3";
        String expected = "5/6";
        String actual = solution.fractionAddition(expression);
        if (expected.equals(actual)) {
            System.out.println("测试两个分数相加: 通过");
        } else {
            System.out.println("测试两个分数相加: 不通过. Expected " + expected + ", but got " + actual);
        }
    }
    //测试两个分数相加（结果为0）
    public static void test3() {
        Solution10 solution = new Solution10();
        String expression = "1/2 - 1/2";
        String expected = "0/1";
        String actual = solution.fractionAddition(expression);
        if (expected.equals(actual)) {
            System.out.println("测试两个分数相加: 通过");
        } else {
            System.out.println("测试两个分数相加: 不通过. Expected " + expected + ", but got " + actual);
        }
    }
    //测试多个分数相加（结果为正）
    public static void test4() {
        Solution10 solution = new Solution10();
        String expression = "1/2+1/3+1/4";
        String expected = "13/12";
        String actual = solution.fractionAddition(expression);
        if (expected.equals(actual)) {
            System.out.println("测试多个分数相加: 通过");
        } else {
            System.out.println("测试多个分数相加: 不通过. Expected " + expected + ", but got " + actual);
        }
    }

}