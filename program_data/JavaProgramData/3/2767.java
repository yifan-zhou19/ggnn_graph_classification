package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i = 0;
		int j;
		int sign = 1;
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
		int[] s = new int[n];
		while (i < n)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i] = Integer.parseInt(tempVar3);
			}
			i = i + 1;
		}
		i = 0;
		while (i < n)
		{
			j = i + 1;
			while (j < n)
			{
				if (s[i] + s[j] == k)
				{
					sign = 0;
				}
				j = j + 1;
			}
			i = i + 1;
		}
		if (sign == 0)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

