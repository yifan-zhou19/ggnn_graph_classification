package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] X = new int[n];
		for (int h = 0;h < n;h++)
		{
				X[h] = h;
		}
				 int i;
				 int j;
		 for (;i != 0 || j != 0;)
		 {

				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 i = Integer.parseInt(tempVar2);
				 }
				 String tempVar3 = ConsoleInput.scanfRead(" ");
				 if (tempVar3 != null)
				 {
					 j = Integer.parseInt(tempVar3);
				 }
				 X[j] = X[j] + 1;
		 }
		 for (int t = 0;t < n;t++)
		 {
				 if ((X[t] - t) >= (n - 1))
				 {
					System.out.printf("%d",t);
					s++;
				 }
		 }
		   if (s == 0)
		   {
			   System.out.print("NOT FOUND");
		   }

	}

}

