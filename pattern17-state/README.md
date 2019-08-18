## 状态模式

**模式定义**

允许一个对象在其内部状态改变时改变它的行为，对象看起来似乎修改了它的类。

## 优点
1. 简化应用逻辑控制

    状态模式使用单独的类来封装一个状态的处理。如果把一个大的程序控制分成很多小块，每块定义一个状态来代表，
那么就可以把这些逻辑控制的代码分散到很多单独的状态类中去，这样就把着眼点从执行状态提高到整个对象的状态，
使得代码结构化和意图更清晰，从而简化应用的逻辑控制。对于依赖于状态的if-else，理论上来讲，也可以改变成应用状态模式来实现，
把每个if 或else 块定义一个状态来代表，那么就可以把块内的功能代码移动到状态处理类中，
从而减少if-else，避免出现巨大的条件语句。

1. 更好地分离状态和行为

    状态模式通过设置所有状态类的公共接口，把状态和状态对应的行为分离开，
把所有与一个特定的状态相关的行为都放入一个对象中，使得应用程序在控制的时候，只需要关心状态的切换，
而不用关心这个状态对应的真正处理。

1. 更好的扩展性

    引入了状态处理的公共接口后，使得扩展新的状态变得非常容易，只需要新增加一个实现状态处理的公共接口的实现类，
然后在进行状态维护的地方，设置状态变化到这个新的状态即可。

1. 显式化进行状态转换

    状态模式为不同的状态引入独立的对象，使得状态的转换变得更加明确。而且状态对象可以保证上下文不会发生内部状态不一致的情况，
因为上下文中只有一个变量来记录状态对象，只要为这一个变量赋值就可以了。

## 缺点
状态模式也有一个很明显的缺点，一个状态对应一个状态处理类，会使得程序引入太多的状态类，这样程序变得杂乱。

## 本质
状态模式的本质：根据状态来分离和选择行为。

从设计原则上来看，策略模式很好地体现了开闭原则和里氏替换原则。

## 使用场景
建议在以下情况中选用状态模式。

1. 如果一个对象的行为取决于它的状态，而且它必须在运行时刻根据状态来改变它的行为，可以使用状态模式，来把状态和行为分离开。
虽然分离开了，但状态和行为是有对应关系的，可以在运行期间，通过改变状态，就能够调用到该状态对应的状态处理对象上去，
从而改变对象的行为。

1. 如果一个操作中含有庞大的多分支语句，而且这些分支依赖于该对象的状态，可以使用状态模式，
把各个分支的处理分散包装到单独的对象处理类中，这样，这些分支对应的对象就可以不依赖于其他对象而独立变化了。