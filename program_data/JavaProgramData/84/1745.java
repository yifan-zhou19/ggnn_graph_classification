package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] s = new int[100];
		int n;
		int i;
		int m;
		int j;
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
				s[i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j < 2;j++)
		{

			for (i = n - 1;i > 0;i--)
			{
			if (s[i] > s[i - 1])
			{
				m = s[i - 1];
				s[i - 1] = s[i];
				s[i] = m;
			}
			}
		}
	System.out.printf("%d\n%d",s[0],s[1]);

	}
}

