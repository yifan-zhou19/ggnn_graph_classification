package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int t;
		int[] a = new int[200];
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
		for (i = 0;i < n;i++)
		{
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 a[i] = Integer.parseInt(tempVar3);
		 }
		}
		int l = 0;
		while (l < m)
		{
			 t = a[n - 1];
			 for (i = n - 1;i >= 1;i--)
			 {
			 a[i] = a[i - 1];
			 }
			 a[0] = t;
			 l++;
		}
		 for (i = 0;i < n;i++)
		 {
			 if (i == 0)
			 {
			  System.out.printf("%d",a[i]);
			 }
			 else
			 {
			  System.out.printf(" %d",a[i]);
			 }
		 }
		 System.out.print("\n");
		 System.in.read();
		 System.in.read();
	}


}

