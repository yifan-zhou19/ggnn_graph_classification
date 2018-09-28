package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int m;
		int k;
		int[] time = new int[500];
		int max = 1;
		int p;
		String a = new String(new char[500]);
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
		for (i = 0;i <= (a.length() - n);i++)
		{
			for (k = i;k <= (a.length() - n);k++)
			{
				p = 0;
				for (j = 0;j < n;j++)
				{
					if (a.charAt(k + j) == a.charAt(i + j))
					{
						p++;
					}
				}
				if (p == n)
				{
					time[i]++;
				}
			}
		}

		for (i = 0;i <= (a.length() - n);i++)
		{
			if (max <= time[i])
			{
				max = time[i];
			}
		}
		if (max <= 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i <= (a.length() - n);i++)
			{
				if (time[i] == max)
				{
					for (j = 0;j < n;j++)
					{
						System.out.printf("%c",a.charAt(i + j));
					}
					System.out.print("\n");
				}
			}
		}
	}

}

