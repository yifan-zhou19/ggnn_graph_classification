package <missing>;

public class GlobalMembers
{
	// ????????????.cpp : ??????????????
	//


	public static int Main() //(int argc, _TCHAR* argv[])
	{
		int T;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			T = Integer.parseInt(tempVar);
		}
		for (t = 1;t <= T;t++)
		{
			String s = new String(new char[1000]);
			int n;
			int i;
			int j;
			int k = 0;
			int g = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			n = s.length();
			for (i = 0;i <= n - 1;i++)
			{
				k = 0;
				for (j = 0;j <= n - 1;j++)
				{
					if (s.charAt(j) == s.charAt(i))
					{
						k = k + 1;

					}
				}
				if (k == 1)
				{
					System.out.printf("%c\n",s.charAt(i));
					g = 1;
					break;
				}
			}
			if (g == 0)
			{
				System.out.print("no\n");
			}
		}
	}



}

