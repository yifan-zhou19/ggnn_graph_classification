package <missing>;

public class GlobalMembers
{
	public static int prime(int n)
	{
		int i = 0;
		for (i = 2;i < n;i++)
		{
			if (n % i == 0)
			{
				break;
			}
		}
		if (i == n)
		{
			return n;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int a;
		int b;
		int i;
		int n;
		int num;
		int mid;
		int mid0;
		int[] line1 = new int[1000];
		int[] line2 = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		num = 0;
		mid = 0;
		for (i = 3;i < n;i++)
		{
			a = prime(i - 2);
			b = prime(i);
			if (b - a == 2)
			{
				line1[num] = a;
				line2[num] = b;
				num++;
				mid++;
			}
		}
		if (n < 5)
		{
			System.out.print("empty");
		}
		if (n == 5)
		{
			System.out.print("3 5\n");
		}
		for (i = 0;i < mid;i++)
		{
			System.out.printf("%d %d\n",line1[i],line2[i]);
		}
		return 0;
	}
}

