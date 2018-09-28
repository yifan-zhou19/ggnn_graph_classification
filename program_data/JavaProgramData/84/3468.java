package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[99];
		int i;
		int max;
		int s;
		int c;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = Integer.parseInt(tempVar2);
		}
		a[0] = s;
		max = s;
		c = -1;
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s = Integer.parseInt(tempVar3);
			}
		  a[i] = s;
		   if (max < a[i])
		   {
			   max = a[i];
		   j = i;
		   }
		}
		System.out.printf("%d\n",max);

		for (i = 0;i < n;i++)
		{
			if (c < a[i] && i != j)
			{
		  c = a[i];
			}
		}
		System.out.printf("%d",c);
	}
}

