package <missing>;

public class GlobalMembers
{
	public static int checksu(int n)
	{
	int i = 2;
	int m = 0;
	for (i = 2;i * i <= n;i++)
	{
	if (n % i == 0)
	{
		m = 1;
	break;
	}
	}
	if (m == 1)
	{
	return 0;
	}
	else
	{
	return 1;
	}
	}
	public static int checkhui(int n)
	{
	int i = 0;
	int[] a = new int[100];
	int j;
	while (n != 0)
	{
	i++;
	a[i] = n % 10;
	n = n / 10;
	}
	for (j = 1;j < i;j++)
	{
	  if (a[j] != a[i + 1 - j])
	  {
	  break;
	  }
	}
	if (j == i)
	{
	return 1;
	}
	else
	{
	return 0;
	}
	}
	public static int Main()
	{
	  int a;
	  int b;
	  int[] c = new int[1000];
	  int l;
	  int k = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  b = Integer.parseInt(tempVar2);
	  }
					 for (l = a;l <= b;l++)
					 {
						  if (checksu(l) == 1 && checkhui(l) == 1)
						  {
						  c[k] = l;
						  k++;
						  }
					 }
	 if (k == 0)
	 {
	 System.out.print("no\n");
	 }
	 else
	 {
		   for (int p = 0;p <= k - 1;p++)
		   {
			   System.out.printf("%d",c[p]);
		   if (p != k - 1)
		   {
		   System.out.print(",");
		   }
		   }
	 }
	System.in.read();
	System.in.read();
	System.in.read();
	}

}

