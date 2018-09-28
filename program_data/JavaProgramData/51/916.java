package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int bz;
		int i;
		int j;
		int k;
		int len;
		int m;
		int d;
		int temp;
		String a = new String(new char[505]);
		String t = new String(new char[10]);
		char[][] b = new char[700][10];
		int[] c = new int[700];
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
		len = a.length();
		d = len - n + 1;
		for (i = 0;i < d;i++)
		{
			k = i;
			for (j = 0;j < n;j++)
			{
				b[i][j] = a.charAt(k);

				k++;
			}
		}
		for (i = 0;i < d;i++)
		{
			for (k = 0;k < i;k++)
			{
				if (strcmp(b[i],b[k]) == 0)
				{
					c[k]++;
					break;
				}
			}
		}
		for (i = 0;i < d;i++)
		{
			for (j = 0;j < d - 1;j++)
			{
				if (c[j] < c[j + 1])
				{
					temp = c[j];
					t = b[j];
					c[j] = c[j + 1];
					b[j] = b[j + 1];
					c[j + 1] = temp;
					b[j + 1] = t;
				}
			}
		}

		if (c[0] == 0)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < d - 1;i++)
			{
				if (c[i] != c[i + 1])
				{
					bz = i + 1;
					break;
				}
			}
			if (i == d - 1)
			{
				bz = d;
			}
			System.out.printf("%d\n",c[0] + 1);
			for (m = 0;m < bz;m++)
			{
				System.out.printf("%s\n",b[m]);
			}
		}
		return 0;
	}

}

