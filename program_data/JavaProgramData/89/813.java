package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int q;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		for (k = 0;k < n;k++)
		{
						a[k] = 0;
						b[k] = 0;
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
					 if (i == 0 && j == 0)
					 {
						 break;
					 }
					 a[i] += 1;
					 b[j] += 1;
		}
		for (k = 0;k < n;k++)
		{
						if (b[k] == n - 1 && a[k] == 0)
						{
											  System.out.printf("%d",k);
											  s += 1;
						}
		}
		if (s == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}

}

