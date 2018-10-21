package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		int i;
		int[] p = new int[100];
		int sum = 0;
		String u = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			u = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		n = u.length();
		if (u.charAt(0) == '0')
		{
			System.out.print("0\n");
		}
		else
		{
		for (i = 0;i < n;i++)
		{
			if (u.charAt(i) >= '0' && u.charAt(i) <= '9')
			{
				sum = sum + (u.charAt(i) - 48) * Math.pow(a,n - i - 1);
			}
			if (u.charAt(i) >= 'a' && u.charAt(i) <= 'z')
			{
				sum = sum + (u.charAt(i) - 87) * Math.pow(a,n - i - 1);
			}
			if (u.charAt(i) >= 'A' && u.charAt(i) <= 'Z')
			{
				sum = sum + (u.charAt(i) - 55) * Math.pow(a,n - i - 1);
			}
		}
		int t;
		t = sum;
		i = 0;
		n = 0;
		while (t != 0)
		{
			p[i] = t % b;
			t = t / b;
			i++;
			n++;
		}
		for (i = n - 1;i >= 0;i--)
		{
			if (p[i] <= 9)
			{
				System.out.printf("%ld",p[i]);
			}
			if (p[i] >= 10)
			{
				System.out.printf("%c",p[i] + 55);
			}
		}
		}
		return 0;
	}
}

