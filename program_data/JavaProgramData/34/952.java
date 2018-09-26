package <missing>;

public class GlobalMembers
{
	public static int hanshu(int number)
	{
		int m;
		if (number == 1)
		{
			return number;
		}
		else
		{
			if (number % 2 != 0)
			{
			   m = number * 3 + 1;
			   System.out.printf("%d*3+1=%d\n",number,m);
			}
			else if (number % 2 == 0)
			{
			   m = number / 2;
			   System.out.printf("%d/2=%d\n",number,m);
			}
		}
		return hanshu(m);
	}
	public static int Main()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a == 1)
		{
			System.out.print("End\n");
		}
		else if (hanshu(a) == 1)
		{
			System.out.print("End\n");
		}
		return 0;
	}

}

