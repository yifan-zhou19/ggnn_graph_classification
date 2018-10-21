package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100001];
		int i;
		int j;
		int n;
		int k;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 0;
		do
		{
			if (a[i] == k)
			{
				count++;
				for (j = i; j < n; j++)
				{
					 if (a[j + 1] != k)
					 {
						 a[j + 1 - count] = a[j + 1];
					 }
					 else
					 {
						 count++;
					 }
				}
			}
			i++;
		}while (j < n);
		System.out.print(a[0]);
		for (i = 1; i < (n - count); i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

