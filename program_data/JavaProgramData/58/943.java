package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[A]);
		char c;
		int n;
		int i;
		int l;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			scanf("\n");
			j = 0;
			a = new Scanner(System.in).nextLine();
			l = a.length();
			if (a.charAt(0) == '_' || ('a' <= a.charAt(0) && a.charAt(0) <= 'z') || ('A' <= a.charAt(0) && a.charAt(0) <= 'Z'))
			{
				for (j = 1;j < l;j++)
				{
					if (a.charAt(j) == '_' || ('a' <= a.charAt(j) && a.charAt(j) <= 'z') || ('A' <= a.charAt(j) && a.charAt(j) <= 'Z') || ('0' <= a.charAt(j) && a.charAt(j) <= '9'))
					{
						;
					}
					else
					{
						break;
					}
				}
			}
			if (j == l)
			{
				System.out.print("1\n");
			}
			else
			{
				System.out.print("0\n");
			}
		}
		return 0;
	}
}

