package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[1000]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String out = new String(new char[1000]);
		void insertb(char * s,char * a,char * b,char * out);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
	tangible.RefObject<String> tempRef_s = new tangible.RefObject<String>(s);
	tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
	tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
	tangible.RefObject<String> tempRef_out = new tangible.RefObject<String>(out);
		insertb(tempRef_s, tempRef_a, tempRef_b, tempRef_out);
		out = tempRef_out.argValue;
		b = tempRef_b.argValue;
		a = tempRef_a.argValue;
		s = tempRef_s.argValue;
	}
	public static void insertb(tangible.RefObject<String> s, tangible.RefObject<String> a, tangible.RefObject<String> b, tangible.RefObject<String> out)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p3;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p4;
		for (p1 = s.argValue,p2 = a.argValue;p1 < s.argValue + s.argValue.length();)
		{
			if ((*p1 == *p2 && p1 == s.argValue) || (*p1 == *p2 && *(p1 - 1) == 32))
			{
				for (p2 = a.argValue;p2 < a.argValue + a.argValue.length();p2++)
				{
					if (*p1 == *p2)
					{
						p1++;
					}
					else
					{
						break;
					}
				}
				if (p2 == a.argValue + a.argValue.length())
				{
					p4 = out.argValue;
					for (p3 = s.argValue;p3 < p1 - a.argValue.length();p4++,p3++)
					{
						*p4 = p3;
					}
					for (p3 = b.argValue;p3 < b.argValue + b.argValue.length();p4++,p3++)
					{
						*p4 = p3;
					}
					for (p3 = p1;p3 < s.argValue + s.argValue.length();p3++,p4++)
					{
						*p4 = p3;
					}
					*p4 = '\0';
					break;
				}
				else
				{
					p2 = a.argValue;
				}
			}
			else
			{
				p1++;
			}
		}
		if (p2 == a.argValue + a.argValue.length())
		{
			insertb(out, a, b, s);
		}
		else
		{
			System.out.println(s.argValue);
		}
	}

}

