package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int a;
		  int b;
		  int p;
		  int q;
		  int k;
		  int i;
		  int[] s = new int[10010];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  p = 500;
		  q = 0;
		  for (i = 0;i < n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b = Integer.parseInt(tempVar3);
		  }
		 if (p > a)
		 {
		 p = a;
		 }
		 if (q < b)
		 {
		 q = b;
		 }
		 for (int j = a;j < b;j++)
		 {
		  s[j] = 5;
		 }
		  }
		k = 0;
		for (i = p;i < q;i++)
		{
	   if (s[i] != 5)
	   {
		k++;
	   }
	   else
	   {
		   k = k;
	   }
		}
	  if (k == 0)
	  {
	 System.out.printf("%d %d\n",p,q);
	  }
	 else
	 {
		 System.out.print("no");
	 }
	 return 0;
	}
}

