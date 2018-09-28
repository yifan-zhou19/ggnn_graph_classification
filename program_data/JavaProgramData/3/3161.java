package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int k;
	 int i;
	 int m;
	 int x;
	 int y = 0;
	 int p;
	 int[] sz = new int[1000];
	 int[] s = new int[1000];
	 int[] z = new int[1000000];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 k = Integer.parseInt(tempVar2);
	 }
	 for (i = 0;i < n;i++)
	 {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 (sz[i]) = Integer.parseInt(tempVar3);
		 }
	 }
	 for (i = 0;i < n;i++)
	 {
		 s[i] = sz[i];
	 }
	 p = 0;
	 for (m = 0;m < n;m++)
	 {
		 for (x = m + 1;x < n;x++)
		 {
				 z[p] = sz[m] + s[x];
				 p++;

		 }
	 }
	 for (i = 0;i < n * (n - 1) / 2;i++)
	 {
		 if (z[i] == k)
		 {
			 y = y + 1;
		 }
	 }
	 if (y != 0)
	 {
		 System.out.print("yes");
	 }
	 else if (y == 0)
	 {
		 System.out.print("no");
	 }
	 return 0;

	}


}

