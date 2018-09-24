package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int h;
		int k;
		int[] c = new int[500];
		String a = new String(new char[500]);
		char[][] b = new char[500][5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		for (i = 0;i < a.length() - n + 1;i++)
		{
			for (j = 0;j < n;j++)
			{
				b[i][j] = a.charAt(i + j);
			}
		}
		for (i = 0;i < a.length() - n + 1;i++)
		{
			for (j = i + 1;j < a.length() - n + 1;j++)
			{
				h = 1;
				for (k = 0;k < n;k++)
				{
					if (b[i][k] != b[j][k])
					{
						h = 0;
						break;
					}
				}
					if (h == 1)
					{
						c[i]++;
					}

			}
		}
		h = c[0];
		for (i = 1;i < a.length() - n + 1;i++)
		{
			if (h < c[i])
			{
				h = c[i];
			}
		}
		if (h <= 0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",h + 1);
		for (i = 0;i < a.length() - n + 1;i++)
		{
			if (h == c[i])
			{
				for (k = 0;k < n;k++)
				{
					System.out.printf("%c",b[i][k]);
				}
				System.out.print("\n");
			}
		}
		}
		return 0;
	}
}

