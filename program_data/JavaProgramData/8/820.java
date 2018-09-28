package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[100];
	public static int m;
	public static int n;
	public static int i;
	public static int j;
	public static int k;
	public static int xx;
	public static void sort(int[] a, int n)
	{
		int i;
		int j;
		int t;
		for (i = 1;i <= n - 1;i++)
		{
			for (j = 1;j <= n - i;j++)
			{
				if (a[j] > a[j + 1])
				{
				t = a[j];
				a[j] = a[j + 1];
				a[j + 1] = t;
				}
			}
		}
	}
	public static void merge(int[] a, int[] b, int m, int n)
	{
		int i;
		for (i = 1;i <= n;i++)
		{
			a[m + i] = b[i];
		}
	}

	public static void init(int[] a, int[] b)
	{ //freopen("tt.in","r",stdin);
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
		//freopen("tt.out","w",stdout);
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
	public static int Main()
	{
	init(a, b);
	sort(a, m);
	sort(b, n);
	merge(a, b, m, n);
	output(a, m + n);

	return 0;
	}
}

