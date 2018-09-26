package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int reverse = int num;
		int i;
		int n;
		int[] c = new int[6];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			c[i] = reverse(n);
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",c[i]);
		}
	}

	public static int reverse(int num)
	{
		int t = 0;
		int d;
		if (num == 0)
		{
			return 0;
		}
		else if (num > 0)
		{
			d = num;
			while (d != 0)
			{
				t = t * 10 + d % 10;
				d = d / 10;
			}
			return t;
		}
		else
		{
			d = num * (-1);
			while (d != 0)
			{
				t = t * 10 + d % 10;
				d = d / 10;
			}
			return -t;
		}
	}
}

