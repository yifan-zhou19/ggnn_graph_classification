package <missing>;

public class GlobalMembers
{
	// ?????C????????.cpp : ??????????????
	//



	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		String a = new String(new char[81]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;++i)
		{
			a = new Scanner(System.in).nextLine();
			l = a.length();
			if ((a.charAt(0) < 65) || (a.charAt(0)>90 && a.charAt(0) < 95) || (a.charAt(0) == 96) || (a.charAt(0)>122))
			{
				System.out.print("0\n");
			}
			else
			{
				for (j = 1;j < l;++j)
				{
					if ((a.charAt(j) >= 48 && a.charAt(j) <= 57) || (a.charAt(j) >= 65 && a.charAt(j) <= 90) || (a.charAt(j) == 95) || (a.charAt(j) >= 97 && a.charAt(j) <= 122))
					{
						;
					}
					else
					{
						break;
					}
				}
				if (j == l)
				{
					System.out.print("1\n");
				}
				else if (j <= l - 1)
				{
					System.out.print("0\n");
				}
			}
		}
		return 0;
	}

}

