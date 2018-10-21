package <missing>;

public class GlobalMembers
{
	public static int reverse(int num) //?????????
	{
		int ws = 0;
		int new_num = 0;
		int i;
		int a = num;
	int ten = 1;
			while (a > 0)
			{
				ws++;
				a = a / 10;
			}
		for (i = 0;i < ws;i++)
		{
			ten = ten * 10;
		}
		i = 1;
		ten = ten / 10;
		while (ten > 0)
		{
			new_num = num / ten * i + new_num;
			num = num % ten;
			i = i * 10;
			ten = ten / 10;
		}
		return (new_num);
	}

	public static void Main()
	{
		int[] a = new int[6];
		int i;
		int j;
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
			if (a[i] < 0)
			{
				System.out.printf("-%d\n",reverse(-a[i]));
			}
			else if (a[i] > 0)
			{
				System.out.printf("%d\n",reverse(a[i]));
			}
			else
			{
				System.out.print("0\n");
			}
		}
	}



}

