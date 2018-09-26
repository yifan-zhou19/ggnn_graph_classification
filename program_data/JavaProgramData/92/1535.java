package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int[] ans = new int[1000];
	public static int[] a1 = new int[1000];
	public static int n;
	public static int p;
	public static void change()
	{
		 int i;
		 for (i = 0;i < n - p;i++)
		 {
		   a[i + p] = a1[i];
		 }
		 for (i = 0;i < p;i++)
		 {
		   a[i] = a1[n - i - 1];
		 }
	}
	public static int calc()
	{
		int s;
		int i;
		int j;
	  s = 0;
	  for (i = 0;i < n;i++)
	  {
	  if (a[i] > b[i])
	  {
		  s = s + 200;
	  }
	  else if (a[i] < b[i])
	  {
		  s = s - 200;
	  }
	  }
	  return (s);
	}
	public static void make(int[] a)
	{
		 int i;
		 int j;
		 int k;
		 int p;
		 for (i = 0;i < n - 1;i++)
		 {
			 p = i;
		   for (j = i + 1;j < n;j++)
		   {
		   if (a[j] > a[p])
		   {
			   p = j;
		   }
		   }
		   k = a[i];
		   a[i] = a[p];
		   a[p] = k;
		 }
	}
	public static int Main()
	{

		  int i;
		  int j;
		  int k;
		  int max;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  while (n != 0)
		  {
				for (i = 0;i < n;i++)
				{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
				}
				for (i = 0;i < n;i++)
				{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
				}
				make(a);
				make(b);
				for (i = 0;i < n;i++)
				{
				a1[i] = a[i];
				}
				p = 1;
				while (p < n)
				{
					ans[p] = calc();
				 change();
				 p++;
				}
				max = -200000;
				for (i = 1;i < n;i++)
				{
				if (ans[i] > max)
				{
					max = ans[i];
				}
				}
				System.out.printf("%d\n",max);
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					n = Integer.parseInt(tempVar4);
				}
		  }
	}
}

