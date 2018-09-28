package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int num;
		int counter = 0;
		int j;
		int[] a = new int[500];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1,counter = 0;i <= n;i++,counter++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num % 2 != 0)
			{
				a[counter] = num;
			}
			else
			{
				counter--;
			}
		}
		for (i = 1;i < counter;i++)
		{
			for (j = counter - 1;j >= i;j--)
			{
				if (a[j] < a[j - 1])
				{
					num = a[j];
					a[j] = a[j - 1];
					a[j - 1] = num;
				}
			}
		}
		for (i = 0;i < counter;i++)
		{
			if (i == 0)
			{
				System.out.print(a[i]);
			}
			else
			{
				System.out.print(",");
				System.out.print(a[i]);
			}
		}
		return 0;
	}
}

