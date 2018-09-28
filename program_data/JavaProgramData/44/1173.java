package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int t = 0;
		for (;num != 0;num = num / 10)
		{
			t = t * 10 + num % 10;
		}
		return (t);
	}
	public static void Main()
	{
		int i;
		int[] a = new int[6];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		System.out.printf("%d\n",reverse(a[i]));
		}
	}
}

