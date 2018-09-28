package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int[] y = new int[100];
		int i;
		int j = 1;
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
				b = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c = Integer.parseInt(tempVar3);
			}
			if (b > 140 || b < 90 || c>90 || c < 60)
			{
				y[j] = i + 1;
				j++;
			}
		}
		y[0] = 0;
		y[j] = a + 1;
		j++;
		a = y[1] - y[0];
		for (i = 1;i < j - 1;i++)
		{
			if ((y[i + 1] - y[i]) > a)
			{
				a = y[i + 1] - y[i];
			}
		}
		a = a - 1;
		System.out.printf("%d",a);
		return 0;
	}
}

