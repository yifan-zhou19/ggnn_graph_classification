package <missing>;

public class GlobalMembers
{
	public static int sum;
	public static int Main()
	{
		void pingguo();
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < t;i++)
		{
			pingguo();
		}
		return 0;
	}
	public static void pingguo()
	{
		sum = 0;
		void func(int,int);
		int apple;
		int plate;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			apple = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			plate = Integer.parseInt(tempVar2);
		}
		func(apple, plate);
		System.out.printf("%d\n",sum);
	}
	public static void func(int apple,int plate)
	{
		if (apple == 0 || plate == 1)
		{
			sum++;
		}
		else
		{
			if (plate > apple)
			{
				func(apple, apple);
			}
			else
			{
				func(apple - plate, plate);
				func(apple, plate-1);
			}
		}
	}








}

