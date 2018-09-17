package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  b = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  c = Integer.parseInt(tempVar3);
		  }
		  int[] f = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		  int i;
		  int k;
		  if (a % 100 == 0 && a % 400 == 0)
		  {
			 f[1] = 29;
		  for (i = 0,k = 0;b != i + 1;i++)
		  {
		  k = k + f[i];
		  }
		  System.out.printf("%d",k + c);
		  }
		  else if (a % 100 != 0 && a % 4 == 0)
		  {
			  f[1] = 29;
		  for (i = 0,k = 0;b != i + 1;i++)
		  {
		  k = k + f[i];
		  }
		  System.out.printf("%d",k + c);
		  }
		   else
		   {
			   for (i = 0,k = 0;b != i + 1;i++)
			   {
		  k = k + f[i];
			   }
		  System.out.printf("%d",k + c);
		   }

	}

}

