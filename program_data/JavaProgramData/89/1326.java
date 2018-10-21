package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int k;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] p = new int[n];
		int[] q = new int[n];
		for (i = 0;i <= n;i++)
		{
		p[i] = q[i] = 0;
		}
		for (k = 0;;k++)
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
					 if ((i == 0) && (j == 0))
					 {
						 break;
					 }
					 p[i] = p[i] + 1;
					 q[j] = q[j] + 1;
		}
		for (i = 0;i <= n;i++)
		{
						 if ((p[i] == 0) && (q[i] == n - 1))
						 {
												 System.out.printf("%d",i);
												 t = t + 1;
						 }
		}
		if (t == 0)
		{
		System.out.print("NOT FOUND");
		}
	}


}

