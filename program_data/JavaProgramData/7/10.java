package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] c = new char[3][300];
		int l1;
		int l2;
		int i = 0;
		int j = 0;
		int k = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c[0] = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c[1] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c[2] = tempVar3.charAt(0);
		}
	/*	printf("%s",c[0]);*/

		l1 = String.valueOf(c[0]).length();
		l2 = String.valueOf(c[1]).length();

		while (i < l1)
		{
			if (k == l2)
			{
				break;
			}
			if (c[0][i] == c[1][j])
			{
				k += 1;
				j += 1;
				i += 1;
			}
			else
			{
				if (j < l2 - 1)
				{
					k = 0;
					j += 1;
				}
				if (j == l2 - 1)
				{
					k = 0;
					j = 0;
					i += 1;
				}
			}
		}
	/*	printf("%d\n",i-l2);*/
		if (k == l2)
		{
			for (n = i - l2;n < i;n++)
			{
				c[0][n] = c[2][n + l2 - i];
			}
		}
		System.out.printf("%s\n",c[0]);



	}
}

