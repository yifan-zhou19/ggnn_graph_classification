package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int k;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 k = Integer.parseInt(tempVar);
		 }
		 int[] p = new int[k];
		 int[] q = new int[k];
		 int i;
		 int j;
		 int t;
		 for (i = 0;i < k;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 p[i] = Integer.parseInt(tempVar2);
			 }
			 q[i] = 1;
		 }
		 for (i = 0;i < k;i++)
		 {
		 for (j = 0;j < i;j++)
		 {
			 t = 0;
			 if (p[j] >= p[i])
			 {
							t = q[j] + 1;
							if (t >= q[i])
							{
									   q[i] = t;
							}
			 }
		 }
		 }
		 int max = 0;
		 for (i = 0;i < k;i++)
		 {
			 if (q[i] > max)
			 {
				 max = q[i];
			 }
		 }
		 System.out.printf("%d",max);
	}
}

