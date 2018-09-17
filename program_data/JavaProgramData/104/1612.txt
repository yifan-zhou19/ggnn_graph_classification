package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int x;
		int y;
		int[] a = new int[1000];
		int[] b = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		a[0] = 0;
		b[0] = 1;
		for (i = 1;;i++)
		{
					 a[i] = x;
					 x = x / 2;
					 if (a[i] == 1)
					 {
						 break;
					 }
		}
		m = i;
		for (i = 1;;i++)
		{
					 b[i] = y;
					 y = y / 2;
					 if (b[i] == 1)
					 {
						 break;
					 }
		}
		n = i;
		for (i = m,j = n;;i--,j--)
		{
							 if (a[i] == b[j] && a[i - 1] != b[j - 1])
							 {
														   System.out.printf("%d",a[i]);
														   break;
							 }
		}
		 return 0;
	}
}

