package <missing>;

public class GlobalMembers
{
	public static int kkkk(int a,int b)
	{
		 int k;
		 if (b == 1)
		 {
			 k = 1;
		 }
		 else if (a == 1)
		 {
			 k = 1;
		 }
		 else if (a <= b)
		 {
			 k = 1 + kkkk(a, a - 1);
		 }
		 else
		 {
			 k = kkkk(a - b, b) + kkkk(a, b - 1);
		 }
		 return k;
	}

	public static int Main()
	{
		  int i;
		  int n;
		  int[] a = new int[20];
		  int[] b = new int[20];
		  int k;
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
				  a[i] = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  b[i] = Integer.parseInt(tempVar3);
			  }
		  }
		  for (i = 0;i < n;i++)
		  {
			  k = kkkk(a[i], b[i]);
			  System.out.printf("%d\n",k);
		  }
	}
}

