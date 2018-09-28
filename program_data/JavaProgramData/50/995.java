package <missing>;

public class GlobalMembers
{
	public static int day(int mouth)
	{
		int i;
		if (mouth == 1 || mouth == 3 || mouth == 5 || mouth == 7 || mouth == 8 || mouth == 10)
		{
			i = 31;
		}
		else if (mouth == 2)
		{
			i = 28;
		}
		else if (mouth == 0)
		{
			i = 0;
		}
		else
		{
			i = 30;
		}
		return (i);
	}

	public static int Main()
	{
		int i;
		int w;
		int date = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		w = 13 % 7 + w - 1;
		if (w > 7)
		{
			w = w - 7;
		}
		for (i = 0;i < 12;i++)
		{
		   w = day(i) % 7 + w;
		   if (w > 7)
		   {
			   w = w - 7;
		   }
		   if (w == 5)
		   {
			  System.out.printf("%d\n", i + 1);
		   }
		}
		return 0;
	}
}

