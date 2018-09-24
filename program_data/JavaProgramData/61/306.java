package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		int c;
		if (n == 1 || n == 2)
		{
			c = 1;
		}
		else
		{
			c = f(n - 1) + f(n - 2);
		}
		return (c);
	}
	public static void Main()
	{
		int i;
		int m;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc(20 * (Integer.SIZE / Byte.SIZE));
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
				p + i = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			m = f(*(p + i));
		System.out.printf("%d\n",m);
		}
	}
}

