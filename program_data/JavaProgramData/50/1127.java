package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int w;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		w += 5;
		if (w > 7)
		{
			w -= 7;
		}
		if (w == 5)
		{
			System.out.print("1\n");
		}
		for (i = 0;i < 11;i++)
		{
			w += day[i] % 7;
			if (w > 7)
			{
				w -= 7;
			}
			if (w == 5)
			{
				System.out.printf("%d\n",i + 2);
			}
		}
		return 0;
	}
}

