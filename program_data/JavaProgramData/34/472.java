package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[] s = new int[10000];
		int a = 0;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s[0] = n;
		if (n == 1)
		{
			System.out.print("End");
		}
		if (n != 1)
		{
		for (i = 1;;i++)
		{
			if (s[i - 1] % 2 == 1)
			{
				s[i] = 3 * s[i - 1] + 1;
				System.out.printf("%d*3+1=%d\n",s[i - 1],s[i]);
			}
			if (s[i] == 1)
			{
				System.out.print("End");
				break;
			}
			if (s[i - 1] % 2 == 0)
			{
				s[i] = s[i - 1] / 2;
				System.out.printf("%d/2=%d\n",s[i - 1],s[i]);
			}
			if (s[i] == 1)
			{
				System.out.print("End");
				break;
			}
		}
		}




		return 0;
	}
}

