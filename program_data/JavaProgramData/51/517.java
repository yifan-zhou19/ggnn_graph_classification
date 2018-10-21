package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int flag;
		int sum;
		int max;
		int lab;
		int len;
		int j;
		int[] b = new int[10000];
		String a = new String(new char[10000]);
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		a = new Scanner(System.in).nextLine();
		len = a.length();
		l = 0;
		lab = 0;
		max = 0;
		while (a.charAt(l) != 0)
		{
			sum = 0;
			for (i = l;i < len;i++)
			{
				flag = 1;
				for (j = 0;j < n;j++)
				{
					if (a.charAt(l + j) != a.charAt(i + j))
					{
						flag = 0;
					}
				}
				if (flag == 1)
				{
					sum++;
				}
			}
			if (sum > max)
			{
				max = sum;
			}
			b[l] = sum;
			l++;
		}
		if (max > 1)
		{
		System.out.printf("%d\n",max);
		for (i = 0;i < len;i++)
		{
			if (b[i] == max)
			{
				for (j = 0;j < n;j++)
				{
					System.out.printf("%c",a.charAt(j + i));
				}
				System.out.print("\n");
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

