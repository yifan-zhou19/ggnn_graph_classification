package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
	   int m = 0;
		String c = new String(new char[301]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		char[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		for (i = 0;i <= c.length() - 1;i++)
		{
			if (c.charAt(i) >= 97 && c.charAt(i) <= 122)
			{
				a[c.charAt(i) - 97] = a[c.charAt(i) - 97] + 1;
			}
		}
		for (i = 0;i <= 25;i++)
		{
			m = m + a[i];
		}
		if (m == 0)
		{
			System.out.print("No");
		}
			else
			{
				   for (i = 0;i <= 25;i++)
				   {
					   if (a[i] != 0)
					   {
						   System.out.printf("%c=%d\n",i + 97,a[i]);
					   }
				   }
			}
	}
}

