package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String sz = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sz = new Scanner(System.in).nextLine();
			if ((sz.charAt(0) == '_') || (sz.charAt(0) >= 'a' && sz.charAt(0) <= 'z') || (sz.charAt(0) >= 'A' && sz.charAt(0) <= 'Z'))
			{
				for (j = 1;sz.charAt(j) == '_' || (sz.charAt(j) >= 'a' && sz.charAt(j) <= 'z') || (sz.charAt(j) >= 'A' && sz.charAt(j) <= 'Z') || (sz.charAt(j) >= '0' && sz.charAt(j) <= '9');j++)
				{
					j = j;
				}
				if (sz.charAt(j) == '\0')
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

