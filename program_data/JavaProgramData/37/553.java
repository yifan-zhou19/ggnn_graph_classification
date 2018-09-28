package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100001]);
		int i;
		int t;
		int len;
		int j;
		int h;
		int m;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			len = str.length();
			for (j = 0,c = 0;j < len;j++)
			{
				m = 0;
				for (h = 0;h < len;h++)
				{
					if (str.charAt(j) == str.charAt(h) && h != j)
					{
						m++;
					}
				}
				if (m == 0)
				{
					System.out.printf("%c\n",str.charAt(j));
				break;
				}
				else
				{
					c++;
				}
			}
			if (c == len)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}

}

