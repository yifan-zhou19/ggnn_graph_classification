package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] s = new int[200];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i] = Integer.parseInt(tempVar3);
			}
		}
		j = 100;
		for (i = n - m;i < n;i++)
		{
			s[j] = s[i];
			j++;
		}
		j = 100 + m;
		for (i = 0;i < n - m;i++)
		{
			s[j] = s[i];
			j++;
		}
		for (j = 100;j < 100 + n;j++)
		{
			if (j < 99 + n)
			{
			  System.out.printf("%d ",s[j]);
			}
			else
			{
				System.out.printf("%d",s[j]);
			}
		}
		return 0;
	}

}

