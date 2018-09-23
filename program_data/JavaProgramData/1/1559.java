package <missing>;

public class GlobalMembers
{
	public static int p = 0;
	public static int q = 2;
	public static int jizu(int x)
	{

	  for (int i = q;i <= x - 1;i++)
	  {
		 if ((x % i == 0) && (x / i > i))
		 {
			p++;
			q = i;
			jizu(x / i);

		 }
		  else if ((x % i == 0) && (x / i == i))
		  {
			 p++;
		  }
	  }
	  return p;
	}
	public static int Main()
	{
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] a = new int[100];
	  for (int i = 0;i <= n - 1;i++)
	  {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
	  }
	  for (int i = 0;i <= n - 1;i++)
	  {
		System.out.printf("%d\n",jizu(a[i]) + 1);
		 p = 0,q = 2;
	  }
	 int y;
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 y = Integer.parseInt(tempVar3);
	 }

	}

}

