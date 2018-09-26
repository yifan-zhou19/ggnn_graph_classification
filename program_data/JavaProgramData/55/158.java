package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int s;
		int a;
		int b;
		int len;
		int i;
		int j;
		String num = new String(new char[50]);
		final String res = " ";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			num = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		len = num.length();
		s = 0;
		for (i = len - 1;i >= 0;i--)
		{
			n = 1;
			for (j = 1;j <= len - 1 - i;j++)
			{
				n = n * a;
			}
			if (num.charAt(i) >= '0' && num.charAt(i) <= '9')
			{
				s = s + n * (num.charAt(i) - '0');
			}
			else if (num.charAt(i) >= 'a' && num.charAt(i) <= 'z')
			{
				s = s + n * (num.charAt(i) - 'a' + 10);
			}
			else if (num.charAt(i) >= 'A' && num.charAt(i) <= 'Z')
			{
				s = s + n * (num.charAt(i) - 'A' + 10);
			}
		}
		n = s;
		j = 0;
		while (n != 0)
		{
			i = n % b;
			n = n / b;
			if (i < 10)
			{
				res = tangible.StringFunctions.changeCharacter(res, j, '0' + i);
			}
			else
			{
				res = tangible.StringFunctions.changeCharacter(res, j, 'A' + i - 10);
			}
			j++;
		}
		n = res.length();
		if (res.charAt(n - 1) == ' ')
		{
			System.out.print("0");
		}
		else
		{
			for (i = n - 1;i >= 0;i--)
			{
				System.out.printf("%c",res.charAt(i));
			}
		}
	}


}

