package <missing>;

public class GlobalMembers
{
	public static void sort(int[] a, int n)
	{
	 int i;
	 int j;
	 int index;
	 int temp;

	 for (i = 0;i < n - 1;i++)
	 {

	  index = i;
	  for (j = i + 1;j < n;j++)
	  {
	   if (a[index] > a[j])
	   {
		index = j;
	   }
	  }
			temp = a[i];
	  a[i] = a[index];
	  a[index] = temp;
	 }
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[] a = new int[100];
		int[] b = new int[100];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < m; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		sort(a, m);
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[j] = Integer.parseInt(tempVar2);
			}
		}
		sort(b, n);
		for (i = 0;i < m;i++)
		{
		System.out.print(a[i]);
		System.out.print(" ");
		}
		for (j = 0;j < n - 1;j++)
		{
		System.out.print(b[j]);
		System.out.print(" ");
		}
		System.out.print(b[n - 1]);
		return 0;
	}

}

