package <missing>;

public class GlobalMembers
{
	public static void input(int[] array, int n)
	{
		int i;
	for (i = 0;i <= n - 2;i++)
	{
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 array[i] = Integer.parseInt(tempVar);
	 }
	}
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 array[n - 1] = Integer.parseInt(tempVar2);
	 }
	}
	public static void order(int[] array, int n)
	{
		int i;
		int o;
		int e;
	 for (i = 0;i <= n - 2;i++)
	 {
		for (o = i + 1;o <= n - 1;o++)
		{
		 if (array[i] > array[o])
		 {
			 e = array[i];
			 array[i] = array[o];
			 array[o] = e;
		 }
		}
	 }
	}
	public static void output(int[] array, int n)
	{
		int i;
	for (i = 0;i <= n - 2;i++)
	{
		System.out.printf("%d ",array[i]);
	}
	 System.out.printf("%d",array[n - 1]);
	}
	public static void Main()
	{
		int[] a = new int[20];
		int[] b = new int[20];
		int q;
		int w;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 q = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 w = Integer.parseInt(tempVar2);
	 }
	 input(a, q);
	 input(b, w);
	 order(a, q);
	 order(b, w);
	 output(a, q);
	 System.out.print(" ");
	 output(b, w);
	}

}

