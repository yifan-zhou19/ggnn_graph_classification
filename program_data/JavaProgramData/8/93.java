package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[999];
		int[] b = new int[999];
		int[] c = new int[999];
		int m;
		int n;
		int i;
		int s;

		void read(int arr_1[],int arr_2[],int x,int y);
		void f(int arr_1[],int arr_2[],int x,int y);
		void combine(int arr_1[],int arr_2[],int arr_3[],int x,int y);
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
		 read(a, b, m, n);
		 f(a, b, m, n);
		 combine(a, b, c, m, n);
		s = m + n;
		for (i = 0;i < s;i++)
		{
			if (i < s - 1)
			{
		System.out.printf("%d ",c[i]);
			}
		else
		{
		 System.out.printf("%d\n",c[i]);
		}
		}
	}

		public static void read(int[] arr_1, int[] arr_2, int x, int y)
		{
			int i;
			int j;
		 for (i = 0;i <= x - 1;i++)
		 {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 arr_1[i] = Integer.parseInt(tempVar);
		 }
		 }
		 for (j = 0;j <= y - 1;j++)
		 {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				arr_2[j] = Integer.parseInt(tempVar2);
			}
		 }
		}

		  public static void f(int[] arr_1, int[] arr_2, int x, int y)
		  {
		   int i;
		   int j;
		   int t;
		 for (j = 0;j < x - 1;j++)
		 {
		   for (i = 0;i < x - j - 1;i++)
		   {
		   if (arr_1[i] > arr_1[i + 1])
		   {
		   t = arr_1[i];
		   arr_1[i] = arr_1[i + 1];
		   arr_1[i + 1] = t;
		   }
		   }
		 }

		 for (j = 0;j < y - 1;j++)
		 {
		   for (i = 0;i < y - j - 1;i++)
		   {
		   if (arr_2[i] > arr_2[i + 1])
		   {
		   t = arr_2[i];
		   arr_2[i] = arr_2[i + 1];
		   arr_2[i + 1] = t;
		   }
		   }
		 }
		  }

		public static void combine(int[] arr_1, int[] arr_2, int[] arr_3, int x, int y)
		{
			int k;
			 for (k = 0;k <= x - 1;k++)
			 {
			arr_3[k] = arr_1[k];
			 }
		   for (k = x;k <= x + y - 1;k++)
		   {
		   arr_3[k] = arr_2[k - x];
		   }
		}
}

