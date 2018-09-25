package <missing>;

public class GlobalMembers
{
	public static int[] h = new int[100];
	public static int[] s = new int[100];
	public static int n;
	public static int p(int i)
	{
		int s1 = 0;
		int s2;
		int j;
		if (s[i] == 0)
		{

			for (j = i + 1;j < n;j++)
			{
				s2 = s1;
				if (h[i] < h[j])
				{
					s1 = 0;
				}
				else
				{
					s1 = p(j) + 1;
				}
				if (s1 < s2)
				{
					s1 = s2;
				}
			}
			s[i] = s1;
		}
		else
		{
			s1 = s[i];
		}

		return (s1);
	}
	public static void Main()
	{
		int i;
		int s1 = 0;
		int s2;
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
				h[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			s2 = s1;
			s1 = p(i);
			if (s1 < s2)
			{
				s1 = s2;
			}
		}
		System.out.printf("%d",s1 + 1);
	}


}

