package <missing>;

public class GlobalMembers
{
	public static int[] s = new int[510];
	public static int Main()
	{
		int i;
		int n;
		int j;
		int t;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = j = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t = Integer.parseInt(tempVar2);
			}
			if ((t & 1) != 0)
			{
				s[j++] = t;
			}
		}
		sort(s,s + j);
		System.out.printf("%d",s[0]);
		for (i = 1;i < j;i++)
		{
			System.out.printf(",%d",s[i]);
		}
	}
}

