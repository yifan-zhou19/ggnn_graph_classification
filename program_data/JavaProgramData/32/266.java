package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int x;
		int y;
		int k;
		int t;
		int[] c = new int[101];
		int ii;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (ii = 1;ii <= n;ii++)
		{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
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
		x = a.length();
		y = b.length();
		for (j = y - 1,k = x - 1;j >= 0;j--,k--)
		{
			if (a.charAt(k) >= b.charAt(j))
			{
				c[k] = a.charAt(k) - b.charAt(j);
			}
			else
			{
				c[k] = a.charAt(k) + 10 - b.charAt(j);
				a = tangible.StringFunctions.changeCharacter(a, k - 1, a.charAt(k - 1) - 1);
			}
		}
		for (i = 0;i <= x - y - 1;i++)
		{
			c[i] = a.charAt(i) - '0';
		}
		for (j = 0;j < x;j++)
		{
			if (c[j] != 0)
			{
				t = j;
				break;
			}
		}
		for (i = t;i < x;i++)
		{
			System.out.printf("%d",c[i]);
		}
		System.out.print("\n");
		}
	}

}

