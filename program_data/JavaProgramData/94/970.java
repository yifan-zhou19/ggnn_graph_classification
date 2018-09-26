package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int k;
		int j = 0;
		int m;
		int t;
		int l;
		int[] a = new int[500]; //????
		int[] b = new int[500]; //????
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < N;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] % 2 == 1) //??
			{
				b[j++] = a[i];
			}
		}
		for (m = 0;m < j - 1;m++) //????
		{
			for (k = 0;k < j - 1 - m;k++)
			{
				if (b[k] > b[k + 1])
				{
					t = b[k];
					b[k] = b[k + 1];
					b[k + 1] = t;
				}
			}
		}
				for (l = 0;l < j - 1;l++)
				{
					System.out.print(b[l]);
					System.out.print(",");
				}
				System.out.print(b[j - 1]);
				System.out.print("\n");
		System.in.read();
		System.in.read();
		return 0;
	}
}

