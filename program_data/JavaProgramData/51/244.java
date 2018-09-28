package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] b =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int i;
		int j;
		int[] c = new int[500];
		int max;
		int k;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		for (i = 0;i < a.length() - n + 1;i++)
		{
			k = 0;
			for (j = i;j < i + n;j++)
			{
				b[i][k] = a.charAt(j);
				k++;
			}
		}
		for (i = 0;i < a.length() - n + 1;i++)
		{
			for (j = i + 1;j < a.length() - n + 1;j++)
			{
				if (strcmp(b[i],b[j]) == 0)
				{
				c[i]++;
				}
			}
		}
		max = c[0];
		for (i = 1;i < a.length() - n + 1;i++)
		{
			if (c[i] > max)
			{
			max = c[i];
			}
		}
		if (max > 0)
		{
				System.out.printf("%d\n",max + 1);
		}
		for (i = 0;i < a.length() - n + 1;i++)
		{
			if (c[i] == max && max > 0)
			{
			System.out.printf("%s\n",b[i]);
			}
		}
		if (max == 0)
		{
		System.out.print("NO");
		}
		return 0;
	}
}

