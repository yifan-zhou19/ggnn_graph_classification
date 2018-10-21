package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n1;
		int n2;
		int l;
		int t;
		int s = 0;
		String number1 = new String(new char[40]);
		String number2 = new String(new char[40]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			number1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n2 = Integer.parseInt(tempVar3);
		}
		l = number1.length();
		for (p = number1;p < number1.Substring(l);p++)
		{
			if (*p >= '0' && *p <= '9')
			{
				t = p - '0';
			}
			else if (*p >= 'a' && *p <= 'z')
			{
				t = p - 'a' + 10;
			}
			else if (*p >= 'A' && *p <= 'Z')
			{
				t = p - 'A' + 10;
			}
			s = s * n1 + t;
		}
		for (p = number2;1;p++)
		{
			if (s % n2 >= 0 && s % n2 <= 9)
			{
				*p = s % n2 + 48;
			}
			else if (s % n2 > 9)
			{
				*p = s % n2 + 55;
			}
			s = s / n2;
			if (s == 0)
			{
				break;
			}
		}
		for (;p >= number2;p--)
		{
			System.out.printf("%c",*p);
		}
		System.out.print("\n");
		return 0;
	}
}

