package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[200];
		int[] f = new int[200];
		int n;
		int[] m = new int[200];
		int i;
		int j;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			 for (j = 1;j <= 199;j++)
			 {
				 s[j] = 1;
			 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			 memset(f,0,(Integer.SIZE / Byte.SIZE));
			 count = 0;
			 m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 for (j = 1;j <= m[i];j++)
			 {
				 f[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				 s[f[j] - 2 + 3 * j] = 0;
				 s[f[j] - 1 + 3 * j] = 0;
				 s[f[j] + 3 * j] = 0;
			 }
			 for (j = 1;j <= 60;j++)
			 {
				 count = count + s[j];
			 }
			 System.out.print(count);
			 System.out.print("\n");
		}
		return 0;
	}

}

