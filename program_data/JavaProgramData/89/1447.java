package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int p;
		int q;
		int j;
		int k;
		int[] person = new int[10000];
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0; j < 10000; j++)
		{
			person[j] = 0;
		}
		while ((p) != 0 && (cin = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if ((p == 0) && (q == 0))
			{
				break;
			}
			else
			{
				person[p]--; // ???p???????????????-1
				person[q]++; // p?????????q?????????
			}
		}
		for (k = 0; k < n; k++)
		{
			if (person[k] == n - 1)
			{
				flag = 1;
				System.out.print(k);
				System.out.print("\n");
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}

}

