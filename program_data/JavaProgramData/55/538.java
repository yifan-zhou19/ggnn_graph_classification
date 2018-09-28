package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int i;
		int m;
		int n;
		int[] p = new int[100];
		int[] t = new int[100];
		int q;
		int num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		q = a.length();
		for (i = 0;i < q;i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				num = m * num + a.charAt(i) + 10 - 'a';
			}
			else if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
			{
				num = m * num + a.charAt(i) - '0';
			}
			else if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				num = m * num + a.charAt(i) - 'A' + 10;
			}
		}
		for (i = 0;num >= n;i++)
		{
			t[i] = num % n;
			num = num / n;
		}
		t[i] = num % n;
		for (;i >= 0;i--)
		{
			if (t[i] >= 0 && t[i] <= 9)
			{
				p[i] = t[i] + '0';
			}
			else if (t[i] >= 10 && t[i] < 26)
			{
				p[i] = t[i] + 'A' - 10;
			}
			System.out.printf("%c",p[i]);
		}
		return 0;
	}

}

