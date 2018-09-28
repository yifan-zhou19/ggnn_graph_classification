package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		w += 12;
		for (i = 1;;i++)
		{
			e = w % 7;
			if (e == 5)
			{
				System.out.printf("%d\n",i);
			}
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			{
				w += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				w += 30;
			}
			else if (i == 2)
			{
				w += 28;
			}
			else
			{
				break;
			}
		}
	}
}

