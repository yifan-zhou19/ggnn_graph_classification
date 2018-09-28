package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] a = new int[100];
		int i;
		int m1;
		int m2;
		int n;
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
	   m1 = a[0];
		m2 = 0;
	   for (i = 1;i < n;i++)
	   {
		   if (m1 < a[i])
		   {
			   m1 = a[i];
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   if (a[i] < m1)
		   {
			   m2 = a[i];
		   }
	   }

	  for (i = 0;i < n;i++)
	  {
		   if (a[i] < m1 && m2 < a[i])
		   {
			   m2 = a[i];
		   }
	  }
		System.out.printf("%d\n%d",m1,m2);



	}

}

