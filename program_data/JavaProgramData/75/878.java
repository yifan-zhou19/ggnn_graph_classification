package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		int i = 1;
		int j;
		int k;
		int[] num = new int[1000];
		int max = 0;
		x[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (cin.peek() != '\n')
		{
			System.in.read();
			x[i++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j < i;j++)
		{
			System.in.read();
			y[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (k = 0;k < 1000;k++)
		{
			 for (j = 0;j < i;j++)
			 {
				 if (k >= x[j] != 0 && k < y[j])
				 {
					 num[k]++;
				 }
			 }
		}
		for (j = 0;j < 1000;j++)
		{
			if (num[j] > max)
			{
				max = num[j];
			}
		}
		System.out.print(i);
		System.out.print(" ");
		System.out.print(max);
		 return 0;
	}


}

