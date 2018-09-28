package <missing>;

public class GlobalMembers
{
	public static int fx(int n)
	{
		int[] a = new int[10];
		int i;
		int j;
		int k;
		i = 0;
		if (n == 0)
		{
			System.out.print("0");
		}
		while (n != 0)
		{
			a[i] = n % 10;
			n = (n - a[i]) / 10;
			i++;
		}
		for (j = 0;j < i;j++)
		{
			for (k = 0;k < i;k++)
			{
				if (a[k] != 0)
				{
					break;
				}
			}
			if (j >= k)
			{
				System.out.printf("%d",a[j]);
			}
		}
		System.out.print("\n");
		return 0;
	}
	public static int Main()
	{
		int i;
		int[] b = new int[6];
		int n;
		int k;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			b[i] = n;
		}
		for (i = 0;i < 6;i++)
		{
			if (b[i] < 0)
			{
				k = Math.abs(b[i]);
				System.out.print("-");
				fx(k);
			}
			else
			{
				fx(b[i]);
			}
		}
		return 0;
	}







}

