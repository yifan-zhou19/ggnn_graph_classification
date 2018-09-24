package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //????
		int[] a = new int[100001];
		int k;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++) //??????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 1;
		while (i <= n)
		{
			if (a[i] == k) //????????
			{
					for (j = i;j <= n;j++) //????
					{
						a[j] = a[j + 1];
					}
					n = n - 1; //??????
			}
			else
			{
				i++;
			}
		}
		for (i = 1;i <= n - 1;i++) //????
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n]);
		return 0; //????
	}
}

