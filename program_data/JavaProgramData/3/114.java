package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	   int i;
	   int j;
	   int n;
	   int k;
	   int b;
	   int judge = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   k = Integer.parseInt(tempVar2);
	   }
	   int[] a = new int[1001];
	   for (i = 1;i < n + 1;i++)
	   {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   a[i] = Integer.parseInt(tempVar3);
		   }
	   }
	   for (i = 1;i < n + 1;i++)
	   {
		   for (j = 1;j < n + 1;j++)
		   {
			   if (i != j)
			   {
				   b = a[i] + a[j];
				   if (b == k)
				   {
					   System.out.print("yes");
					   judge = 1;
					   break;
				   }
			   }
		   }
	   if (judge == 1)
	   {
		   break;
	   }

	   if (i == n)
	   {
		   System.out.print("no");
	   }


	   }
	}
}

