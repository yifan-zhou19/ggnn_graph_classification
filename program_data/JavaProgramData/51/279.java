package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[600]);
		a = new Scanner(System.in).nextLine();
		int l = a.length();
		int i;
		int j;
		int k;
		int l2 = l - n + 1;
		int[] N = new int[600];
		for (i = 0;i < l2;i++)
		{
			N[i] = 0;
		}
		for (i = 0;i < l2;i++)
		{
			for (j = i + 1;j < l2;j++)
			{
				int flag = 1;
				for (k = 0;k < n;k++)
				{
					if (a.charAt(j + k) != a.charAt(i + k))
					{
					flag = 0;
					break;
					}
				}
				if (flag == 0)
				{
					continue;
				}
				else
				{
					N[i] = N[i] + 1;
				}
			}
		}
		int max = N[0];

		for (i = 0;i < l2;i++)
		{
			if (N[i] > max)
			{
				max = N[i];
			}
		}

		if (max == 0)
		{
			System.out.print("NO\n");
		}
			else
			{
			System.out.printf("%d\n",max + 1);
		for (i = 0;i < l2;i++)
		{
			if (N[i] == max)
			{
				for (j = i;j < i + n;j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
				System.out.print("\n");
			}
		}
			}
	}


}

