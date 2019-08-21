## 访问者模式

**模式定义**

表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作。

## 优点
1. 好的扩展性

    能够在不修改对象结构中的元素的情况下，为对象结构中的元素添加新的功能。

1. 好的复用性

    可以通过访问者来定义整个对象结构通用的功能，从而提高复用程度。

1. 分离无关行为

    可以通过访问者来分离无关的行为，把相关的行为封装在一起，构成一个访问者，这样每一个访问者的功能都比较单一。

## 缺点

1. 对象结构变化很困难

不适用于对象结构中的类经常变化的情况，因为对象结构发生了改变，访问者的接口和访问者的实现都要发生相应的改变，代价太高。

2. 破坏封装

访问者模式通常需要对象结构开放内部数据给访问者和ObjectStructrue，这破坏了对象的封装性。

## 本质
访问者模式的本质：预留通路，回调实现。


## 使用场景
建议在以下情况中选用访问者模式。

1. 如果想对一个对象结构实施一些依赖于对象结构中具体类的操作，可以使用访问者模式。
2. 如果想对一个对象结构中的各个元素进行很多不同的而且不相关的操作，为了避免这些操作使类变得杂乱，
可以使用访问者模式。把这些操作分散到不同的访问者对象中去，每个访问者对象实现同一类功能。
3. 如果对象结构很少变动，但是需要经常给对象结构中的元素对象定义新的操作，可以使用访问者模式。
