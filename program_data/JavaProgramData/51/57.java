package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int sum = 0;
		int[] b = new int[1000];
		int max = 0;
		int maxi = 0;
		String a = new String(new char[1000]);
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
		for (i = 0;i < 1000;i++)
		{
			b[i] = 0;
		}
		for (i = 0;i < a.length();i++)
		{
			for (j = i + 1;j < a.length();j++)
			{
				if (a.charAt(i) == a.charAt(j))
				{
					for (k = 1;k < n;k++)
					{
						if (a.charAt(i + k) == a.charAt(j + k))
						{
							sum++;
						}
					}
					if (sum == n - 1)
					{
						b[i]++;
					}
				}
				sum = 0;
			}
		}
		max = 0;
		for (i = 0;i < a.length();i++)
		{
			if (b[i] >= max)
			{
				max = b[i];
			}
		}
		if (max != 0)
		{
		System.out.printf("%d\n",max + 1);
		for (i = 0;i < a.length();i++)
		{
			if (b[i] == max)
			{
				for (j = 0;j < n;j++)
				{
					System.out.printf("%c",a.charAt(i + j));
				}
				System.out.print("\n");
			}
		}
		}
		else
		{
			System.out.print("NO");
		}

		return 0;
	}

}

