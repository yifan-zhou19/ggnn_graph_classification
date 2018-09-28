package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] count = new int[1000];
		int[] x = new int[1000];
		int[] y = new int[1000];
		int[] num = new int[1000];
		int i = 1;
		int j;
		int k;
		int most = 0;
		String ch = new String(new char[100000]);
		char t;
		ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (j = 0; ch.charAt(j) != '\0'; j++)
		{
			if (ch.charAt(j) == ',')
			{
				num[i] = j;
				i++;
			}
		}
		x[1] = ch.charAt(0) - 48;
		for (j = 1; j < num[1]; j++)
		{
			x[1] = 10 * x[1] + ch.charAt(j) - 48;
		}
		for (j = 2; j <= i; j++)
		{
			x[j] = ch.charAt(num[j - 1] + 1) - 48;
			if (j == i)
			{
				for (k = num[i - 1] + 2; ch.charAt(k) != '\0'; k++)
				{
					x[i] = 10 * x[i] + ch.charAt(k) - 48;
				}
			}
			for (k = num[j - 1] + 2; k < num[j]; k++)
			{
				x[j] = 10 * x[j] + ch.charAt(k) - 48;
			}
		}
		y[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = x[1]; j < y[1]; j++)
		{
			count[j]++;
		}
		for (j = 2; j <= i; j++)
		{
			t = ConsoleInput.readToWhiteSpace(true).charAt(0);
			y[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (k = x[j]; k < y[j]; k++)
			{
				count[k]++;
			}
		}
		for (j = 1; j < 1000; j++)
		{
			if (count[j] > most)
			{
				most = count[j];
			}
		}
		System.out.print(i);
		System.out.print(" ");
		System.out.print(most);
		System.out.print("\n");
		return 0;
	}
}

