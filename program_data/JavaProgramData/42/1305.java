package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[100001];
		int valid;
		valid = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= valid; i++)
		{
			n[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int d;
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int j = 1;
		int Do = valid;
		while (Do != 0)
		{
			if (n[j] == d)
			{
				for (int k = j; k < valid; k++)
				{
					n[k] = n[k + 1];
				}
				valid--;
				Do--;
			}
			else
			{
				Do--;
				j++;
			}
		}
		for (int i = 1; i <= valid; i++)
		{
			System.out.print(n[i]);
			if (i - valid != 0)
			{
				System.out.print(' ');
			}
		}

		return 0;
	}
}

