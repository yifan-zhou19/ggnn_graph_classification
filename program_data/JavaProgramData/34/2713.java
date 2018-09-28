package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int n;
		int i;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a == 1)
		{
			System.out.print("End");
		}
		else
		{
		while (a != 1)
		{
			if (a % 2 == 1)
			{
				t = a * 3 + 1;
				System.out.printf("%d*3+1=%d\n",a,t);
				a = t;
			}
			if (a % 2 == 0)
			{
				t = a / 2;
				System.out.printf("%d/2=%d\n",a,t);
				a = t;
			}
		}
		System.out.print("End");
		}

	}






}

