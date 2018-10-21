package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] p = new int[1000];
		int[] q = new int[1000];
		int i = 0;
		int j;
		int n;
		int max = 0;
		int[] a = new int[1000];
		int m = 0;
		char c;
		do
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		 i++;
		} while (c == ',');
		n = i;
		for (j = 0;j < n;j++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			q[j] = Integer.parseInt(tempVar3);
		}
		c = System.in.read();
		}
	for (i = 0;i < n;i++)
	{
		if (max < q[i])
		{
			max = q[i];
		}
	}
	   for (i = 2;i <= max;i++)
	   {
	   for (j = 0;j < n;j++)
	   {
		if (p[j] <= i != 0 && q[j]> i)
		{
			a[i]++;
		}
	   }
	   }
	for (i = 0;i < 1000;i++)
	{
		if (m < a[i])
		{
			m = a[i];
		}
	}
	System.out.printf("%d %d",n,m);
	}


}

