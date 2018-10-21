package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static int Main()
	{
		int f = new int(int a,int b);
		int a;
		int b;
		int i;
		int n;
		int sum = 0;
		String s = new String(new char[999]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		n = s.length();
		for (i = 0;i < n;i++)
		{
			if (s.charAt(i) >= 97 && s.charAt(i) <= 122)
			{
		s.charAt(i) -= 87;
			}
		else if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
		{
		s.charAt(i) -= 55;
		}
		if (s.charAt(i) >= 48 && s.charAt(i) <= 57)
		{
		s.charAt(i) -= 48;
		}
		}
		for (i = 0;i < n;i++)
		{
		sum += s.charAt(i) * f(a, n - i - 1);
		}
		for (i = 0;;i++)
		{
			s = tangible.StringFunctions.changeCharacter(s, i, sum % b);
			sum = (sum - s.charAt(i)) / b;
			if (s.charAt(i) > 9)
			{
			s.charAt(i) += 55;
			}
			if (sum == 0)
			{
			break;
			}
		}
		for (i = i;i >= 0;i--)
		{
			if (s.charAt(i) > 9)
			{
			System.out.printf("%c",s.charAt(i));
			}
			else
			{
				System.out.printf("%d",s.charAt(i));
			}
		}
	}
	public static int f(int a,int b)
	{
		int i;
		int n = 1;
		for (i = 0;i < b;i++)
		{
		n *= a;
		}
		return n;
	}
}

