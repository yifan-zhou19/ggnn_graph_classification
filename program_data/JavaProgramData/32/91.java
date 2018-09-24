package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int[] la = new int[50];
		int[] lb = new int[50];
		char[][] a = new char[50][100];
		char[][] b = new char[50][100];
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
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
			la[i] = String.valueOf(a[i]).length();
			lb[i] = String.valueOf(b[i]).length();
			System.out.print("\n");
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < la[i] - lb[i];j++)
			{
				c.charAt(i)[j] = a[i][j];
			}
			for (j = la[i] - lb[i];j < la[i];j++)
			{
				c.charAt(i)[j] = a[i][j] - b[i][j - la[i] + lb[i]] + 48;
			}
			for (j = la[i] - 1;j >= 0;j--)
			{
				if (c.charAt(i)[j] < 48)
				{
					c.charAt(i)[j] += 10;
				c.charAt(i)[j - 1]--;
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			if (c.charAt(i)[0] == '0')
			{
		for (j = 0;i < la[i] - 1;j++)
		{
			c.charAt(i)[j] = c.charAt(i)[j + 1];
		}
			}
			System.out.printf("%s\n",c.charAt(i));
		}
	}




}

