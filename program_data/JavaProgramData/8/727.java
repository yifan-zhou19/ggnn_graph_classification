package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int p;
		int q;
		int i;
		int num;
		p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[10];
		int[] b = new int[10];
		for (i = 1;i <= p;i++)
		{
						 num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						 a[i] = num;
		}
		for (i = 1;i <= q;i++)
		{
						 b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int pai = new int(int a[],int x);
		pai(a, p);
		pai(b, q);
		for (i = 1;i <= p;i++)
		{
						 System.out.print(a[i]);
						 System.out.print(" ");
		}
		for (i = 1;i <= q - 1;i++)
		{
						   System.out.print(b[i]);
						   System.out.print(" ");
		}
		System.out.print(b[q]);
		return 0;
	}
	public static int pai(int[] a, int x)
	{
		int i;
		int j;
		int m;
		for (i = 1;i <= x - 1;i++)
		{
						   for (j = 1;j <= x - i;j++)
						   {
											  if (a[j] > a[j + 1])
											  {
															 m = a[j + 1];
															 a[j + 1] = a[j];
															 a[j] = m;
											  }
						   }
		}
		return a[x];
	}
}

