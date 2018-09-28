package <missing>;

public class GlobalMembers
{
	public static int change(int x) //????
	{
		int y = 0;
		if (x % 2 == 0) //??????
		{
			y = x / 2;
			System.out.printf("%d/2=%d",x,y);
			System.out.print("\n");
		}
		else //??????
		{
			y = 3 * x + 1;
			System.out.printf("%d*3+1=%d",x,y);
			System.out.print("\n");
		}
		return y;
	}
	public static int Main()
	{
		int num = 0;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (num != 1)
		{
			num = change(num); //??????
		}
			  System.out.print("End");
		return 0;
	}
}

