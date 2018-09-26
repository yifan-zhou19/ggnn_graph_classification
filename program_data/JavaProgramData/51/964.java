package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int n;
		int[] a = new int[300];
		int l;
		int j;
		int max;
		String s = new String(new char[500]);
		char[][] gram = new char[300][5];
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
		for (i = 0;i < l - n + 1;i++)
		{
			k = 0;
			for (j = i;j < i + n;j++)
			{
				gram[i][k++] = s.charAt(j);
			}
			gram[i][k] = '\0';
		}
		for (i = 0;i < l - n + 1;i++)
		{
			a[i] = 1;
			for (j = i + 1;j < l - n + 1;j++)
			{
				if (strcmp(gram[i],gram[j]) == 0)
				{
					a[i]++;
				}
			}
		}
		max = a[0];
		for (i = 0;i < l - n + 1;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d",max);
			for (i = 0;i < l - n + 1;i++)
			{
				if (a[i] == max)
				{
					System.out.printf("\n%s",gram[i]);
				}
			}
		}
		return 0;
	}
}

