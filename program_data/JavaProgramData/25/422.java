package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int num = 0;
	public static int[] a = new int[40];
	public static int[] b = new int[40];
	public static int[] c = new int[40];
	public static void calculate()
	{
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
		for (i = 0;i < 40;i++)
		{
			b[i] = b[i] + (a[i] * 2) % 10;
			b[i + 1] = (a[i] * 2) / 10 + b[i + 1];
		}
		for (i = 0;i < 40;i++)
		{
			a[i] = b[i];
		}





	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int i = 0;
		int l = 0;
		a[0] = 1;
		for (i = 0;i <= n - 1;i++)
		{
	calculate();
		}
		for (i = 39;a[i] == 0;i--)
		{
			l = i;
		}

		for (i = l - 1;i >= 0;i--)
		{
			System.out.print(a[i]);
		}




		 return 0;
	}
}

