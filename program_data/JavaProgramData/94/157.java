package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[500];
		int[] b = new int[499];
		int j = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] % 2 == 1)
			{
				b[j++] = a[i];
			}
		}
		j--;
		for (i = 0;i < j - 1;i++)
		{
			for (int k = 0;k < j - i;k++)
			{
				if (b[k] > b[k + 1])
				{
					int temp = b[k];
					b[k] = b[k + 1];
					b[k + 1] = temp;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.print(b[i]);
			System.out.print(',');
		}
		System.out.print(b[i]);
	}
}

