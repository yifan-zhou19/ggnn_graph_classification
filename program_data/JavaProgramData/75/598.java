package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1001];
		int[] x = new int[1000];
		int[] y = new int[1000];
		int i = 0;
		int j = 0;
		int k;
		int u;
		int l;
		int counter;
		int max = 0;
		char ch;

		do
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
		}while ((ch = System.in.read()) == ',');
		do
		{
			y[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j++;
		}while ((ch = System.in.read()) == ',');
		for (k = 0; k < i; k++)
		{
			for (u = x[k]; u < y[k]; u++)
			{
				a[u]++;
			}
		}
		for (l = 0; l < 1001; l++)
		{
			if (a[l] > max)
			{
				max = a[l];
			}
		}
		System.out.print(i);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
			return 0;
	}

}

