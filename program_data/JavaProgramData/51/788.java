package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int z;
		int[] b = new int[500];
		String s = new String(new char[500]);
		char[][] a = new char[500][6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		l = s.length();
		m = 1;
		for (i = 0;i < l - n + 1;i++)
		{
							for (j = 0;j < n;j++)
							{
											a[i][j] = s.charAt(i + j);
							}
		}
		for (i = 0;i < l - n;i++)
		{
							b[i] = 1;
							for (j = (i + 1);j < l - n + 1;j++)
							{
												z = 1;
												z = strcmp(a[i],a[j]);
												if (z == 0)
												{
													b[i]++;
												}
							}
							if (b[i] > m)
							{
								m = b[i];
							}
		}
		if (m == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",m);
			for (i = 0;i < l - n;i++)
			{
							  if (b[i] == m)
							  {
								  System.out.printf("%s\n",a[i]);
							  }
			}
		}

	}

}

