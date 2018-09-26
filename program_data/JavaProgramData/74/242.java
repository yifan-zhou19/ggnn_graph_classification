package <missing>;

public class GlobalMembers
{
	public static int su(int x)
	{
		if (x == 1)
		{
			return (0);
		}
		else
		{
			int i;
			int flag = 1;
			for (i = 2;i <= x / 2;i++)
			{
				if (x % i == 0)
				{
					flag = 0;
					break;
				}
			}
			return (flag);
		}
	}
	public static int hui(int x)
	{
		int i = x;
		int n = 0;
		int flag = 1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		while (i > 0)
		{
			i = i / 10;
			n += 1;
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		for (i = x;i > 0;i = i / 10)
		{
			p = i % 10;
			p += 1;
		}
		i = 0,p -= n;
		while (i < n / 2)
		{
			if (*(p + i) != *(p + n - i - 1))
			{
				flag = 0;
				break;
			}
			i += 1;
		}
		return (flag);
	}
	public static void Main()
	{
		int m;
		int n;
		int flag = 0;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (x = m;x <= n;x++)
		{
			if (su(x) + hui(x) == 2)
			{
				if (flag == 1)
				{
					System.out.print(",");
				}
				System.out.printf("%d",x);
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("no");
		}
	}
}

