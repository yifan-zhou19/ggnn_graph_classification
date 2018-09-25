package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] x = new int[1001];
	   int[] y = new int[1001];
	   int[] f = new int[1001];
	   int i;
	   int j;
	   int n;
	   int ans;
	   char ch;


	   i = 1;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   x[1] = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(null, 1);
	   if (tempVar2 != null)
	   {
		   ch = tempVar2.charAt(0);
	   }
	   while (ch == ',')
	   {
		  i++;
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  x[i] = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead(null, 1);
		  if (tempVar4 != null)
		  {
			  ch = tempVar4.charAt(0);
		  }
	   }

	   n = i;
	   System.out.printf("%d ",n);
	   i = 1;
	   String tempVar5 = ConsoleInput.scanfRead();
	   if (tempVar5 != null)
	   {
		   y[1] = Integer.parseInt(tempVar5);
	   }
	   String tempVar6 = ConsoleInput.scanfRead(null, 1);
	   if (tempVar6 != null)
	   {
		   ch = tempVar6.charAt(0);
	   }
	   while (ch == ',')
	   {
		  i++;
		  String tempVar7 = ConsoleInput.scanfRead();
		  if (tempVar7 != null)
		  {
			  y[i] = Integer.parseInt(tempVar7);
		  }
		  String tempVar8 = ConsoleInput.scanfRead(null, 1);
		  if (tempVar8 != null)
		  {
			  ch = tempVar8.charAt(0);
		  }
	   }

	   for (i = 0;i <= 1000;i++)
	   {
		  f[i] = 0;
	   }

	   for (i = 1;i <= n;i++)
	   {
		  for (j = x[i];j < y[i];j++)
		  {
			 f[j]++;
		  }
	   }
	   ans = 0;
	   for (i = 0;i <= 1000;i++)
	   {
		 if (f[i] > ans)
		 {
		   ans = f[i];
		 }
	   }
	   System.out.printf("%d",ans);

	   return 0;
	}

}

