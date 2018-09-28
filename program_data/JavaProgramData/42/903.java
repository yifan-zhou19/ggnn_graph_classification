package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100001];
		int n;
		int i = 1;
		int j;
		int k;
		int count;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		count = n;
		for (i = 1 ; i <= n ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 1;
		do
		{
			if (a[i] == k)
			{
				for (j = i ; j <= count - 1 ; j++)
				{
					a[j] = a[j + 1];
				}
				a[count] = 0;
				count = count - 1;
				i = i - 1;
			}
			i++;
		}while (i <= count);
		for (i = 1 ; i <= count - 1 ; i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[count]);
		System.out.print("\n");
		return 0;
	}

}

