package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static void Main()
	{
		void input(int num1[],int num2[]);
		void change(int num1[],int num2[]);
		void pai(int num1[],int num2[]);
		void output(int num1[]);
		int[] num1 = new int[100];
		int[] num2 = new int[100];
		input(num1, num2);
		change(num1, num2);
		pai(num1, num2);
		output(num1);
	}
	public static void input(int[] num1, int[] num2)
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
	public static void change(int[] num1, int[] num2)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j < m - i - 1;j++)
			{
				if (num1[j] > num1[j + 1])
				{
					t = num1[j];
					num1[j] = num1[j + 1];
					num1[j + 1] = t;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (num2[j] > num2[j + 1])
				{
					t = num2[j];
					num2[j] = num2[j + 1];
					num2[j + 1] = t;
				}
			}
		}
	}
	public static void pai(int[] num1, int[] num2)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			num1[m + i] = num2[i];
		}
	}
	public static void output(int[] num1)
	{
		int i;
		for (i = 0;i < m + n - 1;i++)
		{
			System.out.printf("%d ",num1[i]);
		}
		System.out.printf("%d",num1[m + n - 1]);
	}
}

