package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		if (w > 2)
		{
		w = w - 2;
		}
		else if (w == 2)
		{
		w = 7;
		}
		else if (w == 1)
		{
		w = 6;
		}
		int[] mouth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = 0;i < 12;i++)
		{
			if (w == 5)
			{
		System.out.printf("%d\n",i + 1);
			}
		w = w + mouth[i] % 7;
		w = w % 7;
		}

	}


}

