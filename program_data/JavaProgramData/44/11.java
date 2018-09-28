package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int[] b = new int[6];
		int reverse = int num;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				b[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",reverse(b[i]));
		}
	}
	public static int reverse(int num)
	{
		int k;
		int i;
		int j;
		int wei = 1;
		int flag = 0;
		int[] a = new int[8];
		if (num < 0)
		{
			flag = 1;
			num = -num;
		}
		k = num;
		a[0] = num;
		for (i = 0;;i++)
		{
			k = k / 10;
			a[i + 1] = k;
			if (k == 0)
			{
				break;
			}
		}
		for (j = 0;j <= i;j++)
		{
			a[j] = a[j] % 10;
		}
		k = 0;
		for (j = i;j >= 0;j--)
		{
			if (a[j] != 0)
			{
				break;
			}
		}
		k = a[j];
		for (i = 1;i <= j;i++)
		{

			wei = wei * 10;
			k = k + a[j - i] * wei;
		}
		if (flag == 1)
		{
			k = -k;
		}
		return (k);
	}

}

