package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] b = new char[205][100];
		int i;
		int n;
		int j = 0;
		int k = 0;
		int s = 0;
		int t = 0;
		int max;
		int min;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				*(b + i) = tempVar2;
			}
		}
		max = String.valueOfb.length();
		min = String.valueOfb.length();
		for (i = 1;i < n;i++)
		{
			if (String.valueOf(*(b + i)).length() > max)
			{
				max = String.valueOf(*(b + i)).length();
				s = i;
			}
			if (String.valueOf(*(b + i)).length() < min)
			{
				min = String.valueOf(*(b + i)).length();
				t = i;
			}
		}
		System.out.printf("%s\n%s\n",*(b + s),*(b + t));
		return 0;
	}

}

