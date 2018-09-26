package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] n = new int[300];
	   int[] m = new int[300];
	   int i;
	   int j;
	   for (i = 0;;i++)
	   {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n[i] = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  m[i] = Integer.parseInt(tempVar2);
		  }
		  if (n[i] == 0)
		  {
			 break;
		  }
		  else
		  {
			 int[] f = new int[300];
			 f[1] = 0;
			 for (j = 1;j <= n[i];j++)
			 {
				f[j + 1] = (f[j] + m[i]) % (j + 1);
			 }
			 System.out.printf("%d\n",f[n[i]] + 1);
		  }
	   }
	   return 0;
	}
}

