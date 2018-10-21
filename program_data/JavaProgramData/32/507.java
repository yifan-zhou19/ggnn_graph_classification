package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int r;
		int[] c = new int[100];
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{

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
			r = a.length();
			t = b.length();
			for (i = 0;i < r;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - '0');
			}
			for (i = 0;i < t;i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - '0');
			}
			for (i = r - 1,j = t - 1;j >= 0;i--,j--)
			{
				if (a.charAt(i) >= b.charAt(j))
				{
					c[i] = a.charAt(i) - b.charAt(j);
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, i - 1, a.charAt(i - 1) - 1);
					c[i] = a.charAt(i) + 10 - b.charAt(j);
				}
			}
			for (i = 0;i < r - t;i++)
			{
				c[i] = a.charAt(i);
			}
			for (i = r - 1;i > 0;i--)
			{
				if (c[i] < 0)
				{
					c[i - 1] = c[i - 1] - 1;
					c[i] = c[i] + 10;
				}
			}
			if (c[0] > 0)
			{
				System.out.printf("%d",c[0]);
			}
			for (i = 1;i < r - 1;i++)
			{
				System.out.printf("%d",c[i]);
			}
			System.out.printf("%d\n",c[r - 1]);
		}
	}
}

