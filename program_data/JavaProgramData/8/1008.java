package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[50];
	public static int[] b = new int[50];
	public static int[] c = new int[100];
	public static int m = 0;
	public static int n = 0;
	public static int temp;
	public static void IN()
	{
		int i;
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
	void | ();
	public static void LIAN()
	{
		int i;
		for (i = m;i < m + n;i++)
		{
			c[i] = b[i - m];
		}
		for (i = 0;i < m;i++)
		{
			c[i] = a[i];
		}
	}
	public static void OU()
	{
		int i;
		for (i = 0;i < m + n - 1;i++)
		{
			System.out.printf("%d ",c[i]);
		}
		System.out.printf("%d",c[m + n - 1]);
	}
	public static void Main()
	{
	  IN();
	  |();
	  LIAN();
	  OU();
	}
	public static void | ()
	{
		int i;
		int j;
	 for (i = 0;i < m - 1;i++)
	 {
		 for (j = 0;j < m - 1 - i;j++)
		 {
			 if (a[j] > a[j + 1])
			 {
			   temp = a[j];
			   a[j] = a[j + 1];
			   a[j + 1] = temp;
			 }
		 }
	 }
	 for (i = 0;i < n - 1;i++)
	 {
		  for (j = 0;j < n - 1 - i;j++)
		  {
			 if (b[j] > b[j + 1])
			 {
			   temp = b[j];
			   b[j] = b[j + 1];
			   b[j + 1] = temp;
			 }
		  }
	 }
	}
}

