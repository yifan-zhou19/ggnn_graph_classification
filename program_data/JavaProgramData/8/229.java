package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static void Main()
	{
		void f1();
		void f2(int s[],int k);
		void f3(int p[],int t);
			 void f4(int p[],int t);
		f1();
	f2(a, m);
	f2(b, n);
	f3(a, m);
	f4(b, n);

	}

	public static void f1()
	{
		int i;
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
	for (i = 0;i < m;i++)
	{
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  a[i] = Integer.parseInt(tempVar3);
	  }
	}
	for (i = 0;i < n;i++)
	{
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  b[i] = Integer.parseInt(tempVar4);
	  }
	}

	}

	public static void f2(int[] s, int k)
	{

	int i;
	int j;
	int t;
	for (j = 0;j < k - 1;j++)
	{
	  for (i = 0;i < k - 1 - j;i++)
	  {
		  if (s[i] > s[i + 1])
		  {
			  t = s[i];
		  s[i] = s[i + 1];
		  s[i + 1] = t;
		  }
	  }
	}

	}

	public static void f3(int[] p, int t)
	{
	int i;
	int j;
	for (i = 0;i < t;i++)
	{
	 System.out.printf("%d ",p[i]);
	}
	}

	public static void f4(int[] p, int t)
	{
	int i;
	int j;
	for (i = 0;i < t - 1;i++)
	{
	  System.out.printf("%d ",p[i]);
	}
	System.out.printf("%d",p[t - 1]);



	}
}

