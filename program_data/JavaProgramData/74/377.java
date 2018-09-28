package <missing>;

public class GlobalMembers
{
	public static int fold(int a)
	{
		int f;
		int i;
		int k;
		if (a < 10)
		{
			return (a);
		}
		else
		{
			k = a % 10;
			a = a / 10;
			for (i = 1;i <= a;i = i * 10)
			{
				;
			}
			f = k * i + fold(a);
			return (f);
		}
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int t = 0;
		int k = 0;
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
		if (m % 2 == 0)
		{
			m++;
		}
		for (i = m;i <= n;)
		{
			if (i % 2 == 0)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto a1;
			}
			for (j = 3;j < Math.sqrt(i) + 1;j += 2)
			{
				if (i % j == 0)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto a1;
				}
			}
			t = fold(i);
			if (t == i)
			{
				if (k == 0)
				{
					System.out.printf("%d",i);
					k++;
				}
				else
				{
					System.out.printf(",%d",i);
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	a1:
	i = i + 2;
		}
		if (k == 0)
		{
			System.out.print("no");
		}
	}

}

