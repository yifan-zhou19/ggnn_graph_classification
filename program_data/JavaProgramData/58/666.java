package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[82]);
		String p = a;
		int n;
		int i;
		int j;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine();
			l = a.length();
			k = 0;
			for (j = 0;j < l;j++)
			{
				if (j == 0 && ((*(p.Substring(j)) >= 'A' && *(p.Substring(j)) <= 'Z') || (*(p.Substring(j)) >= 'a' && *(p.Substring(j)) <= 'z') || *(p.Substring(j)) == '_'))
				{
					k++;
				}
				if (j != 0 && ((*(p.Substring(j)) >= '0' && *(p.Substring(j)) <= '9') || (*(p.Substring(j)) >= 'A' && *(p.Substring(j)) <= 'Z') || (*(p.Substring(j)) >= 'a' && *(p.Substring(j)) <= 'z') || *(p.Substring(j)) == '_'))
				{
					k++;
				}
			}
			if (k == l)
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

