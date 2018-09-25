package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		int[] z = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i < a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(z[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < a;i++)
		{
			if (i == 0)
			{
				b = z[i];
				c = 0;
			}
			else
			{
				if (z[i] > b)
				{
				b = z[i];
				c = 0;
				}
			}
		}
		System.out.printf("%d\n",b);
		for (i = 0;i < a;i++)
		{
			if (z[i] < b && z[i]> c)
			{
				c = z[i];
			}
		}
		System.out.printf("%d\n",c);
		return 0;
	}
}

