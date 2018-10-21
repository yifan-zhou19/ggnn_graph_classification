package <missing>;

public class GlobalMembers
{
	//* ????????*
	//* author:??? *
	//* time : 10.19  *



	public static int Main()
	{
		int[] a = new int[100000];
		int n;
		int k;
		int i;
		int j;
		int m;
		int h;
		int g;
		int t;
		int num = 0;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= n - 1; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0; j <= n - 1; j++)
		{
			if (a[j] == k)
			{
				count++;
			}
		}
		t = n;
		do
		{
			for (g = 0; g <= t - num - 1; g++)
			{
				if (a[g] == k)
				{
					num++;
					for (h = g; h < t - num; h++)
					{
						a[h] = a[h + 1];
					}
				}

			}
		}while (num < count);
		for (m = 0; m <= (n - count - 2); m++)
		{
			System.out.print(a[m]);
			System.out.print(" ");
		}
		System.out.print(a[n - count - 1]);
		System.out.print("\n");
		return 0;
	}


}

