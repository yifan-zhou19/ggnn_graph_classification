package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String m = new String(new char[100]);
		int[] n = new int[100];
		int[] t = new int[100];
		int l;
		int i;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = tempVar.charAt(0);
		}
		l = m.length();
		for (i = 0;i <= l - 1;i++)
		{
			n[i] = m.charAt(i) - '0';
		}
		if (l >= 3)
		{
		for (i = 0;i <= l - 2;i++)
		{
			t[i + 1] = (n[i] * 10 + n[i + 1]) / 13;
			n[i + 1] = (n[i] * 10 + n[i + 1]) % 13;
		}
		if (t[1] == 0)
		{
		for (i = 2;i <= l - 1;i++)
		{
			System.out.printf("%d",t[i]);
		}
		}
		else
		{
		for (i = 1;i <= l - 1;i++)
		{
			System.out.printf("%d",t[i]);
		}
		}
		System.out.print("\n");
		System.out.printf("%d",n[l - 1]);
		}
		else if (l == 2)
		{
			a = (n[0] * 10 + n[1]) / 13;
			b = (n[0] * 10 + n[1]) % 13;
			System.out.printf("%d\n",a);
			System.out.printf("%d",b);
		}
		else
		{
			System.out.print("0\n");
			 System.out.printf("%d",n[0]);
		}
		return 0;
	}

}

