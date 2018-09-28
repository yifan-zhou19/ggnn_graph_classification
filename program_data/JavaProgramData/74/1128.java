package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int s;
		int p;
		int q;
		int b = 0;
		int[] c = new int[1000];
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
			for (i = m;i <= n;i++)
			{
				q = 0;
				p = i;
				while (p != 0)
				{
					s = p % 10;
					q = 10 * q + s;
					p = p / 10;
				}
				if (q != i)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto a;
				}
				for (j = 2;j <= Math.sqrt(i);j++)
				{
					if (i % j == 0)
					{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto a;
					}
				}
				b++;
				c[b] = i;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				a:
				;
			}
		if (b == 0)
		{
			System.out.print("no");
		}
		else if (b == 1)
		{
			System.out.printf("%d",c[1]);
		}
		else
		{
			System.out.printf("%d",c[1]);
			for (i = 2;i <= b;i++)
			{
				System.out.printf(",%d",c[i]);
			}
		}
	}
}

