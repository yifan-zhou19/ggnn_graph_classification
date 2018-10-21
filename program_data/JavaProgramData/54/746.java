package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] peach = new int[100];
		int i;
		int n;
		int k;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		peach[n] = n + k; //?n???????n+k???
		for (i = n;i >= 2;i--)
		{
			if (peach[i] % (n - 1) == 0)
			{
				peach[i - 1] = peach[i] / (n - 1) * n + k; //???????????????????
			}
			else
			{
				peach[n] = peach[n] + n; //??????????
				i = n + 1; //????
			}
		}
		System.out.print(peach[1]);
		System.out.print("\n");
		return 0;
	}
}

