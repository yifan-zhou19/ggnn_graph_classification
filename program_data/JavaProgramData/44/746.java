package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int reverse = int num;
		int i;
		int[] a = new int[6];
		int[] b = new int[6];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			b[i] = reverse(a[i]);
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
		return 0;
	}
	public static int reverse(int num)
	{
		int s = 0;
		int k;
		do
		{
			k = num % 10;
			num = num / 10;
					   s = (s + k) * 10;
		} while (num != 0);
	s = s / 10;
	return (s);
	}


}

