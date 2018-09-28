package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] c = new char[510][7];
		String wenben = new String(new char[510]);
		int n;
		int m;
		int i;
		int j;
		int k;
		int[] cishu = new int[510];
		int max;
		int zd;
		int pinshu = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		System.in.read();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			wenben = tempVar2.charAt(0);
		}
		n = wenben.length();
		for (i = 0;i < n - m + 1;i++)
		{
							for (j = i;j < i + m;j++)
							{
											c[i][j - i] = wenben.charAt(j);
							}
							c[i][m] = '\0';
		}
		for (i = 0;i < n - m + 1;i++)
		{
							for (j = i;j < n - m + 1;j++)
							{
												if (strcmp(c[i],c[j]) == 0)
												{
													cishu[i] += 1;
												}
							}
		}
		max = cishu[0];
		zd = 0;
		for (i = 0;i < n - m + 1;i++)
		{
							if (cishu[i] > max)
							{
											 max = cishu[i];
											 zd = i;
							}
		}
		if (max <= 1)
		{
			System.out.print("NO");
		}
		else
		{
		System.out.printf("%d\n",max);
		for (i = 0;i < n - m + 1;i++)
		{
							if (cishu[i] == max)
							{
								System.out.printf("%s\n",c[i]);
							}
		}
		}
		return 0;
	}
}

