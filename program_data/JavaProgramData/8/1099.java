package <missing>;

public class GlobalMembers
{
	public static int comp(Object a, Object b)
	{
		return*(int)a - (int)b;
	}
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		int[] a = new int[n];
		int[] b = new int[m];
		for (i = 0;i < n;i++)
		{
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 a[i] = Integer.parseInt(tempVar3);
		 }
		}
		for (i = 0;i < m;i++)
		{
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 b[i] = Integer.parseInt(tempVar4);
		 }
		}
		qsort(a,n,(Integer.SIZE / Byte.SIZE),comp);
		qsort(b,m,(Integer.SIZE / Byte.SIZE),comp);
		for (i = 0;i < n;i++)
		{
		 System.out.printf("%d ",a[i]);
		}
		for (i = 0;i < m;i++)
		{
			 System.out.printf("%d",b[i]);
		  if (i < m - 1)
		  {
		   System.out.print(" ");
		  }
		}
		return 0;
	}
}

