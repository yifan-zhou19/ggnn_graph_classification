package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int len;
		int j;
		int a = 0;
		String str = new String(new char[21]);
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
				str = tempVar2.charAt(0);
			}
			len = str.length();
			if (str.charAt(0) >= 48 && str.charAt(0) <= 57)
			{
				System.out.print("no\n");
			}
			else
			{
				for (j = 0;j < len;j++)
				{
					if ((str.charAt(j) >= 48 && str.charAt(j) <= 57) || (str.charAt(j) >= 65 && str.charAt(j) <= 90) || (str.charAt(j) >= 97 && str.charAt(j) <= 122) || str.charAt(j) == 95)
					{
						a = 0;
					}
					else
					{
						a = 1;
						break;
					}
				}
				if (a == 0)
				{
					System.out.print("yes\n");
				}
				if (a == 1)
				{
					System.out.print("no\n");
				}
			}
		}
		return 0;
	}




}

