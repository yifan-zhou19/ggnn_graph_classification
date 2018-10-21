package <missing>;

public class GlobalMembers
{
	public static int su(int i)
	{
		int z = 1;
		for (int k = 2;k <= Math.sqrt(i);k++)
		{
		if (i % k == 0)
		{
		z = 0;
		}
		}
		return z;
	}

	public static int hui(int i)
	{
			 int[] a = new int[100];
			 int j = 0;
			 int p = 1;
			 while (i > 0)
			 {
					 a[j] = i % 10;
					 i = i / 10;
					 j++;
			 }
			 for (int k = 0;k < j / 2;k++)
			 {
					 if (a[k] != a[j - 1 - k])
					 {

									   p = 0;
										break;
					 }
			 }
			 return p;
	}
	public static int Main()
	{
		 int m;
		 int n;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 m = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 n = Integer.parseInt(tempVar2);
		 }
		 int i;
		 int[] b = new int[100];
		 int k = 0;
		 for (i = m;i <= n;i++)
		 {
						   if (su(i) != 0)
						   {
									 if (hui(i) != 0)
									 {
										 b[k] = i;
										 k++;
									 }
						   }
		 }
		 if (k == 0)
		 {
		 System.out.print("no");
		 }
		 else
		 {
			  for (i = 0;i < k - 1;i++)
			  {
			  System.out.printf("%d,",b[i]);
			  }
			  System.out.printf("%d",b[i]);
		 }
			  System.in.read();
			  System.in.read();
			  System.in.read();
	}
}

