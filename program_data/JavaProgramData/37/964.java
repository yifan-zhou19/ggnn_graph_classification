package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t;
		int k;
		int x;
		int y;
		String a = new String(new char[10000]);
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
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				x = 0;
				y = 0;
				for (j = 0;a.charAt(j) != '\0';j++)
				{
					if (a.charAt(j) == a.charAt(i))
					{
						x = x + 1;
					}
				}
				if (x == 1)
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
		return 0;
	}

}

