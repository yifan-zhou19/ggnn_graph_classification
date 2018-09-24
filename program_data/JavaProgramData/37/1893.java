package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k = 0;
		int z;
		int y;
		int m = 0;
		String s = new String(new char[100000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		for (z = 0;z < y;z++)
		{
		m = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		for (i = 0;s.charAt(i);i++)
		{
			k = 0;
			for (j = 0;s.charAt(j);j++)
			{
				if (s.charAt(i) == s.charAt(j))
				{
					k++;
				}
			}
			if (k == 1)
			{
			System.out.printf("%c\n",s.charAt(i));
			m++;
			break;
			}
		}

		if (m == 0)
		{
			System.out.print("no\n");
		}
		}
	}

}

