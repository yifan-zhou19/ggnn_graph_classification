package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[3000];
		int[] b = new int[3000];
		int[] c = new int[3000];
		int x = 0;
		int i;
		int j;
		int s;
		for (j = 0;j < 3000;j++)
		{
			 s = 0;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a[j] = Integer.parseInt(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   b[j] = Integer.parseInt(tempVar2);
		   }
		  if (a[j] == 0)
		  {
			  break;
		  }
		   else
		   {
			 for (i = 2; i <= a[j]; i++)
			 {
				 s = (s + b[j]) % i;
			 }
			   x++;
			   c[j] = s + 1;
		   }
		}
		  for (j = 0;j < x;j++)
		  {
			 System.out.printf("%d\n",c[j]);
		  }
		   return 0;
	}

}

