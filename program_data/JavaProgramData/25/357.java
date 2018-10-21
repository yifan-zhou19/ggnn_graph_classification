package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10000];
	public static int[] b = new int[10000];
	public static int[] c = new int[10000];
	public static int[] ans = new int[10000];

	public static void cheng(int[] a)
	{
		int i;
		int j;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Integer.SIZE / Byte.SIZE));
		for (i = 1;i <= a[0];i++)
		{
			c[i] = c[i] + a[i] * 2;
			c[i + 1] = c[i + 1] + c[i] / 10;
			c[i] = c[i] % 10;
		}
		j = a[0] + 10;
		while (j > 0 && c[j] == 0)
		{
			j--;
		}
		a[0] = j;
		for (i = 1;i <= j;i++)
		{
			a[i] = c[i];
		}
	}

	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ans,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		ans[0] = 1;
		ans[1] = 1;
		for (i = 1;i <= k;i++)
		{
			cheng(ans);
		}
		for (i = ans[0];i > 0;i--)
		{
			System.out.print(ans[i]);
		}
		return 0;
	}


}

