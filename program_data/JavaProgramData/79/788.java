package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct Link
	//	{
	//	 int data;
	//	 int next;
	//	};

	   Link[] a = tangible.Arrays.initializeWithDefaultLinkInstances(Max);
	   int n;
	   int m;
	   int i;
	   int p;

	 while (true)
	 {
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }
	   if (n == 0 || m == 0)
	   {
		   System.exit(0);
	   }
	   for (i = 0;i <= n;i++)
	   {
		   a[i].data = i,a[i].next = i + 1;
	   }
	   a[n].next = 1;
	   a[0].data = n;
	   p = n;
	   while (a[0].data > 1)
	   {

		  for (i = 1;i < m;i++)
		  {
			  p = a[p].next;
		  }
		  a[p].next = a[a[p].next].next;
		  a[0].data--;

	   }

	   System.out.printf("%d\n",a[p].data);
	 }

	}
}

