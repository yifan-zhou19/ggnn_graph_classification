package <missing>;

public class GlobalMembers
{
	public static int w;
	public static int i;
	public static int feb(int x)
	{
		if ((w + 12) % 7 == 5)
		{
			System.out.printf("%d\n",i);
		}
		if ((w + 28) % 7 != 0)
		{
			return ((w + 28) % 7);
		}
			else
			{
				return 7;
			}
	}
	public static int tiny(int x)
	{
		if ((w + 12) % 7 == 5)
		{
			System.out.printf("%d\n",i);
		}
		if ((w + 30) % 7 != 0)
		{
			return ((w + 30) % 7);
		}
			else
			{
				return 7;
			}
	}
	public static int big(int x)
	{
		if ((w + 12) % 7 == 5)
		{
			System.out.printf("%d\n",i);
		}
		if ((w + 31) % 7 != 0)
		{
			return ((w + 31) % 7);
		}
			else
			{
				return 7;
			}
	}
	public static void Main()
	{

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 12;i++)
		{
			if (i == 2)
			{
				w = feb(w);
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				w = tiny(w);
			}
				 else
				 {
					 w = big(w);
				 }
		}
	}
}

