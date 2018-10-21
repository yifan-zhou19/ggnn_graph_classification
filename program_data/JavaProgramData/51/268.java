package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[500]);
		int n;
		int max;
		int i;
		int j;
		int k;
		int len;
		int[] t = new int[500];
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (i = 0;i <= len - n;i++)
		{
			for (j = i;j <= len - n;j++)
			{
				f = 1;
				for (k = 0;k < n;k++)
				{
					if (str.charAt(i + k) == str.charAt(j + k))
					{
						f *= 1;
					}
					else
					{
						f *= 0;
					}
				}
				if (f == 1)
				{
					t[i]++;
				}
			}
		}
		max = 0;
		for (i = 0;i <= len - n;i++)
		{
			if (t[i] > max)
			{
				max = t[i];
			}
		}
		if (max <= 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
		}
		for (i = 0;i <= len - n;i++)
		{
			if (t[i] == max && t[i] > 1)
			{
				for (k = 0;k < n;k++)
				{
					System.out.printf("%c",str.charAt(i + k));
				}
				System.out.print(10);
			}
		}
	}


}

