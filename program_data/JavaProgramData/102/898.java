package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int n;
		double[] a = new double[50];
		double e;
		final String b = "";
		final String c = "";
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
				b = tangible.StringFunctions.changeCharacter(b, i, tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j] < a[j + 1])
				{
					e = a[j];
					a[j] = a[j + 1];
					a[j + 1] = e;
					c = b.charAt(j);
					b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
					b = tangible.StringFunctions.changeCharacter(b, j + 1, c);
				}
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			if (strcmp(b.charAt(i),"male") == 0)
			{
				if (k == 0)
				{
					System.out.printf("%.2lf",a[i]);
					k++;
				}
				else
				{
					System.out.printf(" %.2lf",a[i]);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (strcmp(b.charAt(i),"female") == 0)
			{
				System.out.printf(" %.2lf",a[i]);
			}
		}
		return 0;
	}

}

