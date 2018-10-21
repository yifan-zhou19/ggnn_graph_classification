package <missing>;

public class GlobalMembers
{
	public static char pure(int n, int[] a, int topnum, int topcheck)
	{
		 for (int i = 0;i <= topnum;i++)
		 {
			 if (a[i] >= topcheck)
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
		 int empty;
		 empty = 1;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }

		 int[] a = new int[500];
		 int top;
		 int topnum;
		 int topcheck;
		 top = (int)Math.sqrt(n);
		 a[0] = 3;
		 topnum = 0;
		 for (i = 5;i <= top;i = i + 2)
		 {
			 if (topcheck * topcheck <= i)
			 {
				 topcheck++;
			 }
			 if (pure(i, a, topnum, topcheck) != null)
			 {
				topnum++;
				a[topnum] = i;
			 }
		 }

		 topcheck = 2;
		 for (i = 3;i <= n - 2;i = i + 2)
		 {
			 if (topcheck * topcheck <= i)
			 {
				 topcheck++;
			 }
			 if ((pure(i, a, topnum, topcheck) & pure(i + 2, a, topnum, topcheck + 2)) != 0)
			 {
				System.out.printf("%d %d\n",i,i + 2);
				empty = 0;
			 }
		 }
		 if (empty != 0)
		 {
			 System.out.print("empty");
		 }
	}
}

