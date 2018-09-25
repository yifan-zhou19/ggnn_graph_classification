package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int l;
		int j;
		int flag = 1;
		String a = new String(new char[50]);
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
				a = tempVar2.charAt(0);
			}
			l = a.length();
			if (!(a.charAt(0) == '_' || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z')))
			{
				flag = 0;
			}
			else
			{
				for (j = 1;j < l;j++)
				{
					if (!(a.charAt(j) == '_' || (a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) >= '0' && a.charAt(j) <= '9')))
					{
						flag = 0;
						break;
					}
					else
					{
						flag = 1;
					}
				}
			}
			if (flag == 1)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
	}




}

