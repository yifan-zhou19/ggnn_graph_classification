package <missing>;

public class GlobalMembers
{
	public static int[] str1 = new int[100];
	public static int[] str2 = new int[100];
	public static int[] str = new int[200];
	public static int m;
	public static int n;
	public static void f1()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				str1[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				str2[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void f2(int[] s, int k)
	{
		int i;
		int j;
		int t;
		for (j = 0;j < k - 1;j++)
		{
			for (i = 0;i < k - 1;i++)
			{
				if (s[i] > s[i + 1])
				{
					t = s[i];
					s[i] = s[i + 1];
					s[i + 1] = t;
				}
			}
		}
	}
	public static void f3(int[] s1, int[] s2, int[] s, int m, int n)
	{
		int i;
		for (i = 0;i < m;i++)
		{
			s[i] = s1[i];
		}
		for (i = 0;i < n;i++)
		{
			s[i + m] = s2[i];
		}
	}
	public static void f4(int[] s, int m, int n)
	{
		int i;
		for (i = 0;i < m + n;i++)
		{
			System.out.printf("%d",s[i]);
			if (i < m + n - 1)
			{
				System.out.print(" ");
			}
		}
		System.out.print("\n");
	}

	public static void Main()
	{
		f1();
		f2(str1, m);
		f2(str2, n);
		f3(str1, str2, str, m, n);
		f4(str, m, n);
	}

}

