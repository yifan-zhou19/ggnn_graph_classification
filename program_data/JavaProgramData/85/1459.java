package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[100]);
		for (i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine();
			if (!(a.charAt(0) == '_' || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z')))
			{
				System.out.print("no\n");
				continue;
			}
			else
			{
				j = 1;
				while (j < a.length())
				{
					if (!(a.charAt(j) == '_' || (a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) >= '0' && a.charAt(j) <= '9')))
					{
						System.out.print("no\n");
						break;
					}
					j++;
				}
			}
			if (j == a.length())
			{
				System.out.print("yes\n");
			}
		}
	}

}

