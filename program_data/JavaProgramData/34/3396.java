package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		while (a != 1)
		{
			if (a % 2 == 1)
			{
				k = a;
				a = a * 3 + 1;
				System.out.printf("%d*3+1=%d\n",k,a);
			}
			else
			{
				k = a;
				a = a / 2;
				System.out.printf("%d/2=%d\n",k,a);
			}
		}
		if (a == 1)
		{
			System.out.print("End\n");
		}

	}
}

