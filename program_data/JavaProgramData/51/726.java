package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int[] ans = new int[500];
		int max;
		int p;
		String a = new String(new char[500]);
		char[][] b = new char[500][5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		l = a.length();
		k = 0;
		for (i = 0;i <= l - n;i++)
		{
			for (p = i,j = 0;j < n;j++,p++)
			{
				b[k][j] = a.charAt(p);
			}
			k++;
		}
		max = 0;
		for (i = 0;i < k;i++)
		{
			for (j = i;j < k;j++)
			{
				if (strcmp(b[i],b[j]) == 0)
				{
					ans[i]++;
				}
			}
			if (ans[i] >= max)
			{
				max = ans[i];
			}
		}

		if (max == 1)
		{
			System.out.print("NO");
			return 0;
		}
		System.out.printf("%d\n",max);
		for (i = 0;i < k;i++)
		{
			if (ans[i] == max)
			{

				System.out.printf("%s\n",b[i]);

			}
		}



	}
}

