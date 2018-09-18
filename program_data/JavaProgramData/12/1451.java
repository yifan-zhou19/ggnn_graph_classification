package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int sum;
		int e = 0;
		int[] a = new int[20];
		for (;;)
		{

			sum = 0;
			for (i = 0;;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == 0)
				{
					i--;
					break;
				}
				else if (a[i] == -1)
				{
					e = -1;
					break;
				}
			}
			if (e == -1)
			{
				break;
			}
			for (j = 0;j <= i;j++)
			{
				for (k = 0;k <= i;k++)
				{
					if (a[k] == a[j] * 2)
					{
						sum++;
						break;
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

