package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m = 0;
		int n;
		int k;
		int i = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		loop:
		i++;
		m = i * n + k;
		for (j = 0;j < n - 1;j++)
		{
			if (m % (n - 1) == 0)
			{
				m = m / (n - 1) * n + k;
			}
			else
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto loop;
			}
			if (j == n - 2)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto push;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		push:
		System.out.printf("%d\n",m);
	}
}

