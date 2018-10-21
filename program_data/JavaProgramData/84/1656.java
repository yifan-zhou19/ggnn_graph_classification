package <missing>;

public class GlobalMembers
{
	public static int compare(Object a, Object b)
	{
	  return ((int)b - (int)a);
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100];
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		qsort(a,n,(Integer.SIZE / Byte.SIZE),compare);
		for (int i = 0;i <= 1;i++)
		{
			System.out.print(a[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

