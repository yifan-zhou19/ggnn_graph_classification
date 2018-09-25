package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300]);
		char j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		int n = str.length();
		int i;
		int k;
		int l = 0;
		for (j = 'A';j <= 'Z';j++)
		{
			k = 0;
			for (i = 0;i < n;i++)
			{
				if (str.charAt(i) == j)
				{
					k++;
				}
			}
			if (k > 0)
			{
				System.out.printf("%c=%d\n",j,k);
			}
		}
		for (j = 'a';j <= 'z';j++)
		{
			k = 0;
			for (i = 0;i < n;i++)
			{
				if (str.charAt(i) == j)
				{
					k++;
				}
			}
			if (k > 0)
			{
				System.out.printf("%c=%d\n",j,k);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (str.charAt(i) < 'A' || str.charAt(i)>'z')
			{
				l++;
			}
		}
		if (l == n)
		{
			System.out.print("No\n");
		}
		return 0;
	}
}

