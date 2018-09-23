package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		char i;
		int k;
		int x;
		int n;
		int y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		for (i = 'A';i <= 'Z';i++)
		{
			k = 0;
			for (x = 0;x < n;x++)
			{
				if (a.charAt(x) == i)
				{
					k++;
				}
			}
			if (k != 0)
			{
				System.out.printf("%c=%d\n",i,k);
				y = 1;
			}
		}
		for (i = 'a';i <= 'z';i++)
		{
			k = 0;
			for (x = 0;x < n;x++)
			{
				if (a.charAt(x) == i)
				{
					k++;
				}
			}
				if (k != 0)
				{
				System.out.printf("%c=%d\n",i,k);
				y = 1;
				}
		}
		if (y == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

