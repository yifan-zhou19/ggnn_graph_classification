package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] m = new int[10000];
		int[] n = new int[10000];
		int[] s = new int[10000];
		int i;
		for (i = 0;;i++)
		{
			n[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n[i] == 0 && m[i] == 0)
			{
				break;
			}
		}
		for (int j = 0;j < i;j++)
		{
			s[j] = 0;
			for (int k = 2;k <= n[j];k++)
			{
				s[j] = (s[j] + m[j]) % k;
			}
		}
		for (int j = 0;j < i;j++)
		{
			System.out.print(s[j] + 1);
			System.out.print("\n");
		}
	}
}

