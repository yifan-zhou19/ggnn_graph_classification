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
		int cmp;
		int count;
		int site;
		int mid;
		int timer;
		int[] re = new int[10];
		int[][] num = new int[510][2];
		String scan = new String(new char[501]);
		char[][] u = new char[510][510];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			scan = tempVar2.charAt(0);
		}
		count = -1;
		site = -1;
		cmp = 0;
		timer = -1;
		l = scan.length();
		for (i = 0;i < l - n + 1;i++)
		{
			count++;
			for (j = i;j < i + n;j++)
			{
				site++;
				u[count][site] = scan.charAt(j);
			}
			u[count][n] = 0;
			site = -1;
		}
		for (i = 0;i <= count;i++)
		{
			for (j = i;j <= count;j++)
			{
				cmp = strcmp(u[i],u[j]);
				if (cmp == 0)
				{
					num[i][0]++;
					num[i][1]++;
				}
			}
		}
		for (i = 1;i <= count;i++)
		{
			for (j = 0;j < count - i;j++)
			{
				if (num[j][1] < num[j + 1][1])
				{
					mid = num[j][1];
					num[j][1] = num[j + 1][1];
					num[j + 1][1] = mid;
				}
			}
		}
		for (i = 0;i <= count;i++)
		{
			if (num[i][0] == num[0][1])
			{
				timer++;
				re[timer] = i;
			}
		}
		if (num[0][1] > 1)
		{
		System.out.printf("%d\n",num[0][1]);
		for (i = 0;i <= timer;i++)
		{
			for (j = 0;j <= count;j++)
			{
				if (j == re[i])
				{
					System.out.printf("%s\n",u[j]);
				}
			}
		}
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}

}

