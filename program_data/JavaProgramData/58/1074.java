package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		final String a = "";
		String p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j <= n;j++)
		{
			a = new Scanner(System.in).nextLine();
			if (j == 0)
			{
				continue;
			}
			p = a;
			m = a.length();
			k = 0;
			if (p >= '0' && p <= '9')
			{
				System.out.print("0\n");
			}
			else
			{
				for (i = 0;i < m;i++)
				{
					if ((*(p.Substring(i)) >= '0' && *(p.Substring(i)) <= '9') || (*(p.Substring(i)) >= 'a' && *(p.Substring(i)) <= 'z') || (*(p.Substring(i)) >= 'A' && *(p.Substring(i)) <= 'Z') || (*(p.Substring(i)) == '_'))
					{
						k++;
					}
				}
				if (k == m)
				{
					System.out.print("1\n");
				}
				else
				{
					System.out.print("0\n");
				}
			}

		}
		return 0;
	}


}

