package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int k;
		 int i;
		 int j;
		 int a = 0;
		 int[] dk = new int[1000];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 k = Integer.parseInt(tempVar2);
		 }
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   (dk[0]) = Integer.parseInt(tempVar3);
			   }
		 for (i = 1;i < n;i++)
		 {
			 String tempVar4 = ConsoleInput.scanfRead(" ");
			 if (tempVar4 != null)
			 {
				 (dk[i]) = Integer.parseInt(tempVar4);
			 }
		 }
		 for (i = 0;i < n - 1;i++)
		 {
			 for (j = i + 1;j < n;j++)
			 {
				 if (dk[i] + dk[j] == k)
				 {
					 System.out.print("yes");
					 return 0;
				 }
			 }
			 a += 1;
		 }
		 if (a == n - 1)
		 {
			 System.out.print("no");
		 }
		return 0;

	}


}

