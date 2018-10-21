package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int[] a = new int[12];
		int i;
		int j;
		int k;
		int p;
		if (num == 0)
		{
			System.out.print("0");
		}
		else
		{
			if (num > 0)
			{
				a[0] = 1;
			}
			if (num < 0)
			{
			   a[0] = 0;
			   num = 0 - num;
			}
			if (a[0] == 0)
			{
			   System.out.print("-");
			}
			for (i = 1;num != 0;i++)
			{
			   a[i] = num % 10;
			   num = (num - a[i]) / 10;
			}
			a[i] = 10;
			for (j = 1;a[j] == 0;j++)
			{
			   p = 1;
			}
			for (k = j;a[k] != 10;k++)
			{
			   System.out.printf("%d",a[k]);
			}
			System.out.print("\n");
		}
		return 0;
	}
	public static int Main()
	{
		int a;
		int i;
		for (i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			reverse(a);
		}
	}
}

