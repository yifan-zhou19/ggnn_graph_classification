package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int[] a = new int[10000];
	  int[] b = new int[10000];
	  int i;
	  int k;
	  int[] num = new int[50000];
	  int t = 0;
	  int min;
	  int r;
	  int max;
	  int c;
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
	  }
	  for (i = 0;i < n;i++)
	  {
		for (k = a[i];k <= b[i];k++)
		{
		  num[t] = k;
		  t++;
		}
	  }
	  min = a[1];
	  max = a[1];
	  for (r = 0;r < t;r++)
	  {
		if (num[r] < min)
		{
		  min = num[r];
		}
	  }
	  for (r = 0;r < t;r++)
	  {
		if (num[r] > max)
		{
		  max = num[r];
		}
	  }
	  for (r = min;r <= max;r++)
	  {
		for (i = 0;i < t;i++)
		{
		  if (num[i] == r)
		  {
			c = 1;
			break;
		  }
		  else
		  {
			c = 0;
		  }
		}
		 if (c == 1)
		 {
		  continue;
		 }
		 else
		 {
		  break;
		 }
	  }
	   if (c == 1)
	   {
		for (r = min;r < max;r++)
		{
		for (i = 0;i < t;i++)
		{
		  if ((r >= a[i]) && (r + 1 <= b[i]))
		  {
		   c = 1;
		   break;
		  }
		  else
		  {
		   c = 0;
		  }
		}
		 if (c == 1)
		 {
		 continue;
		 }
		 else
		 {
		 break;
		 }
		}
	   }

	   if (c == 0)
	   {
		 System.out.print("no");
	   }
	   else
	   {
		 System.out.printf("%d %d",min,max);
	   }
	   return 0;
	}


}

