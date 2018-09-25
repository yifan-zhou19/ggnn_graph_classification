package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int[] s1 = new int[100];
	public static int[] s2 = new int[100];
	public static int i;
	public static int j;
	public static int t;
	public static int Main()

	{
		void get_in();
		void sort(int s1[],int s2[]);
		void putout();
		get_in();
		sort(s1, s2);
		putout();
		return 0;
	}

	public static void get_in()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s1[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < m;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s2[i] = Integer.parseInt(tempVar4);
			}
		}
	}

	public static void sort(int[] s1, int[] s2)
	{
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - 1 - j;i++)
			{
				if (s1[i] > s1[i + 1])
				{
					t = s1[i];
					s1[i] = s1[i + 1];
					s1[i + 1] = t;
				}
			}
		}
		for (j = 0;j < m - 1;j++)
		{
			for (i = 0;i < m - 1 - j;i++)
			{
				if (s2[i] > s2[i + 1])
				{
					t = s2[i];
					s2[i] = s2[i + 1];
					s2[i + 1] = t;
				}
			}
		}
	}

	public static void putout()
	{
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",s1[i]);
			}
			else
			{
				System.out.print(" ");
				System.out.printf("%d",s1[i]);
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.print(" ");
			System.out.printf("%d",s2[i]);

		}
	}


}

