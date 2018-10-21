package <missing>;

public class GlobalMembers
{
	//??:??????
	public static int Main()
	{
		int i; //????
		int j;
		int k;
		int num;
		int n;
		int time1;
		int time2;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num == 0) //???????????
			{
				System.out.print("60");
				System.out.print("\n");
			}
			else
			{
				for (j = 1;j <= num;j++)
				{
					a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				if ((a[num] + 3 * num) <= 60)
				{
					System.out.print(60 - 3 * num);
					System.out.print("\n");
					continue;
				}
				for (k = 1;k <= num;k++)
				{
					time1 = a[k] + 3 * (k - 1); //?????????
					time2 = a[k] + 3 * k;

					if (time1 >= 60)
					{
						System.out.print(60 - 3 * (k - 1));
						System.out.print("\n");
						break;
					}
					if (time2 >= 60)
					{
						System.out.print(a[k]);
						System.out.print("\n");
						break;
					}
				}
			}
		}
		return 0;
	}
}

