package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int c;
		if (num == 0)
		{
			c = num;
		}
		if (num < 0)
		{
			int d = Math.abs(num);
			c = -branch(d);
		}
		if (num > 0)
		{
			 c = branch(num);
		}
		return c;
	}
	public static int branch(int e)
	{
		int reversenum = 0;
		int standard = e;
		for (;e > 0;)
		{
			reversenum = 10 * reversenum + e % 10;
			e = e / 10;
		}
		return reversenum;
	}
	public static int Main()
	{
		int[] A = new int[6];
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				A[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			int v = reverse(A[i]);
			System.out.printf("%d\n",v);
		}
		return 0;
	}

}

