package <missing>;

public class GlobalMembers
{
	//????
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int[] h = new int[100];
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		n = 0;
		for (n = 0;n < m;n++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[n] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[n] = Integer.parseInt(tempVar3);
			}
		}
		i = 0;
		j = 0;
		n = 0;
		for (n = 0;n < m;n++)
		{
			h[n] = 0;
		 for (j = i;j < m;j++)
		 {
			i = j + 1;
			if (a[j] >= 90 && a[j] <= 140 && b[j] >= 60 && b[j] <= 90)
			{
				h[n]++;
			}
			else
			{
				break;
			}
		 }
		}
		i = 0;
		for (i = 0;i < n;i++)
		{
			if (h[i] > h[0])
			{
				h[0] = h[i];
			}
		}
		System.out.printf("%d\n",h[0]);
		return 0;
	}



}

