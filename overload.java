class overload
{
void print()
{System.out.println("hello");}
void print(int n)
{System.out.println("hello"+n);}
void print(float f)
{System.out.println("hello"+f);}
public static void main(String[] args)
{
overload o1=new overload();
overload o2=new overload();
overload o3=new overload();
o1.print();
o1.print(5);
o1.print(0.5f);
}
}


