package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[600]);
		String str1 = new String(new char[10]);
		int n;
		int[] a = new int[500];
		int i;
		int j;
		int k;
		int l;
		int m;
		int p;
		int temp;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		l = str.length();
		for (i = 0;i <= l - n - 1;i++)
		{
			a[i] = 1;
			for (j = 0;j <= n - 1;j++)
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, j, str.charAt(i + j));
			}
			for (k = (i + 1);k <= l - n;k++)
			{
				for (m = k,p = 0,temp = 0;p <= n - 1;m++,p++)
				{
					if (str.charAt(m) == str1.charAt(p))
					{
						temp++;
					}
					else
					{
						break;
					}
				}
				if (temp == n)
				{
					a[i] = (a[i] + 1);
					a[k] = -5000;
				}
			}
		}
		max = a[0];
		temp = 1;
		for (i = 1;i <= l - n - 1;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
			if (a[i] == max)
			{
				temp++;
			}
		}
		if (max != 1)
		{
		System.out.printf("%d\n",max);
		for (i = 0;i <= l - n;i++)
		{
			if (a[i] == max)
			{
				for (p = i;p <= i + n - 1;p++)
				{
					System.out.printf("%c",str.charAt(p));
				}
				System.out.print("\n");
			}
		}
		}
		else
		{
			System.out.print("NO\n");
		}
		return 0;
	}
}

