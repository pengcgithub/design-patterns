# 装饰模式

## 简介

装饰模式，是面向对象编程领域中，一种动态地往一个类中添加新的行为的设计模式。就功能而言，修饰模式相比生成子类更为灵活，这样可以给某个对象而不是整个类添加一些功能。[引用-维基百科]()

装饰模式与继承关系的目的都是要扩展对象的功能，但是装饰模式可以提供比继承更多的灵活性。 装饰模式允许系统动态决定“贴上”一个需要的“装饰”，或者除 掉一个不需要的“装饰”。 继承关系则不同，继承关系是静态的，它在系统运行前就决定了。[引用2](https://blog.csdn.net/zhshulin/article/details/38665187)

## 举例说明

#### 星巴克咖啡

星巴克点饮料，假设咖啡店有默认HouseBlend、DarkRoast、Decaf、Espresso这么几类咖啡。购买咖啡时，客户也可以要求在其加入各种调料，例如：牛奶(milk)、豆浆(soy)、摩卡(mocha)。那么咖啡店会根据不同的咖啡以及加入的不同的调料收取不同的价格。

#### 第一次尝试

按照上述的需求，我们可以定义一个Beverage(饮料)的抽象类，然后店里的所有的饮料都必须继承此类。并且存在添加调料的情况，那么则组合创建多个类并继续继承Beverage抽象方法。

![](https://i.imgur.com/syRs2tx.png)

很明显使用上述方法会导致大量的类堆积，并且如果出现了咖啡的价格上调，或则新增了调料，那么会导致维护的困难。

#### 第二次尝试

如果按照第一次构想，那么会出现大量类堆积。此刻，我们可以将调料定义在Beverage类中，然后让咖啡继承Beverage基类。

![](https://i.imgur.com/57MmNXi.png)

上述构思确实减少了类堆积的问题，但似乎也不太灵活。如果调料的价格改变，那么也需要修改现有代码。

#### 第三次尝试（装饰模式）

由于上述两次构想均无法满足软件设计原则，所以引入**装饰模式**来解决继承带来的扩展性差的问题。

![](https://i.imgur.com/tSsGNAf.png)

定义一个Beverage的抽象基类类，内部定义了cost()方法来计算饮料的价格。其中可以将饮料（HouseBlend、DarkRoast、Decaf、Espresso）和调料（牛奶(milk)、豆浆(soy)、摩卡(mocha)）定义为被装饰者和装饰者两类。被装饰者代表饮料，直接继承Beverage基类，同时重写父类的cost()方法。装饰者则需要继承装饰类，此处的装饰类继承自Beverage基类，并引入Beverage类的引用。装饰者继承装饰类之后，需要重写装饰类中的cost()方法，并且调用父类的cost()方法，来统计饮料的价格。

#### 装饰模式代码实现

[装饰者代码实现](https://github.com/pengcgithub/design-patterns/tree/master/design-code/src/main/java/com/platform/design/decorator)

## Java IO 中的装饰者模式

#### IO的简单使用

<pre>

File file = new File("C:\\document_files\\github_file\\design-patterns\\input.txt");
InputStream fileInputStream = new FileInputStream(file);
BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

byte[] buffer = new byte[1024];

OutputStream fileOutputStream = new FileOutputStream(new File("C:\\document_files\\github_file\\design-patterns\\output.txt"));

int bytesRead = 0;
while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
    fileOutputStream.write(buffer);
}

fileInputStream.close();
fileOutputStream.close();

</pre>

上述代码`BufferedInputStream`就是对于`FileInputStream`的装饰，赋予了原IO对象更多的功能属性。

#### IO中如何体现装饰

![](https://i.imgur.com/agJmSLU.png)

## 总结

