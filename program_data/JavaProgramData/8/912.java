package <missing>;

public class GlobalMembers
{
	public static int[] s1 = new int[100];
	public static int[] s2 = new int[100];
	public static int i;
	public static int j;
	public static int a;
	public static int b;
	public static int t;
	public static int s;
	public static void in()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < a;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s1[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < b;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s2[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void order()
	{

		for (i = 1;i < a;i++)
		{
			for (j = 0;j < a - i;j++)
			{
				if (s1[j] > s1[j + 1])
				{
					t = s1[j];
					s1[j] = s1[j + 1];
					s1[j + 1] = t;
				}
			}
		}
		for (i = 1;i < b;i++)
		{
			for (j = 0;j < b - i;j++)
			{
				if (s2[j] > s2[j + 1])
				{
					t = s2[j];
					s2[j] = s2[j + 1];
					s2[j + 1] = t;
				}
			}
		}
	}
	public static void stick()
	{

		s = a + b;
		for (i = a;i < s;i++)
		{
			s1[i] = s2[i - a];
		}
	}
	public static void out()
	{

		for (i = 0;i < a + b;i++)
		{
			if (i == 0)
			{
			System.out.printf("%d",s1[i]);
			}
			else
			{
				System.out.printf(" %d",s1[i]);
			}
		}
	}

	public static void Main()
	{
		 in();
		 order();
		 stick();
		out();
	}


}

