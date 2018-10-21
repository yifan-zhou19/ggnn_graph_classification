package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[33]);
		char[][] o =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int n;
		int i;
		int j;
		int[] len = new int[51];
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
				s = tempVar2.charAt(0);
			}
			len[i] = s.length();
			if (s.charAt(len[i] - 3) == 'i')
			{
				for (j = 0;j < len[i] - 3;j++)
				{
					o[i][j] = s.charAt(j);
				}
			}
			else
			{
				for (j = 0;j < len[i] - 2;j++)
				{
					o[i][j] = s.charAt(j);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",o[i]);
		}
		return 0;
	}


}

