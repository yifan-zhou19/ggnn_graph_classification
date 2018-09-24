package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] sz = new int[10000];
		int a;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		while (a != 1)
		{
			if (a % 2 == 0)
			{
				b = a;
				a = a / 2;
				System.out.printf("%d/2=%d\n",b,a);
			}
			else
			{
				b = a;
				a = a * 3 + 1;
				System.out.printf("%d*3+1=%d\n",b,a);
			}
		}
		System.out.print("End\n");
		return 0;
	}
}

