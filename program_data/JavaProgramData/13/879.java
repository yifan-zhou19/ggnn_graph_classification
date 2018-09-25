package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[20001];
		int x = 0;
		int t;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
			  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  System.out.print(m);
			  a[m] = 1;
		for (i = 2;i <= n;i++)
		{
			t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a[t] != 1)
		{
			System.out.print(" ");
			System.out.print(t);
			a[t] = 1;
		}
		}
		return 0;
	}

}

