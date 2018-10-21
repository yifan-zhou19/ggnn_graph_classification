package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int n;
		int i;
		int k;
		int j;
		int[] c = new int[101];
		int l1;
		int l2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j <= 100;j++)
			{
				c[j] = 0;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			l1 = a.length();
			l2 = b.length();
			for (j = 100;j >= 101 - l1;j--)
			{
				a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(l1 - 101 + j) - '0');
			}
			for (j = 100;j >= 101 - l2;j--)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(l2 - 101 + j) - '0');
			}
			for (j = 0;j < 101 - l1;j++)
			{
				a = a.substring(0, j);
			}
			for (j = 0;j < 101 - l2;j++)
			{
				b = b.substring(0, j);
			}
			for (j = 100;j >= 100 - ((l1 > l2)?l1:l2);j--)
			{
				c[j] += a.charAt(j) - b.charAt(j);
				if (c[j] < 0)
				{
					c[j] = c[j] + 10;
					c[j - 1]--;
				}
			}
			j = 0;
			while (c[j] == 0)
			{
				j++;
			}
			for (k = j;k <= 100;k++)
			{
				System.out.printf("%d",c[k]);
			}
			System.out.print("\n");
		}
	}
}

