package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i;
		int d;
		int j;
		int k;
		int n;
	k = 0;
	for (k = 0;k < 1000;k++)
	{
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
	if (n == 0)
	{
		break;
	}
	 for (i = 0;i < n;i++)
	 {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[i] = Integer.parseInt(tempVar2);
		}
	 }
	 for (i = 0;i < n;i++)
	 {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 a[i] = Integer.parseInt(tempVar3);
		 }
	 }
	   for (i = 0;i < n;i++)
	   {
	   for (j = 0;j < n - 1 - i;j++)
	   {
		  if (a[j] < a[j + 1])
		  {
		   c = a[j + 1];
		   a[j + 1] = a[j];
		   a[j] = c;
		  }
		  if (b[j] < b[j + 1])
		  {
		   c = b[j + 1];
		   b[j + 1] = b[j];
		   b[j] = c;
		  }
	   }
	   }
	   c = -1000;
	for (i = 0;i < n;i++)
	{
		d = 0;
	   for (j = i;j < n;j++)
	   {
		   if (a[j] > b[j - i])
		   {
			   d += -1;
		   }

	   else if (a[j] < b[j - i])
	   {
		   d += 1;
	   }
	   }
	   d -= i;
	   c = (d > c)?d:c;

	}
	System.out.printf("%d\n",c * 200);
	}
	}

}

