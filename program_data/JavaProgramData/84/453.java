package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k; //max???????max2?????????n??????????m??????
		int max = 0;
		int max2 = 0;
		int n;
		int m;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < k;i++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 1)
			{
				max = n;
			}
			else if (n == 2)
			{
				max2 = n;
				if (max2 > max)
				{
					n = max2;
					max2 = max;
					max = n;
				}
			}
			else
			{
				if (n > max)
				{
					max2 = max;
					max = n;
				}

				else if (max >= n != 0 && n >= max2)
				{
					max2 = n;
				}
			}
		}
		System.out.print(max);
		System.out.print("\n");
		System.out.print(max2);
		System.out.print("\n");
		return 0;
	}
}

