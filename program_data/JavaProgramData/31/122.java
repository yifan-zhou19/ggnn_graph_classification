public class student
{
	public String str = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int isequal(tangible.RefObject<String> a)
	{
		if (a.argValue.charAt(0) == 'e' && a.argValue.charAt(1) == 'n' && a.argValue.charAt(2) == 'd' && a.argValue.charAt(3) == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		student head;
		student p1;
		student p2;
		p1 = new student();
		p1.str = new Scanner(System.in).nextLine();
		p1.next = null;
	tangible.RefObject<String> tempRef_str = new tangible.RefObject<String>(p1.str);
		if (isequal(tempRef_str) != 0)
		{
			p1.str = tempRef_str.argValue;
			p1 = null;
			head = null;
		}
		else
		{
			p1.str = tempRef_str.argValue;
			head = p1;
			p2 = p1;
			do
			{
				p1 = new student();
				p1.str = new Scanner(System.in).nextLine();
				p1.next = null;
			tangible.RefObject<String> tempRef_str2 = new tangible.RefObject<String>(p1.str);
				if (isequal(tempRef_str2) != 0)
				{
					p1.str = tempRef_str2.argValue;
					p1 = null;
					break;
				}
				else
				{
					p1.str = tempRef_str2.argValue;
					head = p1;
					p1.next = p2;
					p2 = p1;

				}
			} while (1 != 0);
		}
		student p;
		p = head;
		while (p != null)
		{
			System.out.printf("%s",p.str);
			p = p.next;
			if (p != null)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}

