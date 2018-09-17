package <missing>;

public class GlobalMembers
{
	/*?? - ???*/ 



	public static int Main()
	{
		int x;
		int y;
		int t;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x > y)
		{
			t = x;
			x = y;
			y = t;
		}
		int floorx;
		int floory;
		floorx = Math.floor(Math.log(x) / Math.log(2)); //??x,y????
		floory = Math.floor(Math.log(y) / Math.log(2));
		int i;
		for (i = floory - 1;i >= floorx;i--)
		{
			y = y % 2 == 0?y / 2:(y - 1) / 2; //x??????????x????x/2?x????(x-1)/2
		}
		for (i = floorx;i >= 0;i--)
		{
			if (x != y)
			{
				x = x % 2 == 0?x / 2:(x - 1) / 2;
				y = y % 2 == 0?y / 2:(y - 1) / 2;
			}
			else
			{
				System.out.print(x);
				System.out.print("\n");
				return 0;
			}
		}
		return 0;
	}
}

