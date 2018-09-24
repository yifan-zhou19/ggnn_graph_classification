package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int[] b = new int[10000];
		int n;
		int i = 3;
		int j = 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
		b[1] = 1;
		b[2] = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1;j <= n;j++)
		{
			a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 3;i <= 10000;i++)
		{
			b[i] = b[i - 1] + b[i - 2];
		}
		for (j = 1;j <= n;j++)
		{
			System.out.print(b[a[j]]);
			System.out.print("\n");
		}
		return 0;
	}





}

