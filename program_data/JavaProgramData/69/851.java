package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] aa = new int[300];
		int[] bb = new int[300];
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(aa,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(bb,0,(Integer.SIZE / Byte.SIZE));
		int i;
		int j = 0;
		int k;
		int m = 0;
		int n;
		for (i = a.length() - 1;i >= 0;i--)
		{
			aa[j++] = a.charAt(i) - '0';
		}
		for (k = b.length() - 1;k >= 0;k--)
		{
			bb[m++] = b.charAt(k) - '0';
		}
		for (n = 0;n < 300;n++)
		{
			aa[n] += bb[n];
			if (aa[n] >= 10)
			{
				aa[n + 1] += 1;
				aa[n] -= 10;
			}
		}

		int s = 299;
		while (aa[s] == 0 && s >= 0)
		{
			s--;
		}
		if (s != -1)
		{
			for (int t = s;t >= 0;t--)
			{
				System.out.print(aa[t]);
			}
		}
		else
		{
			System.out.print('0');
		}
		return 0;
	}


}

