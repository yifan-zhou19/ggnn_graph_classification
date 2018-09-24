package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int j;
		int n;
		String a = new String(new char[81]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= n;j++)
		{
			a = new Scanner(System.in).nextLine();
			l = a.length();
			i = 0;
			if (('A' <= a.charAt(0) && a.charAt(0) <= 'Z') || ('a' <= a.charAt(0) && a.charAt(0) <= 'z') || (a.charAt(0) == '_'))
			{
				for (i = 1;i < l;i++)
				{
					if (!(('A' <= a.charAt(i) && a.charAt(i) <= 'Z') || ('a' <= a.charAt(i) && a.charAt(i) <= 'z') || ('0' <= a.charAt(i) && a.charAt(i) <= '9') || a.charAt(i) == '_'))
					{
						break;
					}
				}
			}
			if (i >= l)
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

