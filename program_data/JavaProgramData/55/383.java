package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s;
		int i;
		int a;
		int b;
		int[] w = new int[1000];
		int q;
		int aa;
		int l;
	String n = new String(new char[12000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		l = n.length();
		aa = 1;
		s = 0;
		for (i = l - 1;i >= 0;i--)

		{
			if (n.charAt(i) >= 48 && n.charAt(i) <= 57)
			{
				s = s + aa * (n.charAt(i) - 48);
			}
			if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
			{
				s = s + aa * (n.charAt(i) + 10 - 'a');
			}
			if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
			{
				s = s + aa * (n.charAt(i) + 10 - 'A');
			}
			aa = aa * a;
		}
		q = 0;
	if (s == 0)
	{
		System.out.print("0");
	}
		while (s > 0)
		{
			q = q + 1;
			w[q] = s % b;
			s = s / b;
		}
		for (i = q;i >= 1;i--)
		{
			if (w[i] < 10)
			{
				System.out.printf("%d",w[i]);
			}
		else
		{
			System.out.printf("%c",'A' + w[i] - 10);
		}
		}




	}

}

