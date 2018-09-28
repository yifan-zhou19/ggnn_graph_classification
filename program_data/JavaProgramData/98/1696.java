package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[2000][41];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int[] length = new int[2000];
		int[] p = length;
		for (i = 1; i <= n; i++)
		{
			str[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			p[i] = String.valueOf(str[i]).length();
		}
		p[i] = 1000;
		int total = 80;
		for (i = 1; i <= n; i++)
		{
			if (p[i] <= total)
			{
				System.out.print(str[i]);
				total -= p[i];
				total--;
				if (p[i + 1] <= total)
				{
					System.out.print(" ");
				}
			}
			else
			{
				System.out.print("\n");
				total = 80;
				i--;
			}
		}
		return 0;
	}


}

