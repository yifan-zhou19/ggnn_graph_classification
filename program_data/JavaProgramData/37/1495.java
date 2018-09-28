package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int mid = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String z = new String(new char[100010]);
		int len = 0;
		int ref = 0;
		for (i = 0;i < n;i++)
		{
			ref = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				z = tempVar2.charAt(0);
			}
			len = z.length();
			for (j = 0;j < len;j++)
			{
				mid = 0;
				for (k = 0;k < len;k++)
				{
					if (z.charAt(j) == z.charAt(k))
					{
						mid = mid + 1;
					}
				}
				if (mid == 1)
				{
					System.out.printf("%c\n",z.charAt(j));
					ref = 1;
					break;
				}
			}
			if (ref == 0)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}


}

