package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p3;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p4;
		int n1;
		int n2;
		int n3;
		int flag = 1;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		p1 = s;
		p2 = a;
		p3 = b;
		n1 = s.length();
		n2 = a.length();
		n3 = b.length();
		while (p1 < s.Substring(n1))
		{
			p2 = a;
			p3 = b;
			if (Character.isLetter(*p1))
			{
				if (flag != 0)
				{
					flag = 0;
					for (p4 = p1;p2 < a.Substring(n2);p4++,p2++)
					{
						if (*p4 != *p2)
						{
							break;
						}
					}
					if ((p2 - a) == n2)
					{
						for (;p3 < b.Substring(n3);p3++)
						{
							System.out.printf("%c",*p3);
						}
						p1 = p1 + n2;
					}
					else
					{
						for (;Character.isLetter(*p1);p1++)
						{
							System.out.printf("%c",*p1);
						}
					}
				}
			}
			else
			{
				System.out.print(" ");
				flag = 1;
				p1++;
			}
		}
	}
}
