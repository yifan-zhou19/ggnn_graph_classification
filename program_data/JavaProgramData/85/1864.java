package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int h;
		int n;
		int p;
		char c;
		char[][] a = new char[100][100];
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
				a[i] = tempVar2.charAt(0);
			}
		}
		for (i = 1;i <= n;i++)
		{
			p = 1;
			c = a[i][0];
			h = String.valueOf(a[i]).length();
			if (c >= '0' && c <= '9')
			{
				p = 0;
			}
			for (j = 0;j < h;j++)
			{
				c = a[i][j];
				if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c == '_'))
				{
					continue;
				}
				else
				{
					p = 0;
					break;
				}
			}
			if (p == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}
}

