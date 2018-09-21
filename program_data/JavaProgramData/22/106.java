package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[400];
		int i;
		int j;
		int max;
		int k;
		int p = 1;
		String c = new String(new char[400]);
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, tempVar2);
			}
			if (c.charAt(i) == '\n')
			{
				break;
			}
		}
		max = a[0];
		k = 0;
		for (j = 1;j <= i;j++)
		{
			if (max < a[j])
			{
				max = a[j];
				k = j;
			}
		}
		for (j = 0;j <= i;j++)
		{
			if (a[j] == max)
			{
				a[j] = 0;
			}
		}
		max = a[0];
		k = 0;
		for (j = 1;j <= i;j++)
		{
			if (max < a[j])
			{
				max = a[j];
			}
		}

		for (j = 1;j <= i;j++)
		{
			if (a[j] != a[0])
			{
				break;
			}
		}
		if (j == i + 1)
		{
				p = 0;
		}

		if (p == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",max);
		}

	}

}

