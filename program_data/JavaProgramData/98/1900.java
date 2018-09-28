package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int m;
		int count = 0;
		int k = 0;
		String c = new String(new char[40]);
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
				c = tempVar2.charAt(0);
			}
			m = c.length();

			count = count + m + 1;
			if (count - 1 > 80)
			{
				System.out.printf("\n%s",c);
				count = m + 1;

			}
			else
			{
				if (k == 0)
				{
				  System.out.printf("%s",c);
				  k = 1;
				}
				else
				{
				System.out.printf(" %s",c);
				}
			}
		}
	}
}

