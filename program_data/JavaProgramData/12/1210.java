package <missing>;

public class GlobalMembers
{
	//***************************************************
	//1.cpp ??     ******
	//?? ???  1200018209  ********
	//?? 2012-10-29 ******
	//***************************************************
	public static int Main()
	{
		int[] a = new int[100];
		int j;
		int k;
		int l;
		int sum = 0;
		for (;;)
		{
			for (j = 0;;j++)
			{
				a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[j] == 0 || a[j] == -1)
				{
					break;
				}
			}
			if (a[0] == -1)
			{
				break;
			}
			for (k = 0;k < j - 1;k++)
			{
				for (l = k + 1;l <= j - 1;l++)
				{
					if (a[k] == 2 * a[l] || a[l] == 2 * a[k])
					{
						sum++;
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
		}
		return 0;
	}
}

