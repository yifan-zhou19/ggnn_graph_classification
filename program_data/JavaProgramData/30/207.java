package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int a;
		int b;
		int c;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			a = i / 100;
			b = (i - a * 100) / 10;
			c = i - a * 100 - b * 10;
			if ((i % 7 == 0) || (a == 7) || (b == 7) || (c == 7))
			{
				continue;
			}
			else
			{
				s = s + i * i;
			}
		}
		System.out.printf("%d\n",s);



	}

}

