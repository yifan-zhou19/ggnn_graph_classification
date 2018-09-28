package <missing>;

public class GlobalMembers
{
	public static int a(int m,int n)
	{
		int c;
		 if (m == 1 || n == 1 || m == 0)
		 {
			 return 1;
		 }
		 if (m < n)
		 {
			 return a(m, m);
		 }
		 else
		 {
			 return a(m - n, n) + a(m, n - 1);
		 }
	}
	public static int Main()
	{
		int[] m = new int[20];
		int[] n = new int[20];
		int k;
		int c;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}

		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
			c = a(m[i], n[i]);
			System.out.printf("%d\n",c);
		}
	}


}

