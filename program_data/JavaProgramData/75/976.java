package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		int total;
		int max;
		char ch;
		int i = 0;
		int j = 0;
		do
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
			i++;
		}while (ch == ',');
		do
		{
			y[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
			j++;
		}while (ch == ',');
		total = i;
		int[] z = new int[1000];
		for (int k = 0 ; k < total ; k++)
		{
			for (int q = x[k] ; q < y[k] ; q++)
			{
				z[q]++;
			}
		}
		int s = 0;
		for (int l = 0 ; l <= 998 ; l++)
		{
			if (z[l] > z[l + 1])
			{
				s = z[l + 1];
				z[l + 1] = z[l];
				z[l] = s;
			}
		}
		max = z[999];
		System.out.print(total);
		System.out.print(" ");
		System.out.print(max);
		return 0;
	}
}

