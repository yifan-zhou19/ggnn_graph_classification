package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] m = new int[n];
		int[] l = new int[n];
		int[] a = new int[100000];
		int[] b = new int[100000];
		int i;
		for (i = 0;i < 100000;i++)
		{
							 String tempVar2 = ConsoleInput.scanfRead();
							 if (tempVar2 != null)
							 {
								 a[i] = Integer.parseInt(tempVar2);
							 }
							 String tempVar3 = ConsoleInput.scanfRead(" ");
							 if (tempVar3 != null)
							 {
								 b[i] = Integer.parseInt(tempVar3);
							 }
							 if (a[i] == 0 && b[i] == 0)
							 {
								 break;
							 }
		}
		int j;
		int k = 0;
		for (j = 0;j < n;j++)
		{
						m[j] = 0;
						l[j] = 0;
						for (i = 0;i < 100000;i++)
						{
											 if (a[i] == 0 && b[i] == 0)
											 {
												 break;
											 }
											 if (a[i] == j)
											 {
												 m[j]++;
											 }
											 if (b[i] == j)
											 {
												 l[j]++;
											 }
						}
		}
		for (j = 0;j < n;j++)
		{
					   if (m[j] == 0 && l[j] == n - 1)
					   {
						   System.out.printf("%d",j);
						   k = 1;
					   }
		}
		if (k == 0)
		{
		System.out.print("NOT FOUND");
		}
		System.in.read();
		System.in.read();

	}
}

