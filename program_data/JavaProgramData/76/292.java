package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int m;
	  int p;
	  int k;
	  int l;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] a = new int[30];
	  int[] b = new int[30];
	  for (i = 0;i < n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
	  }
	  for (i = 0;i < n;i++)
	  {
		for (j = 0;j < n - 1;j++)
		{
		   if (a[j] > a[j + 1])
		   {
			 m = a[j];
			 p = b[j];
			 a[j] = a[j + 1];
			 b[j] = b[j + 1];
			 a[j + 1] = m;
			 b[j + 1] = p;
		   }
			if (a[j] <= a[j + 1])
			{
			  a[j] = a[j];
			  b[j] = b[j];
			  a[j + 1] = a[j + 1];
			  b[j + 1] = b[j + 1];
			}
		}
	  }
		k = a[0];
		l = b[0];
		for (i = 0;i < n - 1;i++)
		{
		   if (b[i] >= a[i + 1] != 0 && b[i] <= b[i + 1])
		   {
				k = a[i];
				l = b[i + 1];
		   }
		   if (b[i] > b[i + 1])
		   {
				k = a[i];
				l = b[i];
		   }
			if (l < a[i + 1])
			{
				k = 0;
				l = 0;
				break;
			}
		}
			 if (k == 0 && l == 0)
			 {
				 System.out.print("no");
			 }
			 if (k != 0 || l != 0)
			 {
				  System.out.printf("%d %d", a[0],l);
			 }
		  return 0;
	}

}

