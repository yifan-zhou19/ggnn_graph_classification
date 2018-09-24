package <missing>;

public class GlobalMembers
{
	public static int x;
	public static int y;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1=&x;
	public static int p1 = x;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2=&y;
	public static int p2 = y;
	public static void Read()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p2 = Integer.parseInt(tempVar2);
		}
	}
	/*int array for Pathway a[11],b[11]*/
	public static int[] a = new int[11];
	public static int[] b = new int[11];
	/*int Function return Answer (x>=2^(Answer-1)&&x<(2^Answer))   as  FuncofA  */
	public static int FuncofA(int X)
	{
		int i;
		for (i = 1;;i++)
		{
			if ((Math.pow(2.0,i - 1) <= X) && Math.pow(2.0,i)> X)
			{
				return i;
			}
			else
			{
			}
		}
	}
	/*Function for binary tree  as  FuncofB*/
	public static void FuncofB()
	{
		int i;
		for (i = (FuncofA(x));i >= 1;i--)
		{
			a[i - 1] = x;
			x /= 2;
		}
		for (i = (FuncofA(y));i >= 1;i--)
		{
			b[i - 1] = y;
			y /= 2;
		}
	}
	public static void Main()
	{
		Read();
		if (x == y)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto equal;
		}
		else
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto unequal;
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	equal:
		System.out.printf("%d",x);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto End;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	unequal:
		FuncofB();
		int i;
		for (i = 1;;i++)
		{
			if (a[i - 1] == b[i - 1])
			{
			}
			else
			{
				System.out.printf("%d",a[i - 2]);
				break;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	End:
		;
	}
}

