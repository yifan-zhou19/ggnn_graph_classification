package <missing>;

public class GlobalMembers
{
	public static void reverse(int num)
	{
		int i;
		int k;
		int j = 0;
		int[] a = new int[1000];
		if (num == 0)
		{
			System.out.print("0");
		}
		else if (num > 0)
		{
			do
			{
				a[j] = num % 10;
				num = num / 10;
				j++;
			} while (num > 0);
			for (i = 0;i < j;i++)
			{
				if (a[i] != 0)
				{
					break;
				}
			}
			for (k = i;k < j;k++)
			{
				System.out.printf("%d",a[k]);
			}
		}
		else if (num < 0)
		{
			num = -num;
			do
			{
				a[j] = num % 10;
				num = num / 10;
				j++;
			} while (num > 0);
			for (i = 0;i < j;i++)
			{
				if (a[i] != 0)
				{
					break;
				}
			}
			System.out.print("-");
			for (k = i;k < j;k++)
			{
				System.out.printf("%d",a[k]);
			}
		}
	}


	public static int Main()
	{
		int x;
		int y;
		for (x = 0;x < 6;x++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				y = Integer.parseInt(tempVar);
			}
			reverse(y);
			System.out.print("\n");
		}




		return 0;
	}
}

