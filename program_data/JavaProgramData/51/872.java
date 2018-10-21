package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int l;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[500]);
		char[][] b = new char[500][5];
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		l = a.length();
		int i;
		int j;
		for (i = 0;i < 500;i++)
		{
			for (j = 0;j < 5;j++)
			{
				b[i][j] = 0;
			}
		}
		for (i = 0;i < l - n + 1;i++)
		{
			int k = 0;
			for (j = i;j < i + n;j++)
			{
				b[i][k] = a.charAt(j);
				k++;
			}

		}


		int[] d = new int[500];
		for (i = 0;i < l;i++)
		{
			d[i] = 1;
		}

		for (i = 0;i < l - n;i++)
		{
			for (j = i + 1;j < l - n + 1;j++)
			{
				if (strcmp(b[i],b[j]) == 0)
				{
					d[i]++;
					d[j] = 0;
				}
			}
		}
		int max = d[0];
		for (i = 0;i < l - n + 1;i++)
		{
			if (d[i] > max)
			{
				max = d[i];
			}
		}

		if (max > 1)
		{
			System.out.printf("%d\n",max);
			for (i = 0;i < l - n + 1;i++)
			{
				if (d[i] == max)
				{
					System.out.printf("%s\n",b[i]);
				}
			}
		}
		else
		{
			System.out.print("NO");
		}





	}

}

