package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int k = 0;
		int h = 0;
		int l = 0;
		int m = 0;
		int ss = 1;
		String x = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		x = new Scanner(System.in).nextLine();
		char[][] xx = new char[500][500];
		int[] b = new int[500];
		int s = -1;
		for (i = 0;i < 500;i++)
		{
			b[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			xx[j][k] = x.charAt(i);
			k++;
		}
		xx[j][k] = '\0';
	//	j++;
		k = 0;
		for (i = 0;x.charAt(i + n - 1) != '\0';i++)
		{
			for (h = 0;h <= j;h++)
			{
				s = -1;
				for (l = 0;l < n;l++)
				{
					ss = 1;
					if (x.charAt(i + l) != xx[h][l])
					{
						ss = 0;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto end1;
					}
				}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end1:
	if (ss == 1)
	{
					s = h;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto end;
	}
			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
	if (s == -1)
	{
				j++;
				b[j]++;
				for (m = 0;m < n;m++)
				{
					xx[j][m] = x.charAt(i + m);
				}
				xx[j][m] = '\0';
	}
			else
			{
				b[s]++;
			}
		}
		int max = b[0];
		for (i = 0;i <= j;i++)
		{
			if (b[i] >= max)
			{
				max = b[i];
			}
	//		printf("%s %d\n",xx[i],b[i]);
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i <= j;i++)
			{
				if (b[i] == max)
				{
					System.out.printf("%s\n",xx[i]);
				}
			}
		}
		return 0;
	}
}

