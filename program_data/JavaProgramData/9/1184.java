package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[100][10];
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int n;
		int k;
		int l;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			b[i] = a[i];


		}
		for (k = n - 1;k > 0;k--)
		{
			for (i = 0;i < k;i++)
			{
				if (b[i] > b[i + 1])
				{
					l = b[i];
					b[i] = b[i + 1];
				b[i + 1] = l;
				}
			}
		}
		i = n - 1;
		while (b[i] >= 60)
		{
		for (j = 0;j < n;j++)
		{
			if (a[j] == b[i])
			{
				System.out.printf("%s\n",s[j]);
			}
		}
		while (b[i - 1] == b[i])
		{
			i--;
		}
		i--;


		}
		for (i = 0;i < n;i++)
		{
			if (a[i] < 60)
			{
			System.out.printf("%s\n",s[i]);
			}
		}
		return 0;

	}
}

