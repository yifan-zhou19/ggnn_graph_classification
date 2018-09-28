package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[300000];
	public static int[] knowedBy = new int[300000];
	public static int[] flag = new int[300000];
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(knowedBy, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(flag, 0, (Integer.SIZE / Byte.SIZE));
		int i;
		int j;
		int k;
		while ((j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if ((j == 0) && (k == 0))
			{
				break;
			}
			flag[j] = -1;
			knowedBy[k]++;
		}
		int t = 0;
		for (i = 0; i < n; i++)
		{
			if ((knowedBy[i] == n - 1) && (flag[i] == 0))
			{
				System.out.print(i);
				System.out.print("\n");
				t = 1;
				break;
			}
		}
		if (t == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

