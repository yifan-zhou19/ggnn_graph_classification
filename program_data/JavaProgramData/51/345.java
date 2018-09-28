package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		char[][] b = new char[250][4];
		char c;
		int n;
		int k;
		int m = 0;
		int i;
		int j;
		int l;
		int y;
		int p;
		int[] d = new int[250];
		for (i = 0;i < 250;i++)
		{
			d[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		a = new Scanner(System.in).nextLine();
		k = a.length();
		for (i = 0;i <= k - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				b[m][j] = a.charAt(i + j);
			}
			m++;
		}
		for (i = 0;i < k - n;i++)
		{
			for (j = i + 1;j <= k - n;j++)
			{
				if (b[i][0] != '\0')
				{
					y = 0;
				for (l = 0;l < n;l++)
				{
					if (b[i][l] != b[j][l])
					{
						y++;
					}
				}
				if (y == 0)
				{
					b[j][0] = '\0';
					d[i]++;
				}
				}
			}
		}
		p = d[i] + 1;
		for (i = 0;i <= k - n;i++)
		{
			if (d[i] > p - 1)
			{
				p = d[i] + 1;
			}
		}
		if (p == 1)
		{
			System.out.print("NO");
		}
		else
		{
		System.out.printf("%d\n",p);
			for (i = 0;i < k - n;i++)
			{
			if (d[i] == p - 1)
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

