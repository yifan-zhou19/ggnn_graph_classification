package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[100000];
		int i;
		int j;
		int k;
		int t;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 10;i >= 2;i--)
		{
		 if (s[i] > s[i - 1])
		 {
				t = s[i - 1];
				s[i - 1] = s[i];
				s[i] = t;
		 }
		}
		for (i = 10;i >= 3;i--)
		{
			if (s[i] > s[i - 1])
			{
				t = s[i - 1];
				s[i - 1] = s[i];
				s[i] = t;
			}
		}
			System.out.printf("%d\n",s[1]);
			System.out.printf("%d\n",s[2]);
			return 0;
	}






}

