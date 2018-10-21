package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[205]);
		String b = new String(new char[205]);
		String t = new String(new char[205]);
		String c = new String(new char[205]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * t1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * t2;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * t3;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int l1 = a.length();
		int l2 = b.length();
		if (l1 < l2)
		{
			int i;
			int j;
			int carry = 0;
			for (i = 0;i < 205;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, '\0');
			}
			t3 = c.charAt(l2);
			t2 = b.charAt(l2 - 1);
			t1 = a.charAt(l1 - 1);
			while (t1 >= a)
			{
				*t3 = (*t1 + *t2 - '0' - '0' + carry) % 10 + '0';
				carry = (*t1 + *t2 - '0' - '0' + carry) / 10;
				t3--;
				t2--;
				t1--;
			}
			while (t2 >= b)
			{
				* t3 = (*t2 - '0' + carry) % 10 + '0';
				carry = (*t2 - '0' + carry) / 10;
				t3--;
				t2--;
			}
			*t3 = carry + '0';
			if (*t3 == '0')
			{
				t3++;
			}
			System.out.print(t3);
			System.out.print("\n");
		}
		else
		{
			int i;
			int j;
			int carry = 0;
			for (i = 0;i < 205;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, '\0');
			}
			t3 = c.charAt(l1);
			t2 = b.charAt(l2 - 1);
			t1 = a.charAt(l1 - 1);
			while (t2 >= b)
			{
				*t3 = (*t1 + *t2 - '0' - '0' + carry) % 10 + '0';
				carry = (*t1 + *t2 - '0' - '0' + carry) / 10;
				t3--;
				t2--;
				t1--;
			}
			while (t1 >= a)
			{
				* t3 = (*t1 - '0' + carry) % 10 + '0';
				carry = (*t1 - '0' + carry) / 10;
				t3--;
				t1--;
			}
			*t3 = carry + '0';
			while (*t3 == '0')
			{
				t3++;
			}
			if (*t3 == '\0')
			{
				System.out.print(0);
				System.out.print("\n");
			}
			else
			{
			System.out.print(t3);
			System.out.print("\n");
			}
		}
		return 0;
	}
}

