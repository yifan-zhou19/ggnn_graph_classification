package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int[] c = new int[10001];
		int i;
		int j;
		int max = 0;
		int min = 10001;
		int s = 0;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			for (j = a[i];j < b[i];j++)
			{
				c[j]++;
			}
			if (a[i] < min)
			{
				min = a[i];
			}
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = min;i < max;i++)
		{
			if (c[i] == 0)
			{
				System.out.print("no\n");
				s++;
				break;
			}
		}
		if (s == 0)
		{
			System.out.printf("%d %d\n",min,max);
		}
	}
}

