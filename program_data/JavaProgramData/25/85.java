package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] b = new int[50];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1;j <= n;j++)
		{
			for (i = 0;i <= 31;i++)
			{
				if (a[i] * 2 < 10)
				{
					a[i] = a[i] * 2 + b[i];
					b[i + 1] = 0;
				}
				else
				{
					a[i] = a[i] * 2 - 10 + b[i];
					b[i + 1] = 1;
				}
			}
		}
			 for (i = 31;i >= 0;i--)
			 {
				 if (a[i] != 0)
				 {
						k = i;
						break;
				 }
			 }
			 for (i = k;i >= 0;i--)
			 {
				 System.out.print(a[i]);
			 }

	}

}

