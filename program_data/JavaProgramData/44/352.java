package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int s = 0;
		int i;
		int j;
		int k = 0;
		int t;
		if (num < 0)
		{
			num = 0 - num;
			k = 1;
		}
		for (i = 0;;i++)
		{
			t = Math.pow(10,i);
			if ((num % t) == num)
			{
				break;
			}
		}
		for (j = 0;j < i;j++)
		{
			s += (num % 10) * Math.pow(10,i - j - 1);
			num = (num - num % 10) / 10;
		}
		if (k != 0)
		{
			return -s;
		}
		else
		{
			return s;
		}
	}
	public static void Main()
	{
		int[] a = new int[6];
		int i;
		int[] b = new int[6];
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
			b[i] = reverse(a[i]);
		System.out.printf("%d\n",b[i]);
		}
	}






}

