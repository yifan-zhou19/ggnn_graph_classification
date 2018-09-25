package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char n;
		char[][] a = new char[1000][1000];
		char p = 0;
		char q;
		char r = 0;
		char i;
		char j;
		char s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = tempVar.charAt(0);
		}
		for (i = 0;i < n;i++)
		{
			q = 0;
			for (j = 0;j < n;j++)
			{

				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = tempVar2.charAt(0);
				}
				if (a[i][j] == 0 && a[i][j - 1] == 0)
				{
					p = p + 1;
				}
				if (a[i][j] == 0)
				{
					q = q + 1;
				}

			}
			if (q >= 1)
			{
				r = r + 1;
			}
		}
		s = (p / 2 - 1) * (r - 2);
		System.out.printf("%d",s);
		return 0;
	}


}

