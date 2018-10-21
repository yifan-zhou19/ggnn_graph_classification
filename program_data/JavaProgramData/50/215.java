package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int w; //i month
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 1;i < 13;i++)
		{
			if ((w + 12) % 7 == 5)
			{
				System.out.printf("%d\n",i);
			}
			if (i == 2)
			{
				w = w;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				w = (w + 2) % 7;
			}
			else
			{
				w = (w + 3) % 7;
			}
		}
	}


}

