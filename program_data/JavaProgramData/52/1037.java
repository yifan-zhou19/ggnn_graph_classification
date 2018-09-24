package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int m;
		int[] num = new int[100];
		void move(int num[100],int n);
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
				num[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < m;i++)
		{
			move(num, n);
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",num[i]);
		}
		System.out.printf("%d",num[n - 1]);
	}
	public static void move(int[] num, int n)
	{
		int t;
		int j;
		t = num[n - 1];
		for (j = n - 1;j > 0;j--)
		{
			num[j] = num[j - 1];
		}
		num[0] = t;
	}
}

