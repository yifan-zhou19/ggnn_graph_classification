package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j = 0;
		int temp;
		int len;
		int num;
		int[] a = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num % 2 == 1)
			{
				a[j] = num;
				j++;
			}
			if (i == n - 1)
			{
				len = j;
			}
		}
		for (i = 0;i < len - 1;i++)
		{
			for (j = 0;j < len - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.print(a[0]);
		for (i = 1;i < len;i++)
		{
			System.out.print(",");
			System.out.print(a[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

