package <missing>;

public class GlobalMembers
{
	public static int[] num = new int[100000];
	public static int n;
	public static int i;
	public static int j;
	public static int k;
	public static int m;
	public static int l;
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0; j < n - 1; j++)
		{
			for (k = j + 1; k < n; k++)
			{
				if (num[j] == num[k])
				{
						num[k] = 0;
				}
			}
		}
		for (m = 0, l = 0; m < n; m++)
		{
			if (num[m] >= 10)
			{
				l++;
				if (l == 1)
				{
					System.out.print(num[m]);
				}
				else
				{
					System.out.print(" ");
					System.out.print(num[m]);
				}
			}
		}
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}
}

