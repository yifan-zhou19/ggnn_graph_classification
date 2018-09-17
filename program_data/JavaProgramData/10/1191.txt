package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int max;
		int n;
		int[] a = new int[30];
		int[] b = new int[30];
		b[0] = 1;
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
							 a[i] = Integer.parseInt(tempVar2);
						 }
						 j = i - 1;
						 max = 0;
						 while (j >= 0)
						 {
								   if (a[i] <= a[j] != 0 && max < b[j] + 1)
								   {
								   max = b[j];
								   }
								   j--;
						 }
						 b[i] = max + 1;
		}
		max = 0;
		for (i = 0;i < n;i++)
		{
		 if (max < b[i])
		 {
		 max = b[i];
		 }
		}
		System.out.printf("%d",max);
		System.in.read();
	}

}

