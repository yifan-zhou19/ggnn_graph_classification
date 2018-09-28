package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] zfc = new char[1000][42];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[i] = tempVar2.charAt(0);
			}
		}
		int len = 0;
		int k;
		for (i = 0;i < n;i++)
		{
			len = len + String.valueOf(zfc[i]).length() + 1;
		  if (i < n - 1)
		  {
			if (len <= 80)
			{
				k = len + String.valueOf(zfc[i + 1]).length() + 1;
				if (k > 81)
				{
					 System.out.printf("%s",zfc[i]);
				}
				if (k <= 81)
				{
					 System.out.printf("%s ",zfc[i]);
				}
			}
			if (len == 81)
			{
				System.out.printf("%s\n",zfc[i]);
				len = 0;
			}
			if (len > 81)
			{
				System.out.printf("\n%s ",zfc[i]);
				len = String.valueOf(zfc[i]).length() + 1;
			}
		  }
		  if (i == n - 1)
		  {
			  System.out.printf("%s",zfc[n - 1]);
		  }

		}
		return 0;
	}

}

