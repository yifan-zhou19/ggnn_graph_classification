package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long n=0,temp;
		int n = 0;
		int temp;
		int f;
		int a;
		int b;
		int l;
		int i;
		int j;
		String c = new String(new char[100]);
		String r = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		l = c.length();
		for (i = 0;i < l;i++)
		{
			f = 0;
			temp = c.charAt(i) - '0';
			if ((temp <= 9) && (temp >= 0))
			{
				;
			}
			else if (temp >= 49)
			{
				temp = temp - 39;
			}
			else
			{
				temp = temp - 7;
			}
			for (j = 0;j < (l - 1 - i);j++)
			{
				temp = temp * a;
			}
			n = temp + n;
		}
		i = 0;
		f = 1;
		while (f != 0)
		{
			if (n >= b)
			{
			if ((n % b) > 9)
			{
				r = tangible.StringFunctions.changeCharacter(r, i, (n % b) + 55);
			}
			else
			{
				r = tangible.StringFunctions.changeCharacter(r, i, (n % b) + 48);
			}
			n = n / b;
			i++;
			}
			else
			{
				if (n > 9)
				{
					r = tangible.StringFunctions.changeCharacter(r, i, n + 55);
				}
				else
				{
					r = tangible.StringFunctions.changeCharacter(r, i, n + 48);
				}
				f = 0;
			}
		}
		for (;i >= 0;i--)
		{
			System.out.printf("%c",r.charAt(i));
		}
		System.out.print("\n");
	}
}

