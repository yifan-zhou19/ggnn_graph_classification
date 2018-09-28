package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int b;
		String a = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			b = 1;
			a = new Scanner(System.in).nextLine();
			if (a.charAt(0) >= '0' && a.charAt(0) <= '9')
			{
				b = 0;
			}
			for (j = 0;a.charAt(j) != '\0';j++)
			{
				if ((a.charAt(j) < '0' || (a.charAt(j)>'9' && a.charAt(j) < 'A') || a.charAt(j)>'z' || (a.charAt(j) > 'Z' && a.charAt(j) < 'a')) && (a.charAt(j) != '_'))
				{
					b = 0;
					break;
				}
			}
			if (b == 1)
			{
				System.out.print("yes\n");
			}
			else if (b == 0)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}

}

