package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[100];
		int n;
		int i = 0;
		int max;
		int qmax;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		i = 1;
		max = qmax = s[0];
		while (i < n)
		{
			if (max < s[i])
			{
				qmax = max,max = s[i];
			}
			else if (qmax < s[i])
			{
				qmax = s[i];
			}
			i++;
		}
		System.out.printf("%d\n%d\n",max,qmax);
		return 0;
	}
}

