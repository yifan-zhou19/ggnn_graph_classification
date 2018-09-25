package <missing>;

public class GlobalMembers
{
	public static int max(int[] num, int n)
	{
		int i;
		int result = num[0];
		for (i = 1;i < n;i++)
		{
			if (num[i] > result)
			{
				result = num[i];
			}
		}
			return (result);
	}
	public static void Main()
	{
		int n;
		int[] num = new int[100];
		int m1;
		int m2;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num[i] = Integer.parseInt(tempVar2);
		}
		}
		m1 = max(num, n);
		System.out.printf("%d\n",m1);
		for (i = 0;i < n;i++)
		{
			if (num[i] == m1)
			{
				num[i] = -100;
			}
		}
			m2 = max(num, n);
			System.out.printf("%d\n",m2);
	}



}

