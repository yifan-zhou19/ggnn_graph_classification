package <missing>;

public class GlobalMembers
{
	public static int[] yz = new int[100];
	public static int all = 0;
	public static int yinzi(int num,int amax)
	{
		int i;
		int j = 0;
		int geshu = 0;
		int key = num;
		if (num == 1)
		{
			return 1;
		}
		else
		{
			for (i = amax;i < all;i++)
			{
				if (num % yz[i] == 0)
				{
					num = num / yz[i];
					geshu = geshu + yinzi(num, i);
					num = key;
				}
			}
			return geshu;
		}
		return 0;
	}
	public static int Main()
	{
		int num;
		int n;
		int i;
		int c;
		int j = 0;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num == 1)
			{
				System.out.print(1);
				System.out.print("\n");
			}
			else
			{
				j = 0;
				for (i = 2;i <= num;i++)
				{
					if (num % i == 0)
					{
						yz[j] = i;
						j++;
					}
				}
				all = j;
				System.out.print(yinzi(num, 0));
				System.out.print("\n");
			}
		}
		return 0;
	}

}

