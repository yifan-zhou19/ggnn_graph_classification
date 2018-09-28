package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] len = new int[9999];
		int j;
		int total = 0;
		int k = 0;
		char[][] x = new char[9999][43];
		String p = x;
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
				p.Substring(i) = Integer.parseInt(tempVar2);
			}
			len[i] = String.valueOf(x[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			total = total + len[i];
			if (total + i - k > 80)
			{
				for (j = k;j < i - 1;j++)
				{
					System.out.printf("%s ",p.Substring(j));
				}
				System.out.printf("%s\n",p.Substring(i) - 1);
				k = i;
				i = i - 1;
				total = 0;
			}
		}
		if (k < n)
		{
			for (i = k;i < n - 1;i++)
			{
				System.out.printf("%s ",p.Substring(i));
			}
			System.out.printf("%s",p.Substring(n) - 1);
		}
			return 0;
	}

}

