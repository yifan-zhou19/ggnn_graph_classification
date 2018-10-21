package <missing>;

public class GlobalMembers
{
	///#include<stdafx.h>

	public static int reverse(int num)
	{
		int y;
		int z = 0;

		if (num > 0)
		{
			while (num >= 1)
			{
							   y = num % 10;
				z = 10 * z + y;
				num = num / 10;
			}
		}
			 else if (num == 0)
			 {
				 z = 0;
			 }
		else
		{
			num = -num;
			while (num >= 1)
			{
								y = num % 10;
				z = 10 * z + y;
				num = num / 10;
			}
			z = -z;
		}
		return z;
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
			System.out.printf("%d\n",reverse(a[i]));
		}
	}
}

