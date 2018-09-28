package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int sum = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int[] sz = new int[100];
	 for (i = 0;i < n;i++)
	 {
	 sz[i] = i + 1;
	 if (sz[i] != 7 && sz[i] % 7 != 0 && sz[i] / 10 != 7 && sz[i] - sz[i] / 10 * 10 != 7)
	 {
	 sum += sz[i] * sz[i];
	 };
	 }
	 System.out.printf("%d\n",sum);
	 return 0;
	}


}

