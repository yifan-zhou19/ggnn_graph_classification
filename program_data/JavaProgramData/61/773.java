package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] fb = new int[29];
		  fb[1] = 1;
		  fb[2] = 1;
		  int i;
		  for (i = 3;i < 22;i++)
		  {
			  fb[i] = fb[i - 1] + fb[i - 2];
		  }
		  //for(i=1;i<21;i++)
		  //   printf("%d ",fb[i]);
		  for (;n > 0;n--)
		  {
			  int a;
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a = Integer.parseInt(tempVar2);
			  }
			  System.out.printf("%d\n",fb[a]);
		  }
	}

}

