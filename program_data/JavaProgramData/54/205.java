package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		s = 1;
		for (i = 1,j = 1;1 <= n;)
		{
			s = s * n + k;
			if (i == n)
			{
				break;
			}
			if (s % (n - 1) == 0)
			{
				s = s / (n - 1);
				i++;
			}
			else
			{
				j++;
				s = j;
				i = 1;
			}
		}
		System.out.printf("%d\n",s);
	}

}

