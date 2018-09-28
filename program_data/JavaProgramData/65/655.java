package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[400];
	int i;
	int j;
	int n;
	int m;
	int s;
	int p;
	int q;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	m = 2 * n;
	p = n / 2;
	for (i = 0;i < m;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(a[i]) = Integer.parseInt(tempVar2);
	}
	}
	s = 0;
	q = 0;
	for (j = 0;j < m;j = j + 2)
	{
	   if (a[j] == 1 && a[j + 1] == 2)
	   {
	   s = s + 1;
	   }
	   else if (a[j] == 0 && a[j + 1] == 1)
	   {
	   s = s + 1;
	   }
	   else if (a[j] == 2 && a[j + 1] == 0)
	   {
	   s = s + 1;
	   }
	   else if (a[j] == 2 && a[j + 1] == 1)
	   {
	   q = q + 1;
	   }
	   else if (a[j] == 1 && a[j + 1] == 0)
	   {
	   q = q + 1;
	   }
	   else if (a[j] == 0 && a[j + 1] == 2)
	   {
	   q = q + 1;
	   }
	}
	 if (s == q)
	 {
	 System.out.print("Tie");
	 }
	 else if (s > q)
	 {
	 System.out.print("A");
	 }
	 else if (s < q)
	 {
	 System.out.print("B");
	 }
	return 0;
	}
}

