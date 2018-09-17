package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int j;
		 int d;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 int[] p = new int[n];
		 int[] q = new int[n];
		 for (i = 0;i < n;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 p[i] = Integer.parseInt(tempVar2);
			 }
		 }
		 q[n - 1] = 1;
		 for (i = n - 2;i >= 0;i--)
		 {
			 q[i] = 1;
			 d = 0;
			 for (j = i + 1;j < n;j++)
			 {
				 if (p[i] >= p[j])
				 {
				   if (d < q[j])
				   {
					   d = q[j];
				   }
				 }
			 }
			 q[i] = q[i] + d;
		 }
		 for (i = 0;i < n;i++)
		 {
		 if (d < q[i])
		 {
			 d = q[i];
		 }
		 }
		 System.out.printf("%d\n",d);
	}
}

