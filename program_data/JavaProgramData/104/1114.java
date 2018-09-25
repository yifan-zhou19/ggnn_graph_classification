package <missing>;

public class GlobalMembers
{
	public static int t;
	public static int m;
	public static int n;
	public static int i;
	public static int j;
	public static int k;
	public static int xx;
	public static int x1;
	public static int x2;
	public static int x;
	public static int y;
	public static int s;
	public static int n0;


	public static void init(int[] a, int[] b)
	{
		freopen("tt.in","r",stdin);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 m = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 n = Integer.parseInt(tempVar2);
		 }
		 for (i = 1;i <= m;i++)
		 {

				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 a[i] = Integer.parseInt(tempVar3);
				 }
		 }
		 for (i = 1;i <= n;i++)
		 {

				 String tempVar4 = ConsoleInput.scanfRead();
				 if (tempVar4 != null)
				 {
					 b[i] = Integer.parseInt(tempVar4);
				 }
		 }

	}

	public static void output(int[] a, int k)
	{
	 int i;
		freopen("tt.out","w",stdout);
		for (i = 1;i <= k;i++)
		{
			if (i == 1)
			{
				System.out.printf("%d",a[i]);
			}
			else
			{
				System.out.printf(" %d",a[i]);
			}
		}
	}
	 public static void proce(int x,int y)
	 {
		if (x == y)
		{
			System.out.printf("%d\n",x);
		}
		else
		{
		if (x > y)
		{
			proce(x / 2, y);
		}
		else
		{
		proce(x, y / 2);
		}
		}



	 }

	public static int Main()
	{
	//freopen("tt.in","r",stdin);
	//freopen("tt.out","w",stdout);
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

		proce(x, y);


	return 0;
	}
}

