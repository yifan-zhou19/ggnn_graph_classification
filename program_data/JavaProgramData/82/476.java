package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int t;
		int c;
		int n;
		int i;
		int m = 0;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  b = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  c = Integer.parseInt(tempVar3);
		  }
		  if (b >= 90 && b <= 140 && c >= 60 && c <= 90)
		  {
				m++;
				a[i] = m;
		  }
		  else
		  {
			   m = 0;
			   a[i] = 0;
		  }
		}
			a[n] = a[n - 1];
		for (i = 0;i < n;i++)
		{
		   if (n == 1)
		   {
			  t = a[0];
		   }
		   else if (a[i + 1] > a[i])
		   {
			  t = a[i + 1];
		   }
		   else
		   {
			  t = a[i + 1];
			  a[i + 1] = a[i];
			  a[i] = t;
			  t = a[i + 1];
		   }
		}
		System.out.printf("%d",t);
		return 0;
	}
}

