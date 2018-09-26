package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int p = 1;
		int[] l = new int[100];
		char[][] c = new char[100][20];
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
		l[i] = String.valueOf(c[i]).length();
		}
		for (i = 0;i < n;i++)
		{
		if (c[i][0] < 'A' || (c[i][0]>'Z' && c[i][0] < 'a' && c[i][0] != '_') || c[i][0]>'z')
		{
			p = 0;
		System.out.print("no\n");
		}
		else if ((c[i][0] >= 'a' && c[i][0] <= 'z') || (c[i][0] >= 'A' && c[i][0] <= 'Z') || (c[i][0] >= '0' && c[i][0] <= '9'))
		{
			p = 1;

		  for (j = 1;j < l[i];j++)
		  {
			if (c[i][j] < '0' || (c[i][j]>'9' && c[i][j] < 'A') || (c[i][j]>'Z' && c[i][j] < 'a' && c[i][j] != '_') || c[i][j]>'z')
			{
			p = 0;
		System.out.print("no\n");
		break;
			}
		  }
		}
		if (p == 1)
		{
		System.out.print("yes\n");
		}
		p = 1;
		}
		return 0;
	}

}

