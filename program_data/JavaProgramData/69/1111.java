package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s1 = new String(new char[251]);
		String s2 = new String(new char[251]);
		int j;
		int k;
		int a;
		int b;
		int[] c = new int[252];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		a = s1.length();
		b = s2.length();
		int l = 0;
		while (a > 0 || b > 0)
		{
			j = (a > 0) ? s1.charAt(--a) - '0' : 0;
			k = (b > 0) ? s2.charAt(--b) - '0' : 0;
			c[l] += j + k;
			c[l + 1] = c[l] / 10;
			c[l] = c[l] % 10;
			l++;
		}
		while (c[l] == 0 && l > 0)
		{
			l--;
		}
		for (j = l; j >= 0; j--)
		{
			System.out.printf("%d",c[j]);
		}
		System.out.print("\n");
	}
}

