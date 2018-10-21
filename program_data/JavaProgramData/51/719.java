package <missing>;

public class GlobalMembers
{
	public static char[][] a = new char[501][5];
	public static String s = new String(new char[501]);
	public static String tem = new String(new char[5]);
	public static int[] b = new int[501];
	public static int[] sum = new int[501];
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int t;
		int flag = 0;
		int point = 1;


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
			t = 0;
			for (j = i;j < i + n;j++)
			{
				a[i][t] = s.charAt(j);
				t++;
			}

		}
		for (i = 0;i < l - n;i++)
		{
			if (b[i] == 0)
			{
					t = 1;
			for (j = i + 1;j < l - n + 1;j++)
			{

					if (strcmp(a[i],a[j]) == 0)
					{
						t++;
						b[j] = 1;
					}
			}
			sum[i] = t;
			if (sum[i] > 1)
			{
			flag = 1;
			}
			}
		}


		if (flag == 1)
		{
		for (i = 0;i < l - n;i++)
		{
			for (j = i + 1;j < l + n - 1;j++)
			{
				if (sum[j] > sum[i])
				{
					t = sum[i];
					sum[i] = sum[j];
					sum[j] = t;
					tem = a[j];
					a[j] = a[i];
					a[i] = tem;
				}
			}

		}

		for (i = 1;i < l - n + 1;i++)
		{
			if (sum[i] == sum[i - 1])
			{
			point++;
			}
			else
			{
			break;
			}
		}
		System.out.printf("%d\n",sum[0]);
		for (i = 1;i <= point;i++)
		{
			System.out.printf("%s\n",a[i - 1]);
		}
		}
		else
		{
			System.out.print("NO\n");
		}
	 return 0;

	}

}

