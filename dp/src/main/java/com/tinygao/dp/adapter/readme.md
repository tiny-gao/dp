1、一个接口
2、client只使用这个接口
   而注入这个到client的实例是一个适配器
3、适配器实现了这个接口
4、适配器中的方法委托给第三个类中的其他方法去实现