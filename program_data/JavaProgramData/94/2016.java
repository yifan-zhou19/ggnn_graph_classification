package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N; //????
		int s = 0;
		int p;
		int[] a = new int[500];
		int[] b = new int[500];
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < N;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 0;j < N;j++)
		{
			if (a[j] % 2 != 0)
			{
				b[s] = a[j];
				s++; //13120005218zhy.zbklqx@gmail.com
			}
		}
		for (int m = 0;m < s;m++)
		{
			for (int n = 0;n < s - 1 - m;n++)
			{
				if (b[n] > b[n + 1])
				{
					p = b[n + 1];
				b[n + 1] = b[n];
				b[n] = p;
				}
			}
		}
		for (int l = 0;l < s;l++)
		{
			if (l == 0)
			{
				System.out.print(b[0]);
			}
			else
			{
				System.out.print(",");
				System.out.print(b[l]);
			}
		}
		return 0;
	}


}

