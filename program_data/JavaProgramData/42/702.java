package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int k;
		int[] a = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (int i = 0;i < n;i++)
		{
		   if (a[i] != m)
		   {
		   System.out.printf("%d",a[i]);
		   k = i;
		   break;
		   }
		}
		for (int i = k + 1;i < n;i++)
		{
		 if (a[i] != m)
		 {
		 System.out.printf(" %d",a[i]);
		 }
		 System.in.read();
		 System.in.read();
		}
	}

}

