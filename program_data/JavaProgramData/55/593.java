package <missing>;

public class GlobalMembers
{
	public static int num(int x,int i,int b)
	{
		int a;
		a = x;
		int j;
		for (j = 0;j < i;j++)
		{
			a = a * b;
		}
		return a;
	}
	public static void Main()
	{
		int a;
		int b;
		int i;
		int j;
		int length;
		String shu = new String(new char[100]);
		String zhuanhuan = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			shu = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		int k = 0;
		length = shu.length();
		int l;
		for (i = 0;i < length - 1;i++)
		{
			if (((shu.charAt(i) >= 'A') && (shu.charAt(i) <= 'Z')))
			{
				l = shu.charAt(i) - 'A' + 10;
				k = k + num(l, length - i - 1, a);
			}
			if (((shu.charAt(i) >= '0') && (shu.charAt(i) <= '9')))
			{
				l = shu.charAt(i) - '0';
				k = k + num(l, length - i - 1, a);
			}
			if (((shu.charAt(i) >= 'a') && (shu.charAt(i) <= 'z')))
			{
				l = shu.charAt(i) - 'a' + 10;
				k = k + num(l, length - i - 1, a);
			}
		}
		if ((shu.charAt(length - 1) >= 'A') && (shu.charAt(length - 1) <= 'Z'))
		{
			k = k + shu.charAt(length - 1) - 'A' + 10;
		}
		if (((shu.charAt(length - 1) >= '0') && (shu.charAt(length - 1) <= '9')))
		{
			k = k + shu.charAt(length - 1) - '0';
		}
		if ((shu.charAt(length - 1) >= 'a') && (shu.charAt(length - 1) <= 'z'))
		{
				k = k + shu.charAt(length - 1) - 'a' + 10;
		}
		int m = 0;
		int n;
		int f = k;
		do
		{
			n = f % b;
			if ((n >= 0) && (n <= 9))
			{
				zhuanhuan = tangible.StringFunctions.changeCharacter(zhuanhuan, m, n + '0');
				m++;
			}
			else
			{
				zhuanhuan = tangible.StringFunctions.changeCharacter(zhuanhuan, m, n - 10 + 'A');
				m++;
			}
			f = f / b;
		}while (f != 0);
		for (i = m - 1;i >= 0;i--)
		{
			System.out.printf("%c",zhuanhuan.charAt(i));
		}
		System.out.print("\n");
	}
}

