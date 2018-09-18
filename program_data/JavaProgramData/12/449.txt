package <missing>;

public class GlobalMembers
{
	/*
	?????2010?11?19
	???????
	??????????
	????00948344 ??
	*/
	public static int Main()
	{
		int k = 1;
		while (k == 1)
		{
			int[] a = new int[16];
			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int l = 0;
			if (a[0] == -1) //??????-1???????????
			{
			 k = 0;
			}
			else
			{
				while (a[l] != 0) //???????0?????????
				{
					l++;
					a[l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				int i; //num??????
				int j;
				int num = 0;
				for (i = 0;i < l - 1;i++)
				{
					for (j = i + 1;j < l;j++)
					{
						if (a[i] - 2 * a[j] == 0 || a[j] - 2 * a[i] == 0)
						{
							num++;
						}
					}
				}
				System.out.print(num);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

