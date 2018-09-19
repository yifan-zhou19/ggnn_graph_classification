package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int x;
	 int[] a = new int[100];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 x = Integer.parseInt(tempVar2);
	 }
	 System.out.printf("%d",x);
	 a[x] = 1;
	 for (i = 2;i <= n;i++)
	 {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x = Integer.parseInt(tempVar3);
			}
		 if (a[x] == 0)
		 {
		 System.out.printf(" %d",x);
		 a[x] = 1;
		 }
	 }
	 return 0;
	}


}

