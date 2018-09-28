package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		int[] b = new int[501];
		int n;
		int l;
		int i;
		int j;
		int t;
		int max;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0;i <= l - n;i++)
		{
			for (j = i + 1;j <= l - n;j++)
			{
				flag = 0;
				for (t = 0;t < n;t++)
				{
				if (a.charAt(i + t) != a.charAt(j + t))
				{
					flag = -1;
				}
				}
				if (flag == 0)
				{
					b[i]++;
				}
			}
		}
		max = b[0];
		for (i = 0;i <= l - n;i++)
		{
			if (max < b[i])
			{
				max = b[i];
			}
		}
			if (max == 0)
			{
				System.out.print("NO");
			}
			else
			{
				System.out.printf("%d\n",max + 1);
		for (i = 0;i <= l - n;i++)
		{
			if (b[i] == max)
			{
				t = i;
				for (j = 0;j < n - 1;j++)
				{
					System.out.printf("%c",a.charAt(t));
					t++;
				}
				System.out.printf("%c\n",a.charAt(t));
			}
		}
			}

		return 0;
	}
}

