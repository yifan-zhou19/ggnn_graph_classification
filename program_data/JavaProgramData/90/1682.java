package <missing>;

public class GlobalMembers
{
	public static int divide(int apple, int plate)
	{
		if (plate == 1)
		{
			return 1;
		}
		else if (apple < 0)
		{
			return 0;
		}
		else
		{
			return divide(apple, plate-1) + divide(apple - plate, plate);
		}
	}

	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int plate;
			int apple;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				apple = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				plate = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",divide(apple, plate));
		}
	}
}

