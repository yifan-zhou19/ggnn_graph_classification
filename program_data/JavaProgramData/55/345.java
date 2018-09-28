package <missing>;

public class GlobalMembers
{
	public static int trans1(tangible.RefObject<String> s, int n)
	{
		int ans = 0;
		int i;
		int j;
		int len;
		len = s.argValue.length();
		for (i = 0;i < len;i++)
		{
			if (s.argValue.charAt(i) >= '0' && s.argValue.charAt(i) <= '9')
			{
				j = s.argValue.charAt(i) - '0';
				ans = ans + j * Math.pow(n,len - i - 1);
			}
			else if (s.argValue.charAt(i) >= 'a' && s.argValue.charAt(i) <= 'z')
			{
				j = s.argValue.charAt(i) - 'a' + 10;
				ans = ans + j * Math.pow(n,len - i - 1);
			}
			else if (s.argValue.charAt(i) >= 'A' && s.argValue.charAt(i) <= 'Z')
			{
				j = s.argValue.charAt(i) - 'A' + 10;
				ans = ans + j * Math.pow(n,len - i - 1);
			}
		}
		return ans;
	}
	public static void trans2(tangible.RefObject<String> s, int n, int m)
	{
		int i;
		int r;
		int len;
		for (i = 0;m != 0;i++)
		{
			r = m % n;
			if (r >= 10)
			{
				s.argValue.charAt(i) = r - 10 + 'A';
			}
			else
			{
				s.argValue.charAt(i) = r + '0';
			}
			m = m / n;
		}
		s.argValue.charAt(i) = '\0';
		len = s.argValue.length();
		for (i = len - 1;i >= 0;i--)
		{
			System.out.print(s.argValue.charAt(i));
		}
	}
	public static void Main()
	{
		int n1;
		int n2;
		int k;
		String s = new String(new char[5000]);
		String ans = new String(new char[5000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n2 = Integer.parseInt(tempVar3);
		}
		if (s.charAt(0) == '0')
		{
			System.out.print("0");
		}
		else
		{
		tangible.RefObject<String> tempRef_s = new tangible.RefObject<String>(s);
			k = trans1(tempRef_s, n1);
			s = tempRef_s.argValue;
		tangible.RefObject<String> tempRef_ans = new tangible.RefObject<String>(ans);
			trans2(tempRef_ans, n2, k);
			ans = tempRef_ans.argValue;
		}
	}
}

