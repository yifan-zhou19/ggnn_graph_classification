package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[255]);
		String s2 = new String(new char[255]);
		int a;
		int b;
		int l1;
		int l2;
		int[] sum = new int[255];
		int l = 0;
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
		l1 = s1.length();
		l2 = s2.length();
		while (l1 > 0 || l2 > 0)
		{
			a = (l1 > 0)?s1.charAt(--l1) - '0':0;
			b = (l2 > 0)?s2.charAt(--l2) - '0':0;
			sum[l] += a + b;
			sum[l + 1] = sum[l] / 10;
			sum[l++] %= 10;
		}
		while (sum[l] == 0 && l > 0)
		{
			l--;
		}
		for (;l >= 0;l--)
		{
			System.out.printf("%d", sum[l]);
		}
		System.out.print("\n");
		return 0;
	}
}

