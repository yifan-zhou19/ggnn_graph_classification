package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int[] x = new int[500];
		int max;
		String s = new String(new char[500]);
		char[][] s1 = new char[500][5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		l = s.length();
		for (i = 0;i <= l - n;i++)
		{
			for (j = i,k = 0;k < n;j++,k++)
			{
				s1[i][k] = s.charAt(j);
			}
		}
		for (i = 0;i <= l - n;i++)
		{
			x[i] = 1;
			for (j = i + 1;j <= l - n;j++)
			{
				if (strcmp(s1[i],s1[j]) == 0)
				{
					x[i]++;
					x[j] = -500;
				}
			}
		}
		max = x[0];
		for (i = 1;i <= l - n;i++)
		{
			if (x[i] > max)
			{
				max = x[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
		System.out.printf("%d\n",max);
		for (i = 0;i <= l - n;i++)
		{
			if (x[i] == max)
			{
				System.out.printf("%s\n",s1[i]);
			}
		}
		}
	}
}

