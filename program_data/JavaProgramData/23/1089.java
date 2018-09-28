package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int b = 1;
		String a = new String(new char[102]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		p = a.charAt(0);
		for (i = n - 1;i >= 0;i--)
		{
			*(p + i + 1) = *(p + i);
		}
		*p = (p + n + 1) = ' ';
		*(p + n + 2) = '\0';
		p = a.charAt(n + 1);
		for (;p > a.charAt(0);p--)
		{
			if (*p == ' ')
			{
				for (q = p - 1;q >= a.charAt(0);q--)
				{
					if (*q == ' ')
					{
						if (q == a.charAt(0))
						{
						b = 0;
						}
						for (q = q + 1;q < p;q++)
						{
							System.out.printf("%c",*q);
						}
						break;
					}
				}
				if (b != 0)
				{
					System.out.print(" ");
					b = 1;
				}
			}
		}
	}

}
