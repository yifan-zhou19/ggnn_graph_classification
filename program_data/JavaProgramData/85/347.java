package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int check;
		String a = new String(new char[21]);
		check = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			for (j = 0;j <= a.length() - 1;j++)
			{
				if (!((a.charAt(j) >= '0' && a.charAt(j) <= '9') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || a.charAt(j) == '_') || (j == 0 && a.charAt(j) >= '0' && a.charAt(j) <= '9'))
				{
					check = 0;
				 break;
				}
			}
				if (check == 0)
				{
					System.out.print("no");
				System.out.print("\n");
				}
				else
				{
					System.out.print("yes");
				System.out.print("\n");
				}
				check = 1;
				for (j = 0;j <= a.length() - 1;j++)
				{
					a = a.substring(0, i);
				}
		}

		return 0;
	}


}

