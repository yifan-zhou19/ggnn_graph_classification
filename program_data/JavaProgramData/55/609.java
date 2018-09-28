package <missing>;

public class GlobalMembers
{
	public static int form(tangible.RefObject<String> num, int j)
	{
		 int n = 0;
		 int i;
		 int w = 0;
		 int l;
		 l = num.argValue.length();
		 for (i = l - 1;i >= 0;i--)
		 {
							if (Character.isDigit(num.argValue.charAt(i)))
							{
							w = num.argValue.charAt(i) - '0';
							}
							else if (Character.isLetter(num.argValue.charAt(i)))
							{
													 if (Character.isLowerCase(num.argValue.charAt(i)))
													 {
													 num.argValue.charAt(i) = Character.toUpperCase(num.argValue.charAt(i));
													 }
													 w = num.argValue.charAt(i) - 'A' + 10;
							}
								  n += w * (int)Math.pow(j,l - 1 - i);
		 }
		return n;
	}
	public static int reform(int n, tangible.RefObject<String> num, int b)
	{
		int y;
		int w;
		int i;
		for (i = 0;n >= b;i++)
		{
			y = n % b;
			n = n / b;
			num.argValue.charAt(i) = y < 10?'0' + y:'A' + y - 10;
		}

		  num.argValue.charAt(i) = n < 10?'0' + n:'A' + n - 10;


		 return i;
	}
	public static int Main()
	{
		int n = 0;
		int a;
		int b;
		int l;
		int i;
		String num1 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			num1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
	tangible.RefObject<String> tempRef_num1 = new tangible.RefObject<String>(num1);
		n = form(tempRef_num1, a);
		num1 = tempRef_num1.argValue;
	tangible.RefObject<String> tempRef_num12 = new tangible.RefObject<String>(num1);
		l = reform(n, tempRef_num12, b);
		num1 = tempRef_num12.argValue;
		for (i = l;i >= 0;i--)
		{
						 System.out.printf("%c",num1.charAt(i));
		}
			return 0;
	}

}

