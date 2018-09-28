package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int b = -1;
	 int i;
	 int j;
	 int t;
	 int m = 0;
	 int[] a = new int[10000];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 3;i <= n;i++)
	 {
		 t = 1;
		for (j = 2;j * j <= i;j++)
		{
		  if (i % j == 0)
		  {
			  t = 0;
			  break;
		  }
		}
		if (t == 1)
		{
			b++;
			a[b] = i;
		}
	 }
	 for (i = 0;i < b;i++)
	 {
	   if (a[i + 1] - a[i] == 2)
	   {
		m = 1;
		System.out.printf("%d %d\n",a[i],a[i + 1]);
	   }
	 }
	 if (m == 0)
	 {
		 System.out.print("empty");
	 }
	}
}

