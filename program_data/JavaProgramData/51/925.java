package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[500]);
		char[][] string = new char[500][500];
		int i;
		int j;
		int m;
		int n;
		int k = 0;
		int[] a = new int[500];
		int max = 0;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		n = str.length();
		for (i = 0;i <= n - m;i++)
		{
			for (j = i;j < i + m;j++)
			{
				String[i][k] = str.charAt(j);
				k++;
			}
			String[i][k] = '\0';
			k = 0;
		}
		for (i = 0;i <= n - m;i++)
		{
			for (j = 0;j <= n - m;j++)
			{
				if (strcmp(String[i],string[j]) == 0)
				{
					a[i]++;
				}
			}
		}
		for (i = 0;i <= n - m;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		if (max <= 1)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i <= n - m;i++)
			{
				if (a[i] == max)
				{
					for (j = 0;j < i;j++)
					{
						if (strcmp(String[i],string[j]) == 0)
						{
							t = 1;
							break;
						}
					}
					if (t == 0)
					{
						System.out.printf("%s\n",string[i]);
					}
				}
				t = 0;
			}
		}
		return 0;
	}






}

