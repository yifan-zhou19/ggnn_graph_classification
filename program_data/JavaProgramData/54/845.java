package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int m;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] f = new int[n + 1]; //????????? ??? ??? ??
		for (m = 1;;m++)
		{
			f[1] = m;
			for (i = 2;i <= n + 1;i++)
			{
				if ((f[i - 1] - k) % n != 0) //?????? ???????????
				{
					break;
				}
				else
				{
					f[i] = f[i - 1] - k - (f[i - 1] - k) / n;
				}
			}
		if ((i == n + 2) && (f[n] >= n + k)) //???????????????????
		{
			System.out.print(m);
			System.out.print("\n");
			break;
		}
		else
		{
			continue;
		}
		}
		return 0;
	}

}

