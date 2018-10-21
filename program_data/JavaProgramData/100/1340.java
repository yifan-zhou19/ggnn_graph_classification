package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sz = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sz = tempVar.charAt(0);
		}

		int i;
		int j;
		int[] str = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

		int len = sz.length();
		for (i = 0;i < len;i++)
		{
			str[sz.charAt(i) - 'a']++;
		}

		int p = 0;
		for (j = 0;j < 26;j++)
		{
			if (str[j] != 0)
			{
				System.out.printf("\n%c=%d",'a' + j,str[j]);
				p = 1;
			}
		}
		if (p == 0)
		{
			System.out.print("No");
		}


		return 0;
	}


}

