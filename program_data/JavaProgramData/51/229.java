package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int l;
		int i;
		int j;
		int k;
		int max = 0;
		int[] sum = new int[1000];
		int[] c = new int[1000];
		String a = new String(new char[1000]);
		char[][] b = new char[1000][10];
		for (i = 0;i < 1000;i++)
		{
			for (j = 0;j < 10;j++)
			{
				*(*(b + i) + j) = '\0';
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0;i < l - n + 2;i++)
		{
			for (j = 0;j < n;j++)
			{
				*(*(b + i) + j) = *(a.Substring(i) + j);
			}
		}
		for (i = 0;i < l - n + 2;i++)
		{
			for (j = 0;j < l - n + 2;j++)
			{
				if (strcmp(*(b + i),*(b + j)) == 0)
				{
				 sum[i] = (sum + i) + 1;
				}
			}
		}
		for (i = 0;i < l - n + 2;i++)
		{
			if (sum[i] > max)
			{
				max = (sum + i);
			}
		}
		if (max == 1)
		{
				System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
		for (i = 0;i < l - n + 2;i++)
		{
			if (max == 1)
			{
				System.out.print("NO");
				break;
			}
			if (sum[i] == max && c[i] == 0)
			{
				System.out.printf("%s\n",*(b + i));
				for (k = i;k < l - n + 2;k++)
				{
					if (strcmp(*(b + k),*(b + i)) == 0)
					{
						c[k] = 1;
					}
				}
			}
		}
		}
	}








}

