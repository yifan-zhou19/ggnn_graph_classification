package <missing>;

public class GlobalMembers
{
	public static char pure(int n, int[] a, int topnum, int topcheck)
	{
		 for (int i = 0;i <= topnum;i++)
		 {
			 if (a[i] == topcheck)
			 {
				 break;
			 }
			 if (n % a[i] == 0)
			 {
				 return 0;
			 }
		 }
		 return 1;
	}

	public static int Main()
	{
		 int n;
		 int i;
		 int j;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 if (n <= 4)
		 {
			 System.out.print("empty");
		 }
		 else
		 {
			 int[] a = new int[1300];
			 int topnum;
			 int topcheck;
			 a[0] = 3;
			 topnum = 0;
			 topcheck = 2;
			 for (i = 5;i <= n;i = i + 2)
			 {
				 if (topcheck * topcheck <= i)
				 {
					 topcheck++;
				 }
				 if (pure(i, a, topnum, topcheck) != null)
				 {
					topnum++;
					a[topnum] = i;
					if (a[topnum] == a[topnum - 1] + 2)
					{
					   System.out.printf("%d %d\n",a[topnum - 1],a[topnum]);
					}
				 }
			 }
		 }
	}

}

