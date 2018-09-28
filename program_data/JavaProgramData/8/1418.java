package <missing>;

public class GlobalMembers
{
	public static void read(int n1, int n2, int[] s1, int[] s2)
	{
		int i;

		for (i = 0;i < n1;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s1[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < n2;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s2[i] = Integer.parseInt(tempVar2);
			}
		}
	}
	public static void bubble_sort(int[] s, int n)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (s[j] > s[j + 1])
				{
					t = s[j];
					s[j] = s[j + 1];
					s[j + 1] = t;
				}
			}
		}
	}
	public static void write(int n1, int n2, int[] s1, int[] s2)
	{
		int i;
		System.out.printf("%d",s1[0]);
		for (i = 1;i < n1;i++)
		{
			System.out.printf(" %d",s1[i]);
		}
		for (i = 0;i < n2;i++)
		{
			System.out.printf(" %d",s2[i]);
		}
	}
	public static int Main()
	{
		int n1;
		int n2;
		int[] s1 = new int[101];
		int[] s2 = new int[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n2 = Integer.parseInt(tempVar2);
		}
		read(n1, n2, s1, s2);
		bubble_sort(s1, n1);
		bubble_sort(s2, n2);
		write(n1, n2, s1, s2);

	}
}

