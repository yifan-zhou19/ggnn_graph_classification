package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int u;
		int n;
		String s = new String(new char[1000]);
		int[] num = new int[1000];
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
		for (i = 0;i <= s.length() - n;i++)
		{
			for (j = i;j <= s.length() - n;j++)
			{
				u = 1;
				for (k = 0;k <= n - 1;k++)
				{
					if (s.charAt(i + k) != s.charAt(j + k))
					{
						u = 0;
					}
				}
				if (u == 1)
				{
					num[i]++;
				}
			}
		}
		for (i = 1,k = 0;i <= s.length() - n;i++)
		{
			if (num[i] > num[k])
			{
				k = i;
			}
		}
		if (num[k] == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",num[k]);
			for (i = 0;i <= s.length() - n;i++)
			{
				if (num[i] == num[k])
				{
					for (j = i;j <= i + n - 1;j++)
					{
						System.out.printf("%c",s.charAt(j));
					}
					System.out.print("\n");
				}
			}
		}
	}





}

