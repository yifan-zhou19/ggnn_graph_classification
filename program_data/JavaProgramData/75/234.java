package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[1000];
	 int i;
	 int j;
	 int[] b = new int[1000];
	 int n;
	 int min = 2000;
	 int max = 0;
	 int ren = 0;
	 int r;
	 char c;
	 for (i = 0;;)
	 {
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a[i] = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(null, 1);
	   if (tempVar2 != null)
	   {
		   c = tempVar2.charAt(0);
	   }
	   if (c == ',')
	   {
		   n = i;
		   i++;
	   }
		else
		{
			break;
		}
	 }
	 n = n + 2;
	 for (i = 0;;)
	 {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   b[i] = Integer.parseInt(tempVar3);
	   }
	   String tempVar4 = ConsoleInput.scanfRead(null, 1);
	   if (tempVar4 != null)
	   {
		   c = tempVar4.charAt(0);
	   }
	   if (c == ',')
	   {
		   i++;
	   }
		else
		{
			break;
		}
	 }
	 for (i = 0;i < n;i++)
	 {
	  if (a[i] < min)
	  {
		  min = a[i];
	  }
	  if (b[i] > max)
	  {
		  max = b[i];
	  }
	 }
	 for (i = min;i <= max;i++)
	 {
	  r = 0;
	  for (j = 0;j < n;j++)
	  {
	   if (a[j] <= i != 0 && b[j]> i)
	   {
		   r++;
	   }
	  }
	  if (r > ren)
	  {
		  ren = r;
	  }
	 }
	 System.out.printf("%d %d",n,ren);
	 return 0;
	}

}

