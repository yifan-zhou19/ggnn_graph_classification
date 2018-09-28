package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[2000];
		int[] b = new int[2000];
		int max;
		int min;
		int i = 0;
		int j;
		int n;
		int k = 0;
		int s = 0;
		char x = ',';
		while (x != '\n')
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			x = System.in.read();
			i++;
		}
		n = i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(null, 1);
			if (tempVar3 != null)
			{
				x = tempVar3.charAt(0);
			}
		}
		min = a[0];
		max = b[0];
		for (i = 0;i < n;i++)
		{
			if (a[i] < min)
			{
				min = a[i];
			}
			if (b[i] > max)
			{
				max = b[i];
			}
		}
	for (i = min;i <= max;i++)
	{
			for (j = 0;j < n;j++)
			{
				if (i >= a[j] != 0 && i < b[j])
				{
					k++;
				}
			}
				if (k > s)
				{
					s = k;
				}
				k = 0;
	}
		System.out.printf("%d %d",n,s);
	}


}

