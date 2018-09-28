package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[300];
		int max = 0;
		int secondmax = 0;
		char c;
		for (n = 0;1;n++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[n] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (a[n] > max)
			{
				secondmax = max;
				max = a[n];
			}
			if (a[n] > secondmax && a[n] < max)
			{
				secondmax = a[n];
			}
			if (c == '\n')
			{
				break; //continue????????????????break????
			}
		}
		if (secondmax == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",secondmax);
		}
		return 0;
	}
}

