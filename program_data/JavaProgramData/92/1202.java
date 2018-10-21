package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int vs = new int(int a,int b);
		int[] a = new int[1000];
		int[] b = new int[1000];
		int n;
		int i;
		int max = -1000;
		int j;
		int t;
		int r;
		int s;
		int p = 0;
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
				 max = -1000;
		for (j = 0;j < n;j++)
		{
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 b[j] = Integer.parseInt(tempVar3);
			 }
		}
		for (t = 0;t < n;t++)
		{
			 for (i = n - 1,j = n - 1;i > t,j > t;i--,j--)
			 {
				 if (a[i] > a[i - 1])
				 {
					 s = a[i];
					 a[i] = a[i - 1];
					 a[i - 1] = s;
				 }
				 if (b[j] > b[j - 1])
				 {
					 r = b[j];
					 b[j] = b[j - 1];
					 b[j - 1] = r;
				 }
			 }
		}
	 for (j = 0;j < n;j++)
	 {
			 p = 0;
			 for (i = 0;i < n;i++)
			 {
				 if (i + j < n)
				 {
					 p = vs(a[i], b[i + j]) + p;
				 }
			 else
			 {
				 p = vs(a[i], b[i + j - n]) + p;
			 }
			 }
			 if (p > max)
			 {
				 max = p;
			 }
	 }
	 System.out.printf("%d\n",max * 200);
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 n = Integer.parseInt(tempVar4);
	 }
				 }
	}
	public static int vs(int a,int b)
	{
		int m;
		if (a > b)
		{
			m = 1;
		}
		else if (a == b)
		{
			m = 0;
		}
		else if (a < b)
		{
			m = -1;
		}
		return (m);
	}

}

