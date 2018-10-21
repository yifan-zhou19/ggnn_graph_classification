package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int l = 0;
		int p;
		int temp1 = 0;
		int temp2 = 0;
		int[] result = new int[9999];
		String a = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (i != 2)
			{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					temp1 = 1;
					break;
				}
			}
			}
			if (temp1 == 0)
			{
				p = i;
				for (j = 0;p >= 10;j++)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, p % 10);
					p = p / 10;
				}
				a = tangible.StringFunctions.changeCharacter(a, j, p);
				for (k = 0;k <= j;k++)
				{
					if (a.charAt(k) != a.charAt(j - k))
					{
						temp2 = 1;
						break;
					}
				}
				if (temp2 == 0)
				{
					result[l] = i;
					l++;
				}
			}
			temp1 = 0;
			temp2 = 0;
		}
		if (l == 0)
		{
			System.out.print("no");
		}
		else
		{
		for (i = 0;i < l - 1;i++)
		{
			System.out.printf("%d,",result[i]);
		}
		System.out.printf("%d",result[l - 1]);
		}
	}
}

