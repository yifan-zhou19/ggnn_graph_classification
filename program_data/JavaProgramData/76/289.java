package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] zuo = new int[50000];
	  int[] you = new int[50000];
	  int n;
	  int i;
	  int j;
	  int a;
	  int b;
	  double q;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  zuo[0] = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  you[0] = Integer.parseInt(tempVar3);
	  }
	  a = zuo[0];
	  b = you[0];
	  for (i = 1;i < n;i++)
	  {
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   zuo[i] = Integer.parseInt(tempVar4);
		   }
		   String tempVar5 = ConsoleInput.scanfRead();
		   if (tempVar5 != null)
		   {
			   you[i] = Integer.parseInt(tempVar5);
		   }
		   if (a > zuo[i])
		   {
			   a = zuo[i];
		   }
		   if (b < you[i])
		   {
			   b = you[i];
		   }
	  }
	   for (q = a + 0.1;q < b;q++)
	   {
		  for (j = 0;j < n;j++)
		  {
		if (zuo[j] < q && you[j]> q)
		{
			break;
		}
		  }
	if (j == n)
	{
		System.out.print("no");
		return 0;
	}
	   }
		 System.out.printf("%d %d",a,b);
	   return 0;
	}
}

