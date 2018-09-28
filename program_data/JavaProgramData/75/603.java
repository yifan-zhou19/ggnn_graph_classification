package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		char c;
		int i = 0;
		int g = 0;
		int l = 0;
		do
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = System.in.read();
			i++;
		}while (c != '\n');
		for (int j = 0;j <= i - 1;j++)
		{
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
		}
		for (int p = 1; p <= 1000; p++)
		{
			for (int k = 0; k <= i - 1; k++)
			{
				if (p >= a[k] != 0 && p < b[k])
				{
					g++;
				}
			}
			if (g > l)
			{
				l = g;
			}
			g = 0;
		}
		System.out.print(i);
		System.out.print(" ");
		System.out.print(l);
		return 0;
	}




}

