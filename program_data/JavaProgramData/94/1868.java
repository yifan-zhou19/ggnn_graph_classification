package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int[] an = new int[500];
		int[] bn = new int[500];
		int max;
		int l;
		int out;
		char x;
		x = ',';
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
				bn[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (bn[i] % 2 == 1)
			{
				an[j] = bn[i];
				j++;
			}
		}
		l = j;
		for (i = l - 1;i >= 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (an[j] >= an[j + 1])
				{
					max = an[j];
					an[j] = an[j + 1];
					an[j + 1] = max;
				}
			}
		}
		System.out.printf("%d",an[0]);
		out = an[0];
		for (i = 0;i < l;i++)
		{
			if (an[i] != out)
			{
				System.out.printf("%c%d",x,an[i]);
				out = an[i];
			}
		}
		return 0;
	}
}

