package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void kuo(char c[]);
		void pipei(char c[],char a[]);
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			final String c = "";
			final String a = "";
			c = new Scanner(System.in).nextLine();
			System.out.printf("%s\n",c);
			kuo(c);
			pipei(c, a);
		}
		return 0;
	}
	public static void pipei(String c, String a)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		for (p = c,q = a; * p != '\0';p++,q++)
		{
			if (*p != '(' && *p != ')')
			{
				*q = ' ';
			}
			if (*p == ')')
			{
				*q = '?';
			}
			if (*p == '(')
			{
				*q = '$';
			}
		}
		*q = p;
		System.out.printf("%s\n",a);
	}
	public static void kuo(String c)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * t;
		int s;
		for (;;)
		{
			s = 0;
			for (i = c; * i != '\0';i++)
			{
				for (p = i; * p != '\0';p++)
				{
					if (*p == '(')
					{
						for (q = p + 1; * q != '\0';q++)
						{
							if (*q == '(')
							{
								break;
							}
							else
							{
								if (*q == ')')
								{
									*p = 'a';
									*q = 'a';
									break;
								}
							}
						}
					}
				}
			}
			for (q = c; * q != '\0';q++)
			{
				for (t = q; * t != '\0';t++)
				{
					if (*q == '(' && *t == ')')
					{
						s = 1;
					}
				}
			}
			if (s == 0)
			{
			break;
			}
		}

	}
}

