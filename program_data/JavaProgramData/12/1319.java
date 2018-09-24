package <missing>;

public class GlobalMembers
{
	//????1.cpp
	//??????
	//???1200062704
	//???????????
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int num = 0;
		while (true)
		{
			for (i = 0; i < 16; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == 0 || a[i] == -1)
				{
					break;
				}
				if (i > 0)
				{
					for (j = 0; j < i; j++)
					{
						if (a[i] * 2 == a[j] || a[j] * 2 == a[i])
						{
							num++;
						}
					}
				}
			}
			if (a[0] == -1)
			{
				break;
			}
			System.out.print(num);
			System.out.print("\n");
			num = 0;
		}
		return 0;
	}

}

