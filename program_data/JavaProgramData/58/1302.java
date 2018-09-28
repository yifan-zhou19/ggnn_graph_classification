package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int flag;
		String a = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			a = new Scanner(System.in).nextLine();
			flag = 1;
			l = a.length();
			if ((a.charAt(0) == '_') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z'))
			{
			for (j = 1;j < l;j++)
			{
				if ((a.charAt(j) == '_') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= '0' && a.charAt(j) <= '9'))
				{
					continue;
				}
				else
				{
					flag = 0;
					break;
				}
			}
			}
			else
			{
			flag = 0;
			}
			System.out.printf("%d\n",flag);
		}
	}
}

