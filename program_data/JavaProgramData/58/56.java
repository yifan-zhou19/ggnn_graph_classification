package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		char[][] str = new char[1000][80];
		char c;
		String p = new String(new char[90]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = str;
		for (i = 0;i < n;i++)
		{
			*(p.Substring(i)) = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(*(p.Substring(i))).length();
			k = 0;
			for (j = 1;j < l;j++)
			{
				c = (*(p.Substring(i)) + j);
				if (!((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c == '_')))
				{
					k = 1;
				}
			}
			c = *(p.Substring(i));
			if (!((c == '_') || (c <= 'Z' && c >= 'A') || (c <= 'z' && c >= 'a')))
			{
				k = 1;
			}
			if (k == 0)
			{
				System.out.print("1\n");
			}
			else
			{
				System.out.print("0\n");
			}
		}
	}
}

