package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		int i;
		int j;
		int c;
		c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a1 = new int[100];
		for (j = 0;j < 100;j++)
		{
			a1[j] = 0;
		}
		for (i = 0;i < n;i++)
		{
			a = 0;
			b = 0;
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
			if (a > 89 && a < 141 && b>59 && b < 91)
			{
				a1[i + 1] = a1[i] + 1;
			}
			if (a < 90 || a>140 || b < 60 || b>90)
			{
					a1[i + 1] = 0;
			}

		}
		for (i = 0;i < 1 + n;i++)
		{
			if (c < a1[i])
			{
				c = a1[i];
			}
		}
		System.out.printf("%d",c);
		return 0;

	}
}

