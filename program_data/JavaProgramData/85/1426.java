package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int l;
		int n;
		int flag = 0;
		final String a = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			flag = 0;
			a = new Scanner(System.in).nextLine();
			l = a.length();
			for (j = 0;j < l;j++)
			{
				if (a.charAt(j) >= '0' && a.charAt(j) <= '9')
				{
					continue;
				}
				else if (a.charAt(j) >= 'a' && a.charAt(j) <= 'z')
				{
					continue;
				}
				else if (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z')
				{
					continue;
				}
				else if (a.charAt(j) == '_')
				{
					continue;
				}
				else
				{
					flag = 1;
				}
			}
			if ((a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') || a.charAt(0) == '_')
			{
				flag = flag;
			}
			else
			{
				flag = 1;
			}
			if (flag == 1)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
	}

}

