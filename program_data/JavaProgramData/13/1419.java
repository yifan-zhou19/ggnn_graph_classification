package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j = 1;
		int c = 0;
		int l = 1;
		int m;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] s = new int[20000];
		int[] t = new int[20000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = Integer.parseInt(tempVar2);
			}
		}
		t[0] = s[0];
		for (l = 1;l < n;l++)
		{
			c = 0;
			for (i = 0;i < l;i++)
			{
			if (s[l] == s[i])
			{
				c = 1;
				break;
			}
			}
			if (c == 0)
			{
				t[j] = s[l];
				j++;
			}
		}
		for (m = 0;(c = t[m + 1]) != 0;m++)
		{
			System.out.printf("%d ",t[m]);
		}
		System.out.printf("%d",t[m]);
	return 0;
	}
}

