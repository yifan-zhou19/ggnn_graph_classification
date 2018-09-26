package <missing>;

public class GlobalMembers
{
	public static int biao(char a)
	{
		if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z') || (a >= '0' && a <= '9') || a == '_')
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int n;
		char[][] zfc = new char[100][21];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[i] = tempVar2.charAt(0);
			}
		}
		int L;
		int k;
		int l = 0;
		for (i = 0;i < n;i++)
		{
			L = String.valueOf(zfc[i]).length();
			for (k = 0;k < L;k++)
			{
				if (biao(zfc[i][k]) != 0)
				{
					l++;
				}
			}
			if ((zfc[i][0] < '0' || zfc[i][0]>'9') && l == L)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
			l = 0;
		}
		return 0;
	}

}

