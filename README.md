# java-practice-and-learning


# 目录
------------------------------
1. 环境配置（win/Linux)
2. Hello World
3. 基础语法
    1. 数据类型
    2. 运算符和循环结构
    3. 数组
    4. 字符串
    5. 类和对象
    6. 异常处理
4. 数据结构和常见算法

高级java招聘要求

http://edu.csdn.net/course/detail/1060《javaweb 基础核心技术
http://edu.csdn.net/course/detail/852 《spring 4》


// 单行注释
/*
多行注释
*/
/**
*JavaDoc（Java文档）注释是这样的。可以用来描述类和类的属性。
*/


// 1、环境配置
/*
* -> win下的jdk安装：
* 1) oracle官网下载jdk，当前版本8u92
* 2）exe直接安装
* 3）环境变量配置：
*   JAVA_HOME C:\Java\jdk1.7.0  （新增）
    Path:  %JAVA_HOME%\bin;%JAVA_HOME%\jre\bin; （添加到原值前面）
    CLASSPATH:   .;%java_home%\lib\dt.jar;%java_home%\lib\tools.jar;%CATALINA_HOME%\lib\servlet-api.jar （新增）

    注意：classpath项的变量值前面是有一点的，Path的变量值一般加到原来值的前面，如果加到后面要用分号隔开。
    //可以配置apache路径
    CATALINA_HOME： G:\apache-tomcat-8.0.35
    
  4) java -version/javac
  5) tomcat install 
    9.0 免安装，解压到既定目录，进入bin目录，startup.bat
* 
* -> linux下的jdk安装：
    
    sudo gedit /etc/profile 
    在profile文件最后添加：
    #set java environment
    export JAVA_HOME=/usr/lib/jvm/java/jdk1.6.0_25
    export JRE_HOME=/usr/lib/jvm/java/jdk1.6.0_25/jre
    export CLASSPATH=$JAVA_HOME/lib:$JRE_HOME/lib:$CLASSPATH
    export PATH=$JAVA_HOME/bin:$JRE_HOME/bin:$PATH 


  -> eclipse 
  	切换注释：ctrl+/
  	块注释：shift+ctrl+/
  	去块注释：shift+ctrl+\
  	格式化：shift+ctrl+f
*/





// 2、Hello World

/*
1、Hello World 

Filename: HelloWorld.java
*/

// 每个 .java 文件都包含一个public类，这个类的名字必须和这个文件名一致。
		public class HelloWorld {

		    // 每个程序都需要有一个main函数作为入口 同c的main
		    public static void main(String args[]) {
			System.out.println("Hello World!");

			// 如果要在输出后不自动换行，可以使用System.out.print方法。
			System.out.print("Hello ");
			System.out.print("World");
		    }
		}

		/* javac HelloWorld.java */
		/* java HelloWorld */


		public class Person {

			String name;
			int age;

			public String toString() {
				return name+","+age+"岁";
			}

			public static void main(String args[]) {
				Person p1 = new Person();
				System.out.println(p1.toString());
				p1.name = "xiaoming";
				p1.age = 20;
				System.out.println(p1.toString());
			}
		}



// 3、基础语法

///////////////////////////////////////
// 数据类型
///////////////////////////////////////

//1）：基本数据类型：byte、short、int、long、float、double、char、boolean
//2）：引用数据类型: 数组、类、接口。
//3) ：Java常量：final double PI = 3.1415927;

//下面是字符串型字面量的例子：
"Hello World"
"two\nlines"
"\"This is in quotes\""



// Java语言提供了八种基本类型。六种数字类型（四个整数型，两个浮点型），一种字符类型，还有一种布尔型。
// 整型
// 用 <type> <name> 来声明变量
    // 字节类型 - 8位补码表示
    // (-128 <= 字节 <= 127)
    byte fooByte = 100;

    // 短整型 - 16位补码表示
    // (-32,768 <= 短整型 <= 32,767)
    short fooShort = 10000;

    // 整型 - 32位补码表示
    // (-2,147,483,648 <= 整型 <= 2,147,483,647)
    int fooInt = 1;

    // 长整型 - 64位补码表示
    // (-9,223,372,036,854,775,808 <= 长整型 <= 9,223,372,036,854,775,807)
    long fooLong = 100000L;
    // L可以用来表示一个数字是长整型的。
    // 其他的数字都默认为整型。

    // 浮点型 - 即 IEEE 754 规定的32位单精度浮点类型
    float fooFloat = 234.5f;
    // f用来表示一个数字是浮点型的。
    // 否则会被默认当做是双精度浮点型。

    // 双精度浮点型 - 即 IEEE 754 规定的64位双精度浮点类型
    double fooDouble = 123.4;

    BigDecimal bd = new BigDecimal(99.99);

// 布尔类型 - true 与 false
    boolean fooBoolean = true;
    boolean barBoolean = false;

// 字符类型 - 16位 Unicode编码字符
    char fooChar = 'A';

// 字符串
	String fooString = "My String Is Here!";
	// \n 代表一个新的换行
	String barString = "Printing on a new line?\nNo Problem!";
	// \t 代表一个新的制表符
	String bazString = "Do you want to add a tab?\tNo Problem!";


// 所有引用类型的默认值都是null
// 数组
    // 数组在声明时大小必须已经确定
    // 数组的声明格式:
    // <数据类型> [] <变量名> = new <数据类型>[<数组大小>];
    int [] intArray = new int[10];
    String [] stringArray = new String[1];
    boolean [] booleanArray = new boolean[100];

    // 声明并初始化数组也可以这样:
    int [] y = {9000, 1000, 1337};

    // 随机访问数组中的元素
    System.out.println("intArray @ 0: " + intArray[0]);

    // 数组下标从0开始并且可以被更改
    intArray[1] = 1;
    System.out.println("intArray @ 1: " + intArray[1]); // => 1

    // 其他数据类型
    // ArrayLists - 类似于数组，但是功能更多，并且大小也可以改变,ArrayList就是传说中的动态数组
    // LinkedLists
    // Maps
    // HashMaps


    int x,y;
	float z = 1.234f;
	double w = 1.234;
	boolean flag = true;
	char c;
	String str;
	String str1 = "Hi";
	c = 'A';
	str = "bye";
	x = 12;
	y = 300;
	
	int[] a = {3,4,5};
	String[] s = {"ab","bc"};

    enum Car {
        lamborghini,tata,audi,fiat,honda
    }

    
	
	System.out.println(x+y+" "+str+" "+a[a.length-1]+":"+a.length);

//----------------------------------------------------- 
// 4) : 变量类型有：局部变量、成员变量、类变量
// 局部变量被声明后，必须经过初始化，才可以使用。
// 局部变量是在栈上分配的。
	package com.young.test;

	public class  Test{

	    public int pupAge() {
		int age = 0;
		age += 7;
		return age;
	    }

	    public static void main(String[] args) {
		Test test = new Test();
		System.out.println("Age: " + test.pupAge());
	    }
	}

// 实例变量（属性）声明在一个类中，但在方法、构造方法和语句块之外
// 实例变量在对象创建的时候创建，在对象被销毁的时候销毁；
// 一般情况下应该把实例变量设为私有。通过使用访问修饰符可以使实例变量对子类可见；
// 实例变量具有默认值。数值型变量的默认值是0，布尔型变量的默认值是false，引用类型变量的默认值是null。

	import java.io.*;

	public class Employee {

	    public String name;

	    private double salary;

	    public Employee (String empName) {
		name = empName;
	    }

	    public void setSalary(double empSal) {
		salary = empSal;
	    }

	    public void printEmp() {
		System.out.println("name  : " + name );
		System.out.println("salary :" + salary);
	    }

	    public static void main(String[] args) {
		Employee e = new Employee("kaka");
		e.setSalary(100.5);
		e.printEmp();
	    }
	}

// 类变量（静态变量）
// 类变量也称为静态变量，在类中以static关键字声明，但必须在方法构造方法和语句块之外。
// 静态变量除了被声明为常量外很少使用。常量是指声明为public/private，final和static类型的变量。常量初始化后不可改变。
// 静态变量在[程序]开始时创建，在程序结束时销毁。
// 静态变量可以通过：ClassName.VariableName的方式访问。
// 类变量被声明为public static final类型时，类变量名称必须使用大写字母。如果静态变量不是public和final类型，其命名方式与实例变量以及局部变量的命名方式一致。
// 注意：如果其他类想要访问该变量，可以这样访问：Employee.DEPARTMENT。

	import java.io.*;
	public class Employee {
	    //salary是静态的私有变量
	    private static double salary;
	    // DEPARTMENT是一个常量
	    public static final String DEPARTMENT = "开发人员";
	    public static void main(String args[]){
	    salary = 10000;
		System.out.println(DEPARTMENT+"平均工资:"+salary);
	    }
	}




///////////////////////////////////////
// 操作符
///////////////////////////////////////

    int i1=1,i2=2;

    // 位运算操作符
    /*
    ~       取反，求反码
    <<      带符号左移
    >>      带符号右移
    >>>     无符号右移
    &       和
    ^       异或
    |       相容或
    */

    // 条件运算符（?:）
    b = (a == 1) ? 20: 30;   

    // instanceOf 运算符 ( Object reference variable ) instanceOf  (class/interface type)
    String name = 'James';
    boolean result = name instanceOf String;

    Vehicle a = new Car();
    boolean result =  a instanceof Car;

///////////////////////////////////////
// 控制结构 （循环结构和分支结构）
///////////////////////////////////////

	// If语句和C的类似
	int j = 10;
	if (j == 10){
	    System.out.println("I get printed");
	} else if (j > 10) {
	    System.out.println("I don't");
	} else {
	    System.out.println("I also don't");
	}

	// While循环
	int fooWhile = 0;
	while(fooWhile < 100)
	{
	    //System.out.println(fooWhile);
	    //增加计数器
	    //遍历99次， fooWhile 0->99
	    fooWhile++;
	}
	System.out.println("fooWhile Value: " + fooWhile);

	// Do While循环
	int fooDoWhile = 0;
	do
	{
	    //System.out.println(fooDoWhile);
	    //增加计数器
	    //遍历99次, fooDoWhile 0->99
	    fooDoWhile++;
	}while(fooDoWhile < 100);
	System.out.println("fooDoWhile Value: " + fooDoWhile);

	// For 循环
	int fooFor;
	//for 循环结构 => for(<起始语句>; <循环进行的条件>; <步长>)
	for(fooFor=0; fooFor<10; fooFor++){
	    //System.out.println(fooFor);
	    //遍历 10 次, fooFor 0->9
	}
	System.out.println("fooFor Value: " + fooFor);

	// Switch Case 语句
	// switch可以用来处理 byte, short, char, 和 int 数据类型
	// 也可以用来处理枚举类型,字符串类,和原始数据类型的包装类：
	// Character, Byte, Short, 和 Integer
	int month = 3;
	String monthString;
	switch (month){
	    case 1:
	            monthString = "January";
	            break;
	    case 2:
	            monthString = "February";
	            break;
	    case 3:
	            monthString = "March";
	            break;
	    default:
	            monthString = "Some other month";
	            break;
	}
	System.out.println("Switch Case Result: " + monthString);



    // 数据转换

    // 将字符串转换为整型
    Integer.parseInt("123");//返回整数123

    // 将整型转换为字符串
    Integer.toString(123);//返回字符串"123"

    // 其他的数据也可以进行互相转换:
    // Double
    // Long
    // String

    // 类型转换
    // 你也可以对java对象进行类型转换, 但其中会牵扯到很多概念
    // 在这里可以查看更详细的信息:
    // http://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html


// Java 日期时间

1 时间戳转换成时间：
	import java.text.SimpleDateFormat;
	import java.util.Date;

	public class TimeToDate {
	    public static void main(String[] args){
		Long timeStamp = System.currentTimeMillis();  //获取当前时间戳
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		//String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));   // 时间戳转换成时间
		String sd = sdf.format(new Date(timeStamp));
		System.out.println(sd);
	   }
	}

2 格式化时间
	import java.text.SimpleDateFormat;
	import java.util.Date;

	public class Main{
	   public static void main(String[] args){
	      Date date = new Date();
	      String strDateFormat = "yyyy-MM-dd HH:mm:ss";
	      SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
	      System.out.println(sdf.format(date));
	   }
	}

3 获取当前日期
	import java.util.Calendar;

	public class Main {
	    public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DATE);
		int month = cal.get(Calendar.MONTH) + 1;
		int year = cal.get(Calendar.YEAR);
		int dow = cal.get(Calendar.DAY_OF_WEEK);
		int dom = cal.get(Calendar.DAY_OF_MONTH);
		int doy = cal.get(Calendar.DAY_OF_YEAR);

		System.out.println("当期时间: " + cal.getTime());
		System.out.println("日期: " + day);
		System.out.println("月份: " + month);
		System.out.println("年份: " + year);
		System.out.println("一周的第几天: " + dow);  // 星期日为一周的第一天输出为 1，星期一输出为 2，以此类推
		System.out.println("一月中的第几天: " + dom);
		System.out.println("一年的第几天: " + doy);
	    }
	}


1) timeStamp to  dateString

	long t = System.currentTimeMillis();
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String dateString = format.format(t);
	System.out.println(dateString);

2) dateString to timeStamp/date

	Date d = new Date();
	try {
	    d = new SimpleDateFormat("yyyy-MM-dd").parse("2017-02-15");
	} catch (ParseExeption e) {
	    e.printStackTrace();
	}
	System.out.println(d);
	System.out.println(d.getTime());


3) get the first and last date of month

	String tt = "2017-02";
	Date month = new date();
	try {
	    month = new SimpleDateFormat("yyyy-MM").parse("2017-02");
	} catch (ParseExeption e) {
	    e.printStackTrace();
	}
	Calendar c = Calendar.getInstance();
	c.setTime(month);
	c.set(Calendar.DAY_OF_MONTH, 1);
	System.out.println(c.getTime());

	c.set(Calendar.MONTH, c.get(Calendar.MONTH) + 1);
	c.set(Calendar.DAY_OF_MONTH, -1);
	System.out.println(c.getTime());


4) get the date before of current

	int dayNum = 10;
	Calendar c1 = Calendar.getInstance();
	c1.set(Calendar.DAY_OF_MONTH, c1.get(Calendar.DAY_OF_MONTH) - dayNum);
	System.out.println(c1.getTime());


5) 比较日期

	String s1 = "2017-02-01";
	String s2 = "2017-01-31";
	Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse(s1);
	Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse(s2);
	System.out.println(d1.before(d2)+" or "+d1.after(d2));
	System.out.println(d1.compareTo(d2)>0+" or "+d1.compareTo(d2)>0);




// Java 正则表达式  

///////////////////////////////////////
// Java Number类
///////////////////////////////////////


///////////////////////////////////////
// Java Character类
///////////////////////////////////////



///////////////////////////////////////
// Java String类
///////////////////////////////////////

// 1 字符串长度
	String site = "www.runoob.com";
	int len = site.length();

// 2 连接字符串
	"My name is ".concat("Runoob");
	"Hello," + " world" + "!";

// 3 格式化字符串
	String fs;
	fs = String.format("浮点型变量的的值为 " +
			   "%f, 整型变量的值为 " +
			   " %d, 字符串变量的值为 " +
			   " %s", floatVar, intVar, stringVar);
	System.out.println(fs);

// 4 获取该字符在字符串中位置
int indexOf（int ch） 返回的是ch在字符串中的第一次出现的位置。
int indexOf(int ch,int fromIndex) 从fromIndex指定位置开始，获取ch在字符串中出现的位置。
int indexOf(String str)返回的是str在字符串中的第一次出现的位置。
int indexOf(String str,int fromIndex) 从fromIndex指定位置开始，获取str在字符串中出现的位置。

// 5 字符串中是否包含某一个子串
boolean contains(str)

// 6 字符串是否有内容
boolean isEmpty()

// 7 字符串是否以指定内容开头
boolean startsWith(str)
// 字符串是否以指定内容结尾
boolean endsWith(str)

// 8 字符串相等
if(A.equals(B)){}

// 9 截取字符串，返回索引开始（包括自己）后面的字符串
String substring(int beginIndex)

// 10 分割字符串
String[] split(String regex)
// 那如何拼接一个字符串
List names=new ArrayList<String>();
names.add("1");
names.add("2");
names.add("3");
System.out.println(String.join("-", names));

String[] arrStr=new String[]{"a","b","c"};
System.out.println(String.join("-", arrStr));

// 11 替换字符串
String replace(char oldChar, char newChar)
String replaceAll(String regex, String replacement)

// 12 trim
String trim();

// 13 大小写转化
String toLowerCase()
String toUpperCase()






// Java StringBuffer和StringBuilder类



///////////////////////////////////////
// Java 数组
///////////////////////////////////////

数组作为函数的返回值:
	public static int[] reverse(int[] list) {
	  int[] result = new int[list.length];

	  for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
	    result[j] = list[i];
	  }
	  return result;
	}


遍历数组：

1. for (int i = 0; i < myList.length; i++) 

double[] myList = {1.9, 2.9, 3.4, 3.5};
double total = 0;
for (int i = 0; i < myList.length; i++) {
    total += myList[i];
}

2. for (double element: myList)

double[] myList = {1.9, 2.9, 3.4, 3.5};
// 打印所有数组元素
for (double element: myList) {
    System.out.println(element);
}

常见数组操作：
	import java.util.Arrays;  

	/* 
	 * Arrays工具类的中的几个常用方法 
	 * 1.copyof 
	 * 2.toString 
	 * 3.equals 
	 * 4.sort 
	 * 5.fill 
	 * 6.binarySearch 
	 */  
	public class ArraysTest {  

	    public static void main(String[] args) {  
		String [] arry1={"北京","上海","重庆","深圳"};  
		String [] arry2=Arrays.copyOf(arry1, 4);  
		//复制copyof  
		System.out.println("arry2是:"+Arrays.toString(arry2));  
		//比较 equals  
		System.out.println("arry1与arry2是否相等:"+Arrays.equals(arry1, arry2));  
		//将arry1排序 sort  
		Arrays.sort(arry1);  
		//toString  
		System.out.println("排序后的arry1的值:"+Arrays.toString(arry1));  
		//排序后arry1与arry2是否还相等 equals  
		System.out.println("排序后arry1与arry2是否还相等"+Arrays.equals(arry1, arry2));  
		//填充 fill  
		Arrays.fill(arry2, "广州");  
		System.out.println("填充之后arry2的值:"+Arrays.toString(arry2));  
		//查询binarySearch前提是数组已经排序过后才可以使用  
		System.out.println("重庆在arry1中的位置:"+Arrays.binarySearch(arry1, "重庆"));  
	    }  
	} 


///////////////////////////////////////
// Hash map & List（ArrayList/LinkedList
///////////////////////////////////////

Java 数据结构: java.util包中定义的类
枚举（Enumeration）
位集合（BitSet）
向量（Vector）
栈（Stack）
字典（Dictionary）
哈希表（Hashtable）
属性（Properties）


Java 集合框架: Java提供了一套实现了Collection接口的标准集合类。

所有集合类都位于java.util包下。集合中只能保存对象（保存对象的引用变量）。
可以使用泛型来限制集合里元素的类型，并让集合记住所有集合元素的类型。

Java的集合类主要由两个接口派生而出：Collection和Map

Set、List和Map可以看做集合的三大类。

    List集合是有序集合，集合中的元素可以重复，访问集合中的元素可以根据元素的索引来访问。

    Set集合是无序集合，集合中的元素不可以重复，访问集合中的元素只能根据元素本身来访问（也是不能集合里元素不允许重复的原因）。

    Map集合中保存Key-value对形式的元素，访问时只能根据每项元素的key来访问其value。

对于Set、List和Map三种集合，最常用的实现类分别是HashSet、ArrayList和HashMap三个实现类。


注意：   
1、Collection没有get()方法来取得某个元素。只能通过iterator()遍历元素。
2、Set和Collection拥有一模一样的接口。
3、List，可以通过get()方法来一次取出一个元素。使用数字来选择一堆对象中的一个，get(0)...。(add/get)
4、一般使用ArrayList。用LinkedList构造堆栈stack、队列queue。
5、Map用 put(k,v) / get(k)，还可以使用containsKey()/containsValue()来检查其中是否含有某个key/value。HashMap会利用对象的hashCode来快速找到key。
6、Map中元素，可以将key序列、value序列单独抽取出来。
使用keySet()抽取key序列，将map中的所有keys生成一个Set。
使用values()抽取value序列，将map中的所有values生成一个Collection。
为什么一个生成Set，一个生成Collection？那是因为，key总是独一无二的，value允许重复。

Hashtable 和 HashMap区别
1.Hashtable的方法是同步的，HashMap未经同步，所以在多线程场合要手动同步HashMap这个区别就像Vector和ArrayList一样。
2.Hashtable不允许 null 值(key 和 value 都不可以)，HashMap允许 null 值(key和value都可以)。
3.HashMap几乎可以等价于Hashtable，除了HashMap是非synchronized的，并可以接受null(HashMap可以接受为null的键值(key)和值(value)，而Hashtable则不行)
这意味着Hashtable是线程安全的，多个线程可以共享一个Hashtable.
HashMap可以通过下面的语句进行同步：
Map m = Collections.synchronizeMap(hashMap);

结论：Hashtable和HashMap有几个主要的不同：线程安全以及速度。在仅需要线程安全的时候使用Hashtable


//--------------------
标准集合类：Java提供了一套实现了Collection接口的标准集合类。
LinkedList 继承于 AbstractSequentialList，实现了一个链表。
ArrayList  通过继承AbstractList，实现动态数组。
HashSet    继承了AbstractSet，并且使用一个哈希表。
HashMap    HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。继承于AbstractMap，实现了Map、Cloneable、java.io.Serializable接口。

// 非集合类
Vector     Vector类实现了一个动态数组。和ArrayList和相似，但是两者是不同的。
Stack
Dictionary
Hashtable

// LinkedList
	import java.util.LinkedList;

	public class Main {
	    public static void main(String[] args) {
		LinkedList lList = new LinkedList();
		//可以使用泛型限制集合里元素的类型
		//LinkedList<String> lList = new LinkedList<String>();
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");
		System.out.println(lList);
		lList.addFirst("0");
		System.out.println(lList);
		lList.addLast("6");
		System.out.println(lList);
		System.out.println("链表的第一个元素是：" + lList.getFirst());
		System.out.println("链表的第二个元素是：" + lList.getLast());
	    }
	}

// List 和 Set 遍历
	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Set;

	public class Main {

	   public static void main(String[] args) {
	      // List集合的遍历
	      listTest();
	      // Set集合的遍历
	      setTest();
	   }

	   private static void setTest() {
	      Set<String> set = new HashSet<String>();
	      set.add("JAVA");
	      set.add("C");
	      set.add("C++");
	      // 重复数据添加失败
	      set.add("JAVA");
	      set.add("JAVASCRIPT");

	      // 使用iterator遍历set集合
	      Iterator<String> it = set.iterator();
	      while (it.hasNext()) {
		 String value = it.next();
		 System.out.println(value);
	      }

	      // 使用增强for循环遍历set集合
	      for(String s: set){
		 System.out.println(s);
	      }
	   }

	   // 遍历list集合
	   private static void listTest() {
	      List<String> list = new ArrayList<String>();
	      list.add("菜");
	      list.add("鸟");
	      list.add("教");
	      list.add("程");
	      list.add("www.w3cschool.cc");

	      // 使用iterator遍历
	      Iterator<String> it = list.iterator();
	      while (it.hasNext()) {
		 String value = it.next();
		 System.out.println(value);
	      }

	      // 使用传统for循环进行遍历
	      for (int i = 0, size = list.size(); i < size; i++) {
		 String value = list.get(i);
		 System.out.println(value);
	      }

	      // 使用增强for循环进行遍历
	      for (String value : list) {
		 System.out.println(value);
	      }
	   }
	}

	// 栈的实现
	public class MyStack {
	   private int maxSize;
	   private long[] stackArray;
	   private int top;
	   public MyStack(int s) {
	      maxSize = s;
	      stackArray = new long[maxSize];
	      top = -1;
	   }
	   public void push(long j) {
	      stackArray[++top] = j;
	   }
	   public long pop() {
	      return stackArray[top--];
	   }
	   public long peek() {
	      return stackArray[top];
	   }
	   public boolean isEmpty() {
	      return (top == -1);
	   }
	   public boolean isFull() {
	      return (top == maxSize - 1);
	   }
	   public static void main(String[] args) {
	      MyStack theStack = new MyStack(10); 
	      theStack.push(10);
	      theStack.push(20);
	      theStack.push(30);
	      theStack.push(40);
	      theStack.push(50);
	      while (!theStack.isEmpty()) {
		 long value = theStack.pop();
		 System.out.print(value);
		 System.out.print(" ");
	      }
	      System.out.println("");
	   }
	}

	// 队列的实现
	LinkedList类实现了Queue接口，因此我们可以把LinkedList当成Queue来用。

	    Queue<String> queue = new LinkedList<String>();
	    //添加元素
	    queue.offer("a");
	    //返回第一个元素，并在队列中删除
	    queue.poll()
	    //只返回第一个元素
	    queue.element()
	    queue.peek()


	// 数组转集合
	List<String> list = Arrays.asList(name); 


	// HashMap遍历
	import java.util.*;

	public class Main {
	   public static void main(String[] args) {
	      HashMap< String, String> hMap = 
	      new HashMap< String, String>();
	      hMap.put("1", "1st");
	      hMap.put("2", "2nd");
	      hMap.put("3", "3rd");
	      Collection cl = hMap.values();
	      Iterator itr = cl.iterator();
	      while (itr.hasNext()) {
		 System.out.println(itr.next());
	     }
	   }
	}

	public static void main(String[] args) {

	    Map<String, String> map = new HashMap<String, String>();
	    map.put("1", "value1");
	    map.put("2", "value2");
	    map.put("3", "value3");

	    //第一种：普遍使用，二次取值
	    System.out.println("通过Map.keySet遍历key和value：");
	    for (String key : map.keySet()) {
	    System.out.println("key= "+ key + " and value= " + map.get(key));
	    }

	    //第二种
	    System.out.println("通过Map.entrySet使用iterator遍历key和value：");
	    Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
	    while (it.hasNext()) {
		Map.Entry<String, String> entry = it.next();
		System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
	    }

	    //第三种：推荐，尤其是容量大时
	    System.out.println("通过Map.entrySet遍历key和value");
	    for (Map.Entry<String, String> entry : map.entrySet()) {
		System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
	    }

	    //第四种
	    System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
	    for (String v : map.values()) {
		System.out.println("value= " + v);
	    }
	 }



	// 遍历 HashTable 的键值 也可以使用iterator
	import java.util.Hashtable;
	import java.util.Set;

	public class MyHashtableRead {
	    public static void main(String[] args) {
		Hashtable<String,String> hm = new Hashtable<String,String> ();

		hm.put("first","aaaa");
		hm.put("second","bbbb");
		hm.put("third","cccc");

		System.out.println(hm);

		Set<String> keys = hm.keySet();

		for (String key:keys) {
		    System.out.println(key + " : " + hm.get(key));
		}
	    }
	}


	// List 排序

	List<String> cities = new ArrayList<>();
	cities.add("上海");
	cities.add("西安");
	Collections.sort(cities, new Comparable<String>(){
	    @Override
	    public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	    }
	});


	// Map 排序(按key)

	Map<String, String> vendorMap = new TreeMap<String， List<VendorStatisticResultVO>>(new Comparable<String>(){

	    @Override
	    public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	    }
	});


	// List 过滤 (FluentIterable)

	import com.google.common.base.Predicate;
	import com.google.common.collect.FluentIterable;

	static class User{

	    int age;
	    String name;

	    User(int age, String name) {
		this.age = age;
		this.name = name;
	    }

	    int getAge() {
		return age;
	    }
	    void setAge() {
		this.age = age;
	    }
	    int getName() {
		return name;
	    }
	    void setName() {
		this.name = name;
	    }
	}

	public static void main(String[] args) {

	    User u1 = User(20, "test1");
	    User u2 = User(22, "test2");
	    User u3 = User(25, "test3");

	    List<User> users = new ArrayList<>();
	    users.add(u1);
	    users.add(u2);
	    users.add(u3);

	    FluentIterable<User> filter = FluentIterable.from(users).filter(new Predicate<User>(){

		@Override
		public boolean apply(User user) {
		    return user.getAge() > 20;
		}
	    });

	    for (User user : filter) {
		System.out.println(user.getName() + " : " + user.getAge());
	    }


	    List<String> names = FluentIterable.from(users)
		.transfrom(new Function<users, String>(){

		    @Override
		    public String apply(User user) {
			return user.getName();
		    }
		}).toList();
	}






///////////////////////////////////////
// Java 泛型
///////////////////////////////////////

Java 泛型（generics）是 JDK 5 中引入的一个新特性, 泛型提供了编译时类型安全检测机制，该机制允许程序员在编译时检测到非法的类型。

【泛型方法】
所有泛型方法声明都有一个类型参数声明部分（由尖括号分隔），该类型参数声明部分在方法返回类型之前（在下面例子中的<E>）。
每一个类型参数声明部分包含一个或多个类型参数，参数间用逗号隔开。一个泛型参数，也被称为一个类型变量，是用于指定一个泛型类型名称的标识符。
类型参数能被用来声明返回值类型，并且能作为泛型方法得到的实际参数类型的占位符。
泛型方法体的声明和其他方法一样。注意类型参数只能代表引用型类型，不能是原始类型（像int,double,char的等）。

	public class GenericMethodTest
	{
	   // 泛型方法 printArray                         
	   public static < E > void printArray( E[] inputArray )
	   {
	      // 输出数组元素            
		 for ( E element : inputArray ){        
		    System.out.printf( "%s ", element );
		 }
		 System.out.println();
	    }

	    public static void main( String args[] )
	    {
		// 创建不同类型数组： Integer, Double 和 Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println( "整型数组元素为:" );
		printArray( intArray  ); // 传递一个整型数组

		System.out.println( "\n双精度型数组元素为:" );
		printArray( doubleArray ); // 传递一个双精度型数组

		System.out.println( "\n字符型数组元素为:" );
		printArray( charArray ); // 传递一个字符型数组
	    } 
	}

有界的类型参数:
可能有时候，你会想限制那些被允许传递到一个类型参数的类型种类范围

要声明一个有界的类型参数，首先列出类型参数的名称，后跟extends关键字，最后紧跟它的上界。
public static <T extends Comparable<T>> T maximum(T x, T y, T z)

【泛型类】
	public class Box<T> {

	  private T t;

	  public void add(T t) {
	    this.t = t;
	  }

	  public T get() {
	    return t;
	  }

	  public static void main(String[] args) {
	    Box<Integer> integerBox = new Box<Integer>();
	    Box<String> stringBox = new Box<String>();

	    integerBox.add(new Integer(10));
	    stringBox.add(new String("菜鸟教程"));

	    System.out.printf("整型值为 :%d\n\n", integerBox.get());
	    System.out.printf("字符串为 :%s\n", stringBox.get());
	  }
	}

	public void out(E msg) {
	    System.out.println(E);
	}



///////////////////////////////////////
// 类与函数
///////////////////////////////////////

源文件声明规则：
一个源文件中只能有一个public类
一个源文件可以有多个非public类
源文件的名称应该和public类的类名保持一致。例如：源文件中public类的类名是Employee，那么源文件应该命名为Employee.java。
如果一个类定义在某个包中，那么package语句应该在源文件的首行。
如果源文件包含import语句，那么应该放在package语句和类定义之间。如果没有package语句，那么import语句应该在源文件中最前面。
import语句和package语句对源文件中定义的所有类都有效。在同一源文件中，不能给不同的类不同的包声明。
类有若干种访问级别，并且类也分不同的类型：抽象类和final类等。这些将在访问控制章节介绍。
除了上面提到的几种类型，Java还有一些特殊的类，如：内部类、匿名类。

访问控制修饰符
Java中，可以使用访问控制符来保护对类、变量、方法和构造方法的访问。Java支持4种不同的访问权限。
默认的，也称为 default，在同一包内可见，不使用任何修饰符。
私有的，以 private 修饰符指定，在同一类内可见。
共有的，以 public 修饰符指定，对所有类可见。
受保护的，以 protected 修饰符指定，对同一包内的类和所有子类可见。

Java也提供了许多非访问修饰符。
static修饰符，用来创建类方法和类变量。
Final修饰符，用来修饰类、方法和变量，final修饰的类不能够被继承，修饰的方法不能被继承类重新定义，修饰的变量为常量，是不可修改的。
Abstract修饰符，用来创建抽象类和抽象方法。
Synchronized和volatile修饰符，主要用于线程的编程。
Static修饰符
静态变量：
Static关键字用来声明独立于对象的静态变量，无论一个类实例化多少对象，它的静态变量只有一份拷贝。 静态变量也被成为类变量。局部变量不能被声明为static变量。
静态方法：
Static关键字用来声明独立于对象的静态方法。静态方法不能使用类的非静态变量。静态方法从参数列表得到数据，然后计算这些数据。

静态变量和方法的访问可以直接使用classname.variablename和classname.methodname的方式访问。



	public class InstanceCounter {
	   private static int numInstances = 0;
	   protected static int getCount() {
	      return numInstances;
	   }

	   private static void addInstance() {
	      numInstances++;
	   }

	   InstanceCounter() {
	      InstanceCounter.addInstance();
	   }

	   public static void main(String[] arguments) {
	      System.out.println("Starting with " +
	      InstanceCounter.getCount() + " instances");
	      for (int i = 0; i < 500; ++i){
		 new InstanceCounter();
		  }
	      System.out.println("Created " +
	      InstanceCounter.getCount() + " instances");
	   }
	}

/////////////////////////
// 方法的重载
/////////////////////////

//上面使用的max方法仅仅适用于int型数据。但如果你想得到两个浮点类型数据的最大值呢？
//解决方法是创建另一个有相同名字但参数不同的方法，如下面代码所示：
public static double max(double num1, double num2) {
  if (num1 > num2)
    return num1;
  else
    return num2;
}
/*
如果你调用max方法时传递的是int型参数，则 int型参数的max方法就会被调用；
如果传递的是double型参数，则double类型的max方法体会被调用，这叫做方法重载；
就是说一个类的两个方法拥有相同的名字，但是有不同的参数列表。
Java编译器根据方法签名判断哪个方法应该被调用。
方法重载可以让程序更清晰易读。执行密切相关任务的方法应该使用相同的名字。
重载的方法必须拥有不同的参数列表。你不能仅仅依据修饰符或者返回类型的不同来重载方法。
*/

overload  重载，一个完全新的方法，参数和原方法不同。
override  覆盖继承到的那个方法，那个方法仍然没有放弃。
overwrite 重写继承到的那个方法的代码，原方法被放弃。
方法的重写规则：
    参数列表必须完全与被重写方法的相同；
    返回类型必须完全与被重写方法的返回类型相同；
    访问权限不能比父类中被重写的方法的访问权限更低。例如：如果父类的一个方法被声明为public，那么在子类中重写该方法就不能声明为protected。
    父类的成员方法只能被它的子类重写。
    声明为final的方法不能被重写。
    声明为static的方法不能被重写，但是能够被再次声明。
    子类和父类在同一个包中，那么子类可以重写父类所有方法，除了声明为private和final的方法。
    子类和父类不在同一个包中，那么子类只能够重写父类的声明为public和protected的非final方法。
    重写的方法能够抛出任何非强制异常，无论被重写的方法是否抛出异常。但是，重写的方法不能抛出新的强制性异常，或者比被重写方法声明的更广泛的强制性异常，反之则可以。
    构造方法不能被重写。
    如果不能继承一个方法，则不能重写这个方法。
重载规则：
    被重载的方法必须改变参数列表；
    被重载的方法可以改变返回类型；
    被重载的方法可以改变访问修饰符；
    被重载的方法可以声明新的或更广的检查异常；
    方法能够在同一个类中或者在一个子类中被重载。


// 构造方法
/*
当一个对象被创建时候，构造方法用来初始化该对象。构造方法和它所在类的名字相同，但构造方法没有返回值。
通常会使用构造方法给一个类的实例变量赋初值，或者执行其它必要的步骤来创建一个完整的对象。
不管你与否自定义构造方法，所有的类都有构造方法，因为Java自动提供了一个默认构造方法，它把所有成员初始化为0。
一旦你定义了自己的构造方法，默认构造方法就会失效。
实例
下面是一个使用构造方法的例子：
*/
	// 一个简单的构造函数
	class MyClass {
	   int x;

	   // 以下是构造函数
	   MyClass() {
	      x = 10;
	   }
	}


	// finalize() 方法
	/*
	Java允许定义这样的方法，它在对象被垃圾收集器析构(回收)之前调用，这个方法叫做finalize( )，它用来清除回收对象。
	例如，你可以使用finalize()来确保一个对象打开的文件被关闭了。
	在finalize()方法里，你必须指定在对象销毁时候要执行的操作。
	finalize()一般格式是：
	*/
	protected void finalize()
	{
	   // 在这里终结代码
	}

	public class FinalizationDemo {  
	    public static void main(String[] args) {  
		Cake c1 = new Cake(1);  
		Cake c2 = new Cake(2);  
		Cake c3 = new Cake(3);  

		c2 = c3 = null;  
		System.gc(); //调用Java垃圾收集器  
	    }  
	}  

	class Cake extends Object {  
	    private int id;  
	    public Cake(int id) {  
		this.id = id;  
		System.out.println("Cake Object " + id + "is created");  
	    }  

	    protected void finalize() throws java.lang.Throwable {  
		super.finalize();  
		System.out.println("Cake Object " + id + "is disposed");  
	    }  
	}  


//---------------------------------------------

    // 用new来实例化一个类
    Bicycle trek = new Bicycle();

    // 调用对象的方法
    trek.speedUp(3); // 需用getter和setter方法
    trek.setCadence(100);

    // toString 可以把对象转换为字符串
    System.out.println("trek info: " + trek.toString());


    // 函数语法:
    // <public/private/protected> <返回值类型> <函数名称>(<参数列表>)

    // Java类中经常会用getter和setter来对成员变量进行操作

    // 方法声明的语法:
    // <作用域> <返回值类型> <方法名>(<参数列表>)



// 你也可以把其他的非public类放入到.java文件中


	// 类定义的语法:
	// <public/private/protected> class <类名>{
	//    //成员变量, 构造函数, 函数
	//    //Java中函数被称作方法
	// }

	class Bicycle {

	    // Bicycle 类的成员变量和方法
	    public int cadence; // Public: 任意位置均可访问
	    private int speed;  // Private: 只在同类中可以访问
	    protected int gear; // Protected: 可以在同类与子类中可以访问
	    String name; // default: 可以在包内中可以访问

	    // 构造函数是初始化一个对象的方式
	    // 以下是一个默认构造函数
	    public Bicycle() {
		gear = 1;
		cadence = 50;
		speed = 5;
		name = "Bontrager";
	    }

	    // 一下是一个含有参数的构造函数
	    public Bicycle(int startCadence, int startSpeed, int startGear, String name) {
		this.gear = startGear;
		this.cadence = startCadence;
		this.speed = startSpeed;
		this.name = name;
	    }

	    // 函数语法:
	    // <public/private/protected> <返回值类型> <函数名称>(<参数列表>)

	    // Java类中经常会用getter和setter来对成员变量进行操作

	    // 方法声明的语法:
	    // <作用域> <返回值类型> <方法名>(<参数列表>)
	    public int getCadence() {
		return cadence;
	    }

	    // void返回值函数没有返回值
	    public void setCadence(int newValue) {
		cadence = newValue;
	    }

	    public void setGear(int newValue) {
		gear = newValue;
	    }

	    public void speedUp(int increment) {
		speed += increment;
	    }

	    public void slowDown(int decrement) {
		speed -= decrement;
	    }

	    public void setName(String newName) {
		name = newName;
	    }

	    public String getName() {
		return name;
	    }

	    //返回对象属性的方法
	    @Override
	    public String toString() {
		return "gear: " + gear +
			" cadence: " + cadence +
			" speed: " + speed +
			" name: " + name;
	    }
	} // Bicycle 类结束

	// PennyFarthing 是 Bicycle 的子类
	class PennyFarthing extends Bicycle {
	    // (Penny Farthings 是前轮很大的 Bicycle， 并且没有齿轮)

	    public PennyFarthing(int startCadence, int startSpeed){
		// 通过super调用父类的构造函数
		super(startCadence, startSpeed, 0, "PennyFarthing");
	    }

	    // 你可以用@注释来表示需要重载的方法
	    // 了解更多的注释使用方法，可以访问下面的地址：
	    // http://docs.oracle.com/javase/tutorial/java/annotations/
	    @Override
	    public void setGear(int gear) {
		gear = 0;
	    }

	}

//---------------------------------------------

	序列化对象
	import java.io.*;

	public class SerializeDemo
	{
	   public static void main(String [] args)
	   {
	      Employee e = new Employee();
	      e.name = "Reyan Ali";
	      e.address = "Phokka Kuan, Ambehta Peer";
	      e.SSN = 11122333;
	      e.number = 101;
	      try
	      {
		 FileOutputStream fileOut =
		 new FileOutputStream("/tmp/employee.ser");
		 ObjectOutputStream out = new ObjectOutputStream(fileOut);
		 out.writeObject(e);
		 out.close();
		 fileOut.close();
		 System.out.printf("Serialized data is saved in /tmp/employee.ser");
	      }catch(IOException i)
	      {
		  i.printStackTrace();
	      }
	   }
	}

	反序列化对象
	import java.io.*;
	public class DeserializeDemo
	{
	   public static void main(String [] args)
	   {
	      Employee e = null;
	      try
	      {
		 FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
		 ObjectInputStream in = new ObjectInputStream(fileIn);
		 e = (Employee) in.readObject();
		 in.close();
		 fileIn.close();
	      }catch(IOException i)
	      {
		 i.printStackTrace();
		 return;
	      }catch(ClassNotFoundException c)
	      {
		 System.out.println("Employee class not found");
		 c.printStackTrace();
		 return;
	      }
	      System.out.println("Deserialized Employee...");
	      System.out.println("Name: " + e.name);
	      System.out.println("Address: " + e.address);
	      System.out.println("SSN: " + e.SSN);
	      System.out.println("Number: " + e.number);
	    }
	}


//---------------------------------------------

// package
包的作用
1 把功能相似或相关的类或接口组织在同一个包中，方便类的查找和使用。
2 如同文件夹一样，包也采用了树形目录的存储方式。同一个包中的类名字是不同的，不同的包中的类的名字是可以相同的，当同时调用两个不同包中相同类名的类时，应该加上包名加以区别。因此，包可以避免名字冲突。
3 包也限定了访问权限，拥有包访问权限的类才能访问某个包中的类。
Java使用包（package）这种机制是为了防止命名冲突，访问控制，提供搜索和定位类（class）、接口、枚举（enumerations）和注释（annotation）等



//---------------------------------------------
// Java 异常处理

1 异常关系图
2 五个关键字 （try/catch/throw/throws/finally)
3 先捕获小的，再捕获大的
4 异常和重写的关系

// 比如说，你的代码少了一个分号，那么运行出来结果是提示是错误java.lang.Error；
// 如果你用System.out.println(11/0)，那么你是因为你用0做了除数，会抛出java.lang.ArithmeticException的异常。

/*
Exception类的层次
所有的异常类是从java.lang.Exception类继承的子类。
Exception类是Throwable类的子类。除了Exception类外，Throwable还有一个子类Error 。
Java程序通常不捕获错误。错误一般发生在严重故障时，它们在Java程序处理的范畴之外。
Error用来指示运行时环境发生的错误。
例如，JVM内存溢出。一般地，程序不会从错误中恢复。
异常类有两个主要的子类：IOException类和RuntimeException类。
*/

// 捕获异常
// 使用try和catch关键字可以捕获异常。try/catch代码块放在异常可能发生的地方。
// try/catch代码块中的代码称为保护代码，使用 try/catch的语法如下：
try
{
   // 程序代码
}catch(ExceptionName e1)
{
   //Catch 块
}


	// 多重try/catch。
	try {
	   file = new FileInputStream(fileName);
	   x = (byte) file.read();
	} catch(IOException i) {
	   i.printStackTrace();
	   // log sth.
	   return -1;
	} catch(FileNotFoundException f) //Not valid!
	{
	   f.printStackTrace();
	   return -1;
	}


// throws/throw关键字：
// 如果一个方法没有捕获一个检查性异常，那么该方法必须使用throws 关键字来声明。throws关键字放在方法签名的尾部。
// 也可以使用throw关键字抛出一个异常，无论它是新实例化的还是刚捕获到的。

// 重写方法时需要抛出与原方法同样的异常或者不抛异常

//下面的方法声明抛出RemoteException和InsufficientFundsException：
	import java.io.*;
	public class className
	{
	   public void withdraw(double amount) throws RemoteException, //声明方法抛出异常
				      InsufficientFundsException
	   {
	       // Method implementation
	   }
	   //Remainder of class definition
	}

	// finally代码块出现在catch代码块最后，语法如下：
	 try{
	    // 程序代码
	 }catch(异常类型1 异常的变量名1){
	    // 程序代码
	 }catch(异常类型2 异常的变量名2){
	    // 程序代码
	 }finally{
	    // 程序代码
	 }


	public class ExcepTest{

	   public static void main(String args[]){
	      int a[] = new int[2];
	      try{
		 System.out.println("Access element three :" + a[3]);
	      }catch(ArrayIndexOutOfBoundsException e){
		 System.out.println("Exception thrown  :" + e);
	      }
	      finally{
		 a[0] = 6;
		 System.out.println("First element value: " +a[0]);
		 System.out.println("The finally statement is executed");
	      }
	   }
	}


/*
声明自定义异常
在Java中你可以自定义异常。编写自己的异常类时需要记住下面的几点。
所有异常都必须是Throwable的子类。
如果希望写一个检查性异常类，则需要继承Exception类。
如果你想写一个运行时异常类，那么需要继承RuntimeException 类。
可以像下面这样定义自己的异常类：
*/
class MyException extends Exception{
}

	// 文件名InsufficientFundsException.java
	import java.io.*;

	public class InsufficientFundsException extends Exception
	{
	   private double amount;
	   public InsufficientFundsException(double amount)
	   {
	      this.amount = amount;
	   } 
	   public double getAmount()
	   {
	      return amount;
	   }
	}


Runtime Exception： 
在 定义方法时不需要声明会抛出runtime exception； 在调用这个方法时不需要捕获这个runtime exception； runtime exception是从java.lang.RuntimeException或java.lang.Error类衍生出来的。
例如：nullpointexception，IndexOutOfBoundsException就属于runtime exception 

Exception:
定 义方法时必须声明所有可能会抛出的exception； 在调用这个方法时，必须捕获它的checked exception，不然就得把它的exception传递下去；exception是从java.lang.Exception类衍生出来的。
例 如：IOException，SQLException就属于Exception


常见的RuntimeException
                                      
RuntimeException是开发中最容易遇到的，下面列举一下常见的RuntimeException：
1、NullPointerException：见的最多了，其实很简单，一般都是在null对象上调用方法了。
      String s=null;
      boolean eq=s.equals(""); // NullPointerException
   这里你看的非常明白了，为什么一到程序中就晕呢？
   public int getNumber(String str){
　　if(str.equals("A")) return 1;
　　 else if(str.equals("B")) return 2;
   }
   这个方法就有可能抛出NullPointerException,我建议你主动抛出异常，因为代码一多，你可能又晕了。
   public int getNumber(String str){
　　if(str==null) throw new NullPointerException("参数不能为空");
                                   //你是否觉得明白多了
　　if(str.equals("A")) return 1;
　　    else if(str.equals("B")) return 2;
   }
2、NumberFormatException：继承IllegalArgumentException，字符串转换为数字时出现。比如int i= Integer.parseInt("ab3");
3、ArrayIndexOutOfBoundsException:数组越界。比如 int[] a=new int[3]; int b=a[3];
4、StringIndexOutOfBoundsException：字符串越界。比如 String s="hello"; char c=s.chatAt(6);
5、ClassCastException:类型转换错误。比如 Object obj=new Object(); String s=(String)obj;
6、UnsupportedOperationException:该操作不被支持。如果我们希望不支持这个方法，可以抛出这个异常。既然不支持还要这个干吗？有可能子类中不想支持父类中有的方法，可以直接抛出这个异常。
7、ArithmeticException：算术错误，典型的就是0作为除数的时候。
8、IllegalArgumentException：非法参数，在把字符串转换成数字的时候经常出现的一个异常，我们可以在自己的程序中好好利用这个异常。



//-------------------------------------------------------------------

1、最少5年以上Java研发相关工作经验，深刻理解java的oop极其特征；

2、精通spring、struts、hibernate、ibatis等主流开源框架，熟悉J2EE体系结构；

3、熟悉HTML、JavaScript、XML，熟练使用Ajax；熟悉WebService原理及实现方式；

4、熟悉Linux操作系统。

5、逻辑思维能力强，有良好的编程习惯，具备较强的学习能力和钻研精神，熟悉敏捷开发流程；

6、熟练使用JDBC、IO包、Util包、Text包、JMS、RMI、线程，熟练使用java中常用的api。比较强的设计能力，能够熟练编写设计文档，指导初级和中级工程师的编码，帮助解决各种功能点实现时遇到的问题。

7、熟练掌握设计模式，并且能够在需要的应用场景运用自如。对代码可重用性，可维护性，可扩展性等有深刻的理解和研究，能够总结出自己独特的编码经验。

8、精通两种以上的框架设计，能读懂优秀框架源码，并且深刻理解它的实现原理和思路。

9、精通两种 以上web服务器，对服务器的配置、调优和技巧做了深入的研究。

10、熟悉两种以上主流的数据库，能够调优sql，熟练存储过程编码。

11、熟悉互联网调优的5个以上中间件 ，能够制定互联网关键问题的解决方案。

12、比较强的信息收集能力和比较强的随机应变能力，善于思考，善于总结，执行力强，性格随和，心态好，能够承受一定的压力，能很快融入团队。

13、较强的沟通能力、表达能力，能够即时用简短的语言表达项目中遇到的复杂问题，能够站在更高的高度分析问题。很强的领悟性。


dangdang

职位描述：
1、JAVA基础扎实，精通io、多线程、集合等基础框架，了解jvm；

2、 熟悉Mysql，并具备sql优化知识

3、熟悉redis、rpc、消息队列、zookeeper等常用开源组件或技术的应用；

1、 熟练使用springmvc、spring、mybatis等常见框架，熟悉机制和原理；

2、 熟悉前端技术html、css、js，能灵活运用bootstrap、jquery；

3、 熟悉Linux环境下开发部署，熟悉Shell或Python或Ruby。

任职要求:

1、 本科及以上学历，3至5年相关工作经验，具有良好的数据结构、网络、操作系统等计算机基础知识；

2、 优秀的学习能力和技术自驱力，具有和工作年限相匹配的技术深度和广度；

3、 熟练使用Mysql、Redis、Kafka、zookeeper等，了解其原理者优先；

4、 有大型互联网/电子商务公司工作经验者优先。
