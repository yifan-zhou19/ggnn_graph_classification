package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int sum;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[100]);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			len = a.length();
			for (j = 0;j < len;j++)
			{
				sum = 0;
				for (k = 0;k < len;k++)
				{
					if (a.charAt(j) == a.charAt(k))
					{
						sum++;
					}
				}
				if (sum == 1)
				{
					System.out.printf("%c\n",a.charAt(j));
					break;
				}
			}
					   if (sum != 1)
					   {
									  System.out.print("no\n");
					   }

		}
	  return 0;
	}
}

