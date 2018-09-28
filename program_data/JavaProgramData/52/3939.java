package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int m;
		int n;
		int[] b = new int[100];
		int i;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = m - n;i < m;i++)
		{
			b[j] = a[i];
			j++;
		}
		for (j = 0;j < n;j++)
		{
		for (i = m - 1;i >= 0;i--)
		{
		   a[i + 1] = a[i];
		}
		}
		for (i = 0;i < n;i++)
		{
			a[i] = b[i];
		}
		for (i = 0;i < m;i++)
		{
		  if (i == 0)
		  {
		  System.out.printf("%d",a[i]);
		  }
		  else
		  {
		  System.out.printf(" %d", a[i]);
		  }
		}
		System.in.read();
		System.in.read();
	}
}

