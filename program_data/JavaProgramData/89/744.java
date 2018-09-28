package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int[] b = new int[10000];
		int i;
		int j;
		int c;
		int d;
		int u;
		int sum;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
		while (true)
		{
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   c = Integer.parseInt(tempVar2);
			   }
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   d = Integer.parseInt(tempVar3);
			   }
			   if (c == 0 && d == 0)
			   {
							 break;
			   }
			   a[d]++;
			   b[c]++;
		}
		sum = 0;
		for (i = 0;i < n;i++)
		{
						if (a[i] == n - 1 && b[i] == 0)
						{
											  System.out.printf("%d",i);
											  sum++;
						}
		}
		if (sum == 0)
		{
		System.out.print("NOT FOUND");
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			u = Integer.parseInt(tempVar4);
		}
		return 0;
	}


}

