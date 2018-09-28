package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[100];
		int[] m = new int[100];
		int i;
		int num = 0;
		for (i = 0; i < 100; i++)
		{
			n[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n[i] == 0 && m[i] == 0)
			{
				break;
			}
			num++;
		}
		int j = 0;
		for (j; j < num; j++)
		{
			int s = 0;
			for (int k = 2; k <= n[j]; k++)
			{
				s = (s + m[j]) % k;
			}
			System.out.print(s + 1);
			System.out.print("\n");
		}

		return 0;
	}
}

