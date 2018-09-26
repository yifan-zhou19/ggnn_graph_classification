package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int high;
		int low;
		int[] a = new int[100];
		int d = 0;
		int num;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		for (int i = 1;i <= n;i++)
		{
			high = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			low = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((high <= 140) && (high >= 90) && (low >= 60) && (low <= 90))
			{
				a[d] = a[d] + 1;
			}
			else
			{
				d = d + 1;
			}
		}
		for (int i = 0;i < 99;i++)
		{
			if (a[i] > a[i + 1])
			{
				num = a[i];
				a[i] = a[i + 1];
				a[i + 1] = num;
			}
		}
		System.out.print(a[99]);
		System.out.print("\n");

		return 0;
	}
}

