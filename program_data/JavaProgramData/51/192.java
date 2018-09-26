package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		char[][] b = new char[250][5];
		char x;
		int[] c = new int[250];
		int n;
		int i;
		int j;
		int k;
		int l;
		int m;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			x = tempVar2.charAt(0);
		}
		a = new Scanner(System.in).nextLine();
		k = a.length();
		for (i = 0;i <= k - n;i++)
		{
			for (j = 0;j < n;j++)
			{
			b[i][j] = a.charAt(i + j);
			}
		}
		for (i = 0;i <= k - n;i++)
		{
			for (j = i + 1;j <= k - n;j++)
			{
				if (b[i][0] != '\0')
				{
					y = 0;
					for (m = 0;m < n;m++)
					{
						if (b[i][m] != b[j][m])
						{
							y++;
						}
					}
					if (y == 0)
					{
					c[i] = c[i] + 1;
					b[j][0] = '\0';
					}
				}
			}
		}
		l = c[0] + 1;
		for (i = 0;i < k - n;i++)
		{
			if (c[i] > l - 1)
			{
				l = c[i] + 1;
			}
		}
		if (l == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",l);
		for (i = 0;i <= k - n;i++)
		{
			if (c[i] == l - 1)
			{
				for (j = 0;j < n;j++)
				{
					System.out.printf("%c",b[i][j]);
				}
				System.out.print("\n");
			}
		}
		}
	}



}

