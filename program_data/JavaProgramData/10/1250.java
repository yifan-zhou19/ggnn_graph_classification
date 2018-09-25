package <missing>;

public class GlobalMembers
{
	public static int count(int[] h, int[] num, int n)
	{
		int count = 1;
		int i;
		for (i = 0;i < n;i++)
		{
		if (h[i] > h[n] && num[i] > count)
		{
			count = num[i];
		}
		}
		count++;
		return (count);
	}
	public static int Main()
	{
		int n;
		int[] h = new int[25];
		int[] num = new int[25];
		int i;
		int j;
		int temp;
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
			h[i] = Integer.parseInt(tempVar2);
		}
		}
		num[0] = 1;
		for (i = 1;i < n;i++)
		{
		num[i] = count(h, num, i);
		}
		for (i = 0;i < n - 1;i++)
		{
		for (j = i + 1;j < n;j++)
		{
		if (num[i] > num[j])
		{
		temp = num[i];
		num[i] = num[j];
		num[j] = temp;
		}
		}
		}
		System.out.printf("%d\n",num[n - 1]);
	}

}

