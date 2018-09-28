package <missing>;

public class GlobalMembers
{
	public static void reverse(int n)
	{
		int a;
		int b;
		int i;
		int j;
		a = Math.abs(n);
		b = Math.log(a) / Math.log(10);
		if (n < 0)
		{
			System.out.print("-");
		}
		if (a % (int)Math.pow(10,b) == 0)
		{
			System.out.printf("%d",(int)(a / Math.pow(10,b)) / 10);
		}
		else
		{
		for (i = 0;i <= b;i++)
		{
			if ((int)(a / Math.pow(10,i)) % 10 != 0)
			{
			for (j = i;j <= b;j++)
			{
				System.out.printf("%d",(int)(a / Math.pow(10,j)) % 10);
			}
			break;
			}
		}
		}
		System.out.print("\n");
	}
	public static void Main()
	{
		int[] a = new int[6];
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			reverse(a[i]);
		}
	}

}

