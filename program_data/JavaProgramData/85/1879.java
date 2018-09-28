package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum = 0;
		int len;
		String a = new String(new char[23]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			len = 0;
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			len = a.length();
			if (a.charAt(0) == '-' || (a.charAt(0) >= 'A' && a.charAt(0) <= 'z'))
			{
				for (j = 1;j <= len;j++)
				{
					if ((a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) == '_') || (a.charAt(j) >= '0' && a.charAt(j) <= '9'))
					{
					sum++;
					}
				}
			   if (sum == len - 1)
			   {
				  System.out.print("yes\n");
			   }
			   else
			   {
				  System.out.print("no\n");
			   }
			}
				else
				{
					 System.out.print("no\n");
				}
		}
		return 0;
	}
}

