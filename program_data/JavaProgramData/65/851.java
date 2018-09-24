package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] sz = new int[2000];
	   int[] cz = new int[2000];
	   int n;
	   int i;
	   int sum = 0;
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
			 sz[i] = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 cz[i] = Integer.parseInt(tempVar3);
		 }
		 if ((sz[i] == 0 && cz[i] == 1) || (sz[i] == 1 && cz[i] == 2) || (sz[i] == 2 && cz[i] == 0))
		 {
		   sum++;
		 }
		 else if ((cz[i] == 0 && sz[i] == 1) || (cz[i] == 1 && sz[i] == 2) || (cz[i] == 2 && sz[i] == 0))
		 {
		   sum--;
		 }
	   }
	   if (sum == 0)
	   {
		System.out.print("Tie");
	   }
	   else if (sum > 0)
	   {
		System.out.print("A");
	   }
	   else if (sum < 0)
	   {
		System.out.print("B");
	   }
	   return 0;
	}
}

