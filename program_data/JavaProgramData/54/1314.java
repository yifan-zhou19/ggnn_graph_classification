package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int k;
		int m = 1;
		int flag = 0;
		int l;
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
	 for (l = 1;;l++)
	 {
		 flag = 0;
	 for (m = l,i = 1;i <= n;i++)
	 {
		 if (m % (n - 1) != 0)
		 {
	  flag = 1;
		 }
	 m = m + m / (n - 1) + k;
	 }
	 if (flag == 0)
	 {
		 break;
	 }
	 }
	 System.out.printf("%d",m);
	}
}

