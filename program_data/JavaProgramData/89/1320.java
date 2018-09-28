package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10000];
	public static int[] b = new int[10000];
	public static int Main()
	{
		int l;
		int r;
		int i;
		int j;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,n);
		while ((l = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (r != 0 && (l != 0 || r != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			b[l] = 1;
			a[r]++;
		}
		for (i = 0;i < n;i++)
		{
						if (b[i] == 1 || a[i] < n - 1)
						{
							continue;
						}
						else
						{
							break;
						}
		}
		if (i >= n)
		{
			System.out.print("NO FOUND");
			System.out.print("\n");
		}
		else
		{
			System.out.print(i);
			System.out.print("\n");
		}
	}

}

