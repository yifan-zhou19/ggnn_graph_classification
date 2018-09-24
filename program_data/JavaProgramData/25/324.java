package <missing>;

public class GlobalMembers
{
	public static int[] ans = new int[1000];
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ans,0,(Integer.SIZE / Byte.SIZE));
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ans[1] = 1;
		ans[0] = 0;
		for (;n > 0;n--)
		{
			for (i = 1;i < 1000;i++)
			{
				ans[i] = ans[i] * 2 + ans[i - 1] / 10;
				ans[i - 1] = ans[i - 1] % 10;
			}
		}
		for (i = 999;ans[i] == 0;i--)
		{
			;
		}
		for (;i > 0;i--)
		{
		System.out.print(ans[i]);
		}
	}

}

