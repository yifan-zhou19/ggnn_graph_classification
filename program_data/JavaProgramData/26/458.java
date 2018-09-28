package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		char d;
		int i;
		int w = 0;
		int k;
		int n;
		int m;
		int[] sd = new int[1000];
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i < n;i++)
		{
			sd[i] = 1;
		}
		for (i = 1;i < n;i++)
		{
			sd[i] = sd[i - 1];
			if (s.charAt(i) == 32)
			{
				sd[i]--;
			}
			if (s.charAt(i) != 32 && (sd[i - 1] <= 0))
			{
				sd[i] = 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sd[i] >= 0)
			{
			System.out.printf("%c",s.charAt(i));
			}
		}
	}

}
