package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int num;
		int m = -100000;
		int n = -100000;
		int[] a = new int[300];
		String c = new String(new char[300]);
		for (i = 0;i < 300;i++)
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
		num = i;
		if (i == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i <= num;i++)
			{
				if (a[i] > m)
				{
					m = a[i];
				}
			}
			for (i = 0;i <= num;i++)
			{
				if (a[i] == m)
				{
					a[i] = -10000;
				}
			}
			for (i = 0;i <= num;i++)
			{
				if (a[i] > n)
				{
					n = a[i];
				}
			}
			if (n == m || n == -10000)
			{
				System.out.print("No");
			}
			else
			{
				System.out.printf("%d",n);
			}
		}
		return 0;
	}


}

