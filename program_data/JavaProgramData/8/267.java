package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] s1 = new int[1000];
	public static int[] s2 = new int[1000];
	public static int[] s = new int[1000];
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
				s1[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s2[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void f2()
	{
		int i;
		int j;
		int temp;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m - 1;j++)
			{
				if (s1[j] > s1[j + 1])
				{
					temp = s1[j];
					s1[j] = s1[j + 1];
					s1[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (s2[j] > s2[j + 1])
				{
					temp = s2[j];
					s2[j] = s2[j + 1];
					s2[j + 1] = temp;
				}
			}
		}
	}
	public static void f3()
	{
		int i;
		for (i = 0;i < m;i++)
		{
			s[i] = s1[i];
		}
		for (i = m;i < m + n;i++)
		{
			s[i] = s2[i - m];
		}
	}
	public static void f4()
	{
		int i;
		System.out.printf("%d",s[0]);
		for (i = 1;i < m + n;i++)
		{
			System.out.printf(" %d",s[i]);
		}
	}
	public static void Main()
	{
		f1();
		f2();
		f3();
		f4();
	}

}

