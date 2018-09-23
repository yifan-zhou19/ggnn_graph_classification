package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[200000];
		int i;
		int[] b = new int[200000];
		int j = 1;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a[i] = Integer.parseInt(tempVar2);
						 }
						 b[j] = a[i];
						 j++;
		}
						 System.out.printf("%d",b[1]);
		for (j = 2;j <= n;j++)
		{
						 d = 0;
						 for (i = 1;i <= j - 1;i++)
						 {
										  if (b[j] == a[i])
										  {
											  d++;
										  }
						 }
						 if (d == 0)
						 {
						 System.out.printf(" %d",b[j]);
						 }
		}
		System.in.read();
		System.in.read();
		System.in.read();
	}
}

