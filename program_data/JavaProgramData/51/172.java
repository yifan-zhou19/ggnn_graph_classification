package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String s = new String(new char[1000]);
		char[][] a = new char[1000][1000];
		int[] b = new int[1000];
		int len;
		int i;
		int j;
		int k = 0;
		int h = 0;
		int max = 0;
		int imax = 0;
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
		len = s.length();
		for (i = 0;i <= len - n;i++)
		{
			h = 0;
			for (j = i;j < i + n;j++)
			{
			  a[k][h++] = s.charAt(j);
			}
			a[k][h] = '\0';
			k++;
		}
		for (i = 0;i < k;i++)
		{
			b[i] = 0;
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < k;j++)
			{
				if (strcmp(a[i],a[j]) == 0)
				{
					b[i]++;
				}
			}
		}
		//??????????????????
		for (i = 0;i < k;i++)
		{
			if (b[i] > max)
			{
			  max = b[i];
			}
		}

			if (max == 1)
			{
				System.out.print("NO\n");
			}
			else
			{
				System.out.printf("%d\n",max);
				for (i = 0;i < k;i++)
				{
					if (b[i] == max)
					{
						System.out.printf("%s\n",a[i]);
						for (j = 0;j < k;j++)
						{
							if (strcmp(a[i],a[j]) == 0)
							{
								b[j] = 0;
							}
						}
					}
				}
			}
	}



}

