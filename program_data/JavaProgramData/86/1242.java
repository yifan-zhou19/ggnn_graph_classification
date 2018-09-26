package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[10];
		int k;
		int i;
		int j;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{
				for (i = 1;i <= m;i++)
				{
					a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				for (i = 1;i <= m;)
				{
					if ((a[i] + i * 3) < 60)
					{
						i++;
					}
					else
					{
						break;
					}
				}
				if (((a[i] + (i - 1) * 3) <= 60) && (a[i] + i * 3>60))
				{
					sum = a[i];
				}
				else
				{
					sum = 60 - (i - 1) * 3;
				}
				System.out.print(sum);
				System.out.print("\n");
			}
		}
		return 0;
	}


}

