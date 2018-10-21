package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[17];
		int i;
		int j;
		int k;
		int l;
		int num = 0;
		for (l = 1; ; l++)
		{
			for (i = 1; i <= 16; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == 0 || a[i] == -1)
				{
					break;
				}
			}
			if (a[i] == -1)
			{
				break;
			}
			for (j = i - 1; j >= 1; j--)
			{
				for (k = j - 1; k >= 1; k--)
				{
				if (a[j] > a[k] && a[j] % a[k] == 0 && a[j] / a[k] == 2)
				{
					num++;
				}
				if (a[k] > a[j] && a[k] % a[j] == 0 && a[k] / a[j] == 2)
				{
					num++;
				}
				}
			}
			System.out.print(num);
			System.out.print("\n");
			int[] a = new int[17];
			num = 0;
		}
		return 0;
	}
}

