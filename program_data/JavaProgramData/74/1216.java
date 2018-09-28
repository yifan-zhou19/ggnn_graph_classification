package <missing>;

public class GlobalMembers
{
	public static int po(int k)
	{
		int t = 1;
		int i;
		for (i = 1;i <= k;i++)
		{
						 t = t * 10;
		}
		return t;
	}
	public static int su(int a)
	{
		int i;
		int t = 1;
		for (i = 2;i <= Math.sqrt(a);i++)
		{
							   if (a % i == 0)
							   {
										 t = 0;
										 break;
							   }
		}
		return t;
	}
	public static int hui(int a)
	{
		int[] b = new int[100];
		int i;
		int l;
		int t = 1;
		int k;
		for (i = 1;i < 100;i++)
		{
						  t = t * 10;
						  if (a < t)
						  {
						  break;
						  }
		}
		l = i;
		for (i = 0,k = l;i < l;i++)
		{
							   b[i] = a / po(k - 1);
							   a = a % po(k - 1);
							   k--;
		}
		for (i = 0;i < l / 2 + 1;i++)
		{
					   if (b[i] != b[l - i - 1])
					   {
										 return 0;
										 break;
					   }
					   if (i == l / 2)
					   {
					   return 1;
					   }
		}
	}
	public static int Main()
	{
		  int m;
		  int n;
		  int i;
		  int j;
		  int k = 0;
		  int t = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  n = Integer.parseInt(tempVar2);
		  }
		  for (i = m;i <= n;i++)
		  {
						   if (su(i) == 1 && hui(i) == 1)
						   {
												  if (k == 0)
												  {
														  System.out.printf("%d",i);
														  k++;
												  }
												  else
												  {
												  System.out.printf(",%d",i);
												  }
												  t++;
						   }
		  }
		  if (t == 0)
		  {
		  System.out.print("no");
		  }
		  System.in.read();
		  System.in.read();
	}


}

