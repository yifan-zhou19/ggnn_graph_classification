package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] a = new int[300];
	  int n;
	  int i;
	  int j;
	  int t;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a[0] = Integer.parseInt(tempVar);
	  }
	  for (i = 1;;i++)
	  {
		if (System.in.read() == ',')
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		else
		{
		break;
		}
	  }
	 for (j = 0,t = 0;j < i;j++)
	 {
	  if (a[j] > t)
	  {
	  t = a[j];
	  }
	 }
	for (j = 0,k = 0;j < i;j++)
	{
	   if (a[j] == t)
	   {
	   continue;
	   }
	   else if (a[j] > k)
	   {
	   k = a[j];
	   }
	}
	if (k == 0)
	{
	System.out.print("No");
	}
	else
	{
	System.out.printf("%d",k);
	}
	return 0;
	}


}

