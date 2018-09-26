package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[600]);
		char[][] b =
		{
			{0, '\0', '\0', '\0', '\0', '\0'}
		};
		int n;
		int i;
		int j;
		int k;
		int l;
		int o;
		int p;
		int[] count = new int[600];
		int max;
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

		for (k = 0;k <= l - n;k++)
		{
			o = 0;
			for (i = k;i < k + n;i++)
			{
				b[k][o++] = a.charAt(i);
			}

			 //printf("%s\n",b[k]);

		}
		//printf("%d",k);
		for (i = 0;i < k;i++)
		{
			for (j = i + 1;j <= k;j++)
			{
				if (strcmp(b[i],b[j]) == 0)
				{

					count[i]++;
					//printf("%d\n",count[i]) ;              
				}
			}
		}
		max = count[i] + 1;
		for (i = 0;i <= l - n;i++)
		{
			if (count[i] > max - 1)
			{
				max = count[i] + 1;
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
				if (max == count[i] + 1)
				{
					System.out.printf("%s\n",b[i]);
				}
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			i = Integer.parseInt(tempVar3);
		}
		return 0;
	}

}

