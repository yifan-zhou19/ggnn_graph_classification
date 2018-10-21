package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		String sz = new String(new char[300]);
		final String cz = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sz = tempVar.charAt(0);
		}
		n = sz.length();

		for (j = 0;j < 52;j++)
		{
			k = 0;
			{
				for (i = 0;i < n;i++)
				{
					if (cz.charAt(j) == sz.charAt(i))
					{
						k++;
					}
				}
			}
			if (k > 0)
			{
				System.out.printf("%c=%d\n",cz.charAt(j),k);
			}

		}
		for (i = 0,k = 0;i < n;i++)
		{
			if (sz.charAt(i) < 65 || sz.charAt(i)>123)
			{
				k++;
			}
		}
			if (k == n)
			{
				System.out.print("No\n");
			}
		   return 0;
	}


}

