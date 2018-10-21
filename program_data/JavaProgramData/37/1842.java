package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			final String s = "";
			int[] b = new int[100010];
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			int l = s.length();
			int j;
			int k;
			for (j = 0;j < l;j++)
			{
				for (k = 0;k < l;k++)
				{
					if (s.charAt(j) == s.charAt(k))
					{
						b[j]++;
					}
				}
			}
			for (j = 0;j < l;j++)
			{
				if (b[j] == 1)
				{
					System.out.printf("%c\n",s.charAt(j));
					break;
				}
			}
			if (j == l)
			{
				System.out.print("no\n");
			}
		}
	}
}

