package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] c = new char[100][21];
		int i;
		int j;
		int n;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			b = 1;
			if (!(c[i][0] == '_' || (c[i][0] >= 'A' && c[i][0] <= 'Z') || (c[i][0] >= 'a' && c[i][0] <= 'z')))
			{
				b = 0;
			}
			for (j = 1;j < String.valueOf(c[i]).length();j++)
			{
				if (!(c[i][j] == '_' || (c[i][j] >= 'A' && c[i][j] <= 'Z') || (c[i][j] >= 'a' && c[i][j] <= 'z') || (c[i][j] >= '0' && c[i][j] <= '9')))
				{
					b = 0;
					break;
				}
			}
			if (b == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
		System.in.read();

	}

}

