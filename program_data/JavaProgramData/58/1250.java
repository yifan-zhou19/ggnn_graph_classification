package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k;
		int t;
		int j;
		String c = new String(new char[81]);
		String p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			c = new Scanner(System.in).nextLine();
			p = c;
			k = p.length();
			for (j = 0;j < k;j++)
			{
				if (p >= '0' && p <= '9')
				{
					t = -1;
					break;
				}
			if ((*(p.Substring(j)) >= '0' && *(p.Substring(j)) <= '9') || (*(p.Substring(j)) >= 'a' && *(p.Substring(j)) <= 'z') || (*(p.Substring(j)) >= 'A' && *(p.Substring(j)) <= 'Z') || (*(p.Substring(j)) == '_'))
			{
				t++;
			}
			else
			{
				t = -1;
				break;
			}
			}
		if (t == -1)
		{
			System.out.print("0\n");
		}
		else
		{
			System.out.print("1\n");
		}
		}
		return 0;
	}
}

