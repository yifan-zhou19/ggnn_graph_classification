package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int k;
		int x;
		int i;
		int j;
		int[] s = new int[100000];
		int y;
		String a = new String(new char[100000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= t;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			x = a.length();
			y = 0;
			for (i = 0;i < x;i++)
			{
				s[i] = 0;
			}
			for (i = 0;i < x;i++)
			{
				for (j = 0;j < x;j++)
				{
					if (a.charAt(i) == a.charAt(j))
					{
						s[i] = s[i] + 1;
					}
				}
			}
			for (i = 0;i < x;i++)
			{
				if (s[i] == 1)
				{
					System.out.printf("%c\n",a.charAt(i));
					y = 1;
					break;
				}
			}
			if (y == 0)
			{
				System.out.print("no\n");
			}
		}
	}

}

