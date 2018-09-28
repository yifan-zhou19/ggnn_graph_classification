package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int a = 0;
	   int s = 0;
	   int n;
	   int[] sz = new int[100];
	   int[] ss = new int[100];
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
			  ss[i] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  sz[i] = Integer.parseInt(tempVar3);
		  }
		  if (ss[i] >= 90 && ss[i] <= 140 && sz[i] <= 90 && sz[i] >= 60)
		  {
		  a = a + 1;
		  }
		  else
		  {
			  a = 0;
		  }
		  if (a >= s)
		  {
			  s = a;
		  }
	   }
		 System.out.printf("%d",s);
		 return 0;
	}

}

