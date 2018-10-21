package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int min;
		int max;
		int k;
		int p;
		int q;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}
		}
		min = a[0],max = b[0];
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
		for (k = 1;k < n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (a[i] > a[i + 1])
				{
					p = a[i];
					a[i] = a[i + 1];
					a[i + 1] = p;
					q = b[i];
					b[i] = b[i + 1];
					b[i + 1] = q;
				}
			}
		}
		s = 0;
		int[] c = new int[n];
		for (i = 1;i < n;i++)
		{
			for (k = 0;k < i;k++)
			{
			if (b[k] < a[i])
			{
				c[i] = 1;
			}
			else
			{
				c[i] = 0;
				break;
			}
			}
		}
		for (i = 1;i < n;i++)
		{
			s = s + c[i];
		}
		if (s == 0)
		{
			System.out.printf("%d %d",min,max);
		}
		else
		{
			System.out.print("no");
		}
	  return 0;
	}



}

