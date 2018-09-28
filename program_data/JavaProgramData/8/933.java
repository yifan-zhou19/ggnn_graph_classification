package <missing>;

public class GlobalMembers
{
	public static int n1;
	public static int n2;
	public static int[] num1 = new int[100];
	public static int[] num2 = new int[100];
	public static int[] out = new int[200];
	//????
	public static void p1()
	{
		int i;

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
		for (i = 0;i < n1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num1[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n2;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				num2[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	//??????
	public static void p2(int[] num1, int[] num2, int n1, int n2)
	{
		int i;
		int j;
		int tmp;
		//????????
		for (i = 0;i < n1;i++)
		{
			for (j = i + 1;j < n1;j++)
			{
				if (num1[j] < num1[i])
				{
					tmp = num1[j];
					num1[j] = num1[i];
					num1[i] = tmp;
				}
			}
		}
		//??????
		for (i = 0;i < n2;i++)
		{
			for (j = i + 1;j < n2;j++)
			{
				if (num2[j] < num2[i])
				{
					tmp = num2[j];
					num2[j] = num2[i];
					num2[i] = tmp;
				}
			}
		}
	}
	//?????? ?????????
	public static void p3(int[] num1, int[] num2, int n1, int n2)
	{

		int i = 0;
		int j = 0;
		while (i < n1)
		{
			out[i] = num1[i];
			i++;
		}
		while (j < n2)
		{
			out[n1 + j] = num2[j];
			j++;
		}
	}
	//??
	public static void p4(int[] out, int n)
	{
		int i;
		System.out.printf("%d",out[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",out[i]);
		}
	}
	public static int Main()
	{
		p1();
		p2(num1, num2, n1, n2);
		p3(num1, num2, n1, n2);
		p4(out, n1 + n2);
		return 0;
	}




}

