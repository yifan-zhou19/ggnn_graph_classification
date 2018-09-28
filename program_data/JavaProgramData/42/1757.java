package <missing>;

public class GlobalMembers
{
	public static int[] s = new int[1000000];
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int a;
		int pos;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			s[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
				if (s[i] != k)
				{
			   pos = i;
				}
		}
		for (i = 1;i <= n;i++)
		{
			if (s[i] != k && i != pos)
			{
				System.out.print(s[i]);
				System.out.print(" ");
			}
			if (s[i] != k && i == pos)
			{
			   System.out.print(s[i]);
			   System.out.print("\n");
			}
		}
		return 0;
	}

}

