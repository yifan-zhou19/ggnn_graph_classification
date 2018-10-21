package <missing>;

public class GlobalMembers
{
	public static final int N = 1000;
	public static int Main()
	{
		String s = new String(new char[N]);
		String max = new String(new char[N]);
		String min = new String(new char[N]);
		int max_len = 0;
		int min_len = N;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n - .0.getValue() != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			int len = s.length();
			if (len > max_len)
			{
				max_len = len;
				max = s;
			}
			if (len < min_len)
			{
				min_len = len;
				min = s;
			}
		}
		System.out.printf("%s\n%s\n",max,min);
	}
}

