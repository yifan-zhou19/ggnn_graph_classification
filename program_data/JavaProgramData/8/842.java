package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static void nem(int[] num1, int[] num2)
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			num1[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < n;i++)
		{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			num2[i] = Integer.parseInt(tempVar4);
		}
		}
	}
	public static void pai(int[] num, int x)
	{
		int i;
		int j;
		int t;
		for (j = 0;j < x - 1;j++)
		{
		for (i = 0;i < x - 1 - j;i++)
		{
		if (num[i] > num[i + 1])
		{
			t = num[i];
			num[i] = num[i + 1];
			num[i + 1] = t;
		}
		}
		}
	}
	public static void he(int[] num1, int[] num2, int[] num)
	{
		int i;
		for (i = 0;i < m;i++)
		{
		num[i] = num1[i];
		}
		for (i = m;i < m + n;i++)
		{
		num[i] = num2[i - m];
		}
	}
	public static void printnum(int[] num)
	{
		int i;
		System.out.printf("%d",num[0]);
		for (i = 1;i < m + n;i++)
		{
		System.out.printf(" %d",num[i]);
		}
	}
	public static int Main()
	{
		int[] num = new int[100];
		int[] num1 = new int[100];
		int[] num2 = new int[100];
		nem(num1, num2);
		pai(num1, m);
		pai(num2, n);
		he(num1, num2, num);
		printnum(num);
		return 0;
	}
}

