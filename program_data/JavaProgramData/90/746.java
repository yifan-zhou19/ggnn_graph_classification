package <missing>;

public class GlobalMembers
{
	public static int f(int a,int b)
	{
		int i;
		int n = 0;
		if (a == 0 || b == 1)
		{
		return (1);
		}
		else if (a < b)
		{
		f(a, a);
		}
		else
		{
			n = f(a - b, b) + f(a, b - 1);
		}
	}
	public static int Main()
	{
		int i;
		int n;
		int j = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",f(a, b));
		}
	}

}

