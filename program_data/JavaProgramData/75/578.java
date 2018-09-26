package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int[] a = new int[1001]; //a,b????????d???????????n?????max?????????
		int[] b = new int[1001];
		int[] d = new int[1000];
		int n;
		int max = 0;
		char c; //????

		for (n = 1; n <= 1000; n++)
		{
			a[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (System.in.read() == '\n') //??????????
			{
				break;
			}
		}

		//????????????
		b[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 2; j <= n; j++)
		{
			c = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		//????????????
		for (int j = 0; j < 1000; j++)
		{
			for (int k = 1; k <= n; k++)
			{
				if (a[k] <= j != 0 && b[k] > j)
				{
					d[j]++;
				}
			}
			max = max > d[j] != 0? max: d[j]; //???????
		}

		System.out.print(n);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

