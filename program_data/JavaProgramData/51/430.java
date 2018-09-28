package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		int[] c = new int[500];
		int max;
		int zhi;
		String a = new String(new char[501]);
		char[][] b = new char[500][5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0;i <= (len - n);i++)
		{
			for (j = 0;j < n;j++)
			{
				b[i][j] = a.charAt(i + j);
			}
			b[i][n] = '\0';
		}
		for (i = 0;i <= (len - n);i++)
		{
			for (j = i;j <= (len - n);j++)
			{
				if (strcmp(b[i],b[j]) == 0)
				{
					c[i]++;
				}
			}
		}
		max = 0;
		zhi = c[0];
		for (i = 0;i <= (len - n);i++)
		{
			if (c[i] > zhi)
			{
				zhi = c[i];
				max = i;
			}
		}
		if (zhi == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",zhi);
			for (i = 0;i <= (len - n);i++)
			{
				if (c[i] == zhi)
				{
					System.out.printf("%s\n",b[i]);
				}
			}
		}
		return 0;
	}
}

