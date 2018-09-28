package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int p = new int(int a,int b);
	 int i;
	 int j;
	 int m;
	 int n;
	 int k;
	 int l;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 l = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < l;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 m = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 n = Integer.parseInt(tempVar3);
		 }
	  k = p(m, n);
	  System.out.printf("%d\n",k);
	 }
	}
	public static int p(int a,int b)
	{
		int k;
	 if (b > 1)
	 {
		 if (a >= b)
		 {
	   k = p(a, b - 1) + p(a - b, b);
		 }
	  else
	  {
		  k = p(a, b - 1);
	  }
	 }
	 if (b == 1)
	 {
		 k = 1;
	 }
	 return (k);
	}

}

