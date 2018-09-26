package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i; //?f[i]????i????????
		int[] f = new int[n + 2];
		f[n + 1] = 1; //?????????1???
		while (true)
		{
			f[n] = n * f[n + 1] + k;
			for (i = n - 1;i > 0;i--)
			{
				if (f[i + 1] % (n - 1) != 0) //????????f[i]?????n-1??
				{
					break;
				}
				f[i] = (f[i + 1] * n) / (n - 1) + k; //???

			}
			if (i == 0)
			{
				break; //??i=0,????
			}
			else
			{
				f[n + 1]++; //??????,???f[n+1]+1?????
			}
		}
		System.out.print(f[1]);
		return 0;
	}

}

