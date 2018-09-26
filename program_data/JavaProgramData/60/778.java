package <missing>;

public class GlobalMembers
{
	public static int S(int a)
	{
		int i;
		int c = 0;
		for (i = 2;i < a;i++)
		{
			if (a % i == 0)
			{
				c++;
			}
		}
		if (c == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] s = new int[n];
		for (i = 2;i <= n;i++)
		{
			if (S(i) != 0)
			{
				s[j] = i;
				j++;
			}
		}
		for (i = 0;i < j - 1;i++)
		{
			if (s[i + 1] - s[i] == 2)
			{
				System.out.printf("%d %d\n",s[i],s[i + 1]);
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("empty");
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(s);
		return 0;
	}
}

