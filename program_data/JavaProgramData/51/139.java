package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int c;
		int max = 0;
		int[] num = new int[1000];
		int tag1;
		int tag2;
		int[] tag = new int[1000];
		String a = new String(new char[10000]);
		char[][] b = new char[1000][1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		l = a.length();
		for (i = 0;i < l;i++)
		{
			for (j = i;j < n + i;j++)
			{
				b[i][j - i] = a.charAt(j);
			}
		}
		c = l - n + 1;
		for (i = 0;i < c;i++)
		{
			for (k = i + 1;k < c;k++)
			{
				tag1 = 1;
				for (j = 0;j < n;j++)
				{
					if (b[i][j] != b[k][j])
					{
						tag1 = 0;
					}
				}
				if (tag1 == 1)
				{
					tag[i]++;
				}
			}
		}
		tag2 = 0;
		for (i = 0;i < c;i++)
		{
			if (tag[i] + 1 > max)
			{
				max = tag[i] + 1;
			}
		}
			if (max > 1)
			{
				tag2 = 1;
			}
		if (tag2 == 0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i < c;i++)
			{
				if (tag[i] + 1 == max)
				{
					System.out.printf("%s\n",b[i]);
				}
			}
		}

	}

}

