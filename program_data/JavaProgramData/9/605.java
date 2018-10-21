package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int[] y = new int[200];
	   int[] p = new int[200];
	   char[][] a = new char[100][11];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < 200;i++)
	   {
		p[i] = 200 - i;
	   }
	   for (i = 0;i < n;i++)
	   {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y[i] = Integer.parseInt(tempVar3);
		}
	   }
	  for (i = 0;i <= 140;i++)
	  {
		for (j = 0;j < n;j++)
		{
		   if (y[j] == p[i])
		   {
		   System.out.printf("%s\n",a[j]);
		   }
		}
	  }
	  for (i = 0;i < n;i++)
	  {
	  if (y[i] < 60)
	  {
	  System.out.printf("%s\n",a[i]);
	  }
	  }
	  System.in.read();
	  System.in.read();
	}
}

