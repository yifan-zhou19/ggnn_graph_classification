package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int j;
		int m;
		int l;
		int[] a = new int[500];
		int[] b = new int[500];
		int max = 0;
		String[] c = {"\0"};
		char t;
		String s = new String(new char[501]);
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
		for (i = 0;s.charAt(i);i++)
		{
			for (j = 0;j < n;j++)
			{
				c[i][j] = s.charAt(i + j);
			}
		}
		l = s.length() - n + 1;
		for (i = 0;i < l;i++)
		{
			b[i] = 1;
		}
		for (i = 1;i < l;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (b[i] != 0)
				{
					if (strcmp(c[i],c[j]) == 0)
					{
					a[j]++;
					b[i] = 0;
					}
				}
			}
		}
		for (i = 0;i < l;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		if (max == 0)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",max + 1);
			for (i = 0;i < l;i++)
			{
				if (a[i] == max)
				{
					System.out.printf("%s\n",c[i]);
				}
			}
		}
	}

}

