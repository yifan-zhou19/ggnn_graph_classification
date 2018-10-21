package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i = 0;
		int[] a = new int[300];
		int j;
		int b = 0;
		int[] c = new int[100];
		int d = 2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		c[1] = a[0];
		for (i = 1;i < n;i++)
		{
		b = 0;
				for (j = 0;j < i;j++)
				{
		if (a[i] == a[j])
		{
			b = b;
		}
		else
		{
			b++;
		}
				}
		  if (b != i)
		  {
			  b = 0;
		  }
		  else
		  {
			  c[d] = a[i],d++;
		  }
		}
	for (i = 1;i < d - 1;i++)
	{
		System.out.printf("%d,",c[i]);
	}
	System.out.printf("%d",c[d - 1]);
	}

}

