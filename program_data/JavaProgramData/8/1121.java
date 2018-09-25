package <missing>;

public class GlobalMembers
{
	public static int input(int[] s, int n)
	{
		int i = 0;
		for (i = 0; i < n; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s[i] = tempVar;
			}
		}
		return 0;
	}

	public static int sort(int[] s, int n)
	{
		int i = 0;
		int j = 0;
		for (i = 0; i < n; i++)
		{
			for (j = 1; j < n; j++)
			{
				if (s[j - 1] > s[j])
				{
					int temp = s[j - 1];
					s[j - 1] = s[j];
					s[j] = temp;
				}
			}
		}
		return 0;
	}

	public static int combine(int[] s1, int[] s2, int n1, int n2, int[] s)
	{
		int i = 0;
		for (i = 0; i < n1; i++)
		{
			s[i] = s1[i];
		}
		for (i = 0; i < n2; i++)
		{
			s[i + n1] = s2[i];
		}
		return 0;
	}

	public static int output(int[] s, int n)
	{
		int i = 0;
		if (n <= 0)
		{
			return 0;
		}
		System.out.printf("%d", s[0]);
		for (i = 1; i < n; i++)
		{
			System.out.printf(" %d", s[i]);
		}
	}

	public static int Main()
	{
		int n1 = 0;
		int n2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n2 = Integer.parseInt(tempVar2);
		}
		int[] s1 = new int[1000];
		int[] s2 = new int[1000];
		input(s1, n1);
		input(s2, n2);
		sort(s1, n1);
		sort(s2, n2);
		int[] s = new int[2000];
		combine(s1, s2, n1, n2, s);
		output(s, n1 + n2);
		return 0;
	}

}

