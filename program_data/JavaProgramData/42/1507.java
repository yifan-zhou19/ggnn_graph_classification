package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] v = new int[100000];
		int k;
		int p = 0;
		int t = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (int i = 0;i <= n - 1;i++)
	 {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			v[i] = Integer.parseInt(tempVar2);
		}
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 k = Integer.parseInt(tempVar3);
	 }
	 for (int j = 0;j <= n - 1;j++)
	 {
		if (v[j] != k)
		{
			p++;
		}

	 }
	 for (int l = 0;l <= n - 1;l++)
	 {
		 if (v[l] != k)
		 {
		  t++;
	   if (t == p)
	   {
		   System.out.printf("%d",v[l]);
	   }
	   else
	   {
		   System.out.printf("%d ",v[l]);
	   }
		 }

	 }

	 return 0;

	}

}

