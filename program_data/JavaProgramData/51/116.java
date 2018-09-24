package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		char[][] b = new char[500][6];
		String c = new String(new char[6]);
		int[] m = new int[500];
		int n;
		int i;
		int j;
		int k;
		int e = 0;
		int f;
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
		for (i = 0;i <= a.length() - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				b[i][j] = a.charAt(i + j);
			}
			b[i][j] = '\0';
		}
		for (i = 0;i <= a.length() - n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (strcmp(b[j],b[i]) == 0)
				{
					break;
				}
			}
			if (j == i)
			{
			for (k = i + 1;k <= a.length() - n;k++)
			{
				if (strcmp(b[k],b[i]) == 0)
				{
					m[i] += 1;
				}
			}
			}
		}
		for (i = 0;i <= a.length() - n;i++)
		{
			if (e < m[i])
			{
				e = m[i];
			}
		}
		if (e == 0)
		{
			System.out.print("NO");
		}
		else
		{
		System.out.printf("%d\n",e+1);
		for (i = 0;i <= a.length() - n;i++)
		{
			if (e == m[i])
			{
				System.out.printf("%s\n",b[i]);
			}
		}
		}
		return 0;
	}

}

