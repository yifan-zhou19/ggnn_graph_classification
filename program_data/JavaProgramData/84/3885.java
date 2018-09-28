package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[100];
	int n;
	int i;
	int j;
	int b;
	int c;
	int t;
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
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	b = a[0];
	c = a[1];
	if (b < c)
	{
			t = b;
		 b = c;
		 c = t;
	}
	for (j = 2;j < n;j++)
	{
		   if (a[j] < b && a[j]> c)
		   {
		   c = a[j];
		   }
		else if (a[j] > b)
		{
			  c = b;
		   b = a[j];
		}
	}
	System.out.printf("%d",b);
	System.out.print("\n");
	System.out.printf("%d",c);
	}

}

