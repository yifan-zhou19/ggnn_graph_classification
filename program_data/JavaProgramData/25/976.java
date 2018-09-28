package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int w;
		int[] s = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(s,0,(Integer.SIZE / Byte.SIZE));
		w = 1;
		s[1] = 1;
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= w;j++)
			{
				s[j] *= 2;
			}
			for (int j = 1;j <= w;j++)
			{
				s[j + 1] = s[j + 1] + s[j] / 10;
				s[j] = s[j] % 10;
			}
			if (s[w + 1] > 0)
			{
				w++;
			}
		}
		for (int i = w;i >= 1;i--)
		{
			System.out.print(s[i]);
		}

		return 0;
	}

}

