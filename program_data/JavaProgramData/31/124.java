public class student
{
	public String str = new String(new char[1000]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student p;
		student pnew;
		student head;
		student p1;
		pnew = new student();
		pnew.str = new Scanner(System.in).nextLine();
		pnew.next = null;
		if (strcmp(pnew.str,"end") == 0)
		{
			pnew = null;
			head = null;
		}
		else
		{
			head = pnew;
			p = pnew;
		while (true)
		{
			pnew = new student();
			pnew.str = new Scanner(System.in).nextLine();
			pnew.next = null;
			if (strcmp(pnew.str,"end") == 0)
			{
				pnew = null;
				break;
			}
			else
			{
				head = pnew;
				pnew.next = p;
				p = pnew;
			}
		}
		}
		p1 = head;
		while (p1 != null)
		{
			System.out.printf("%s\n",p1.str);
			p1 = p1.next;
		}
		return 0;
	}
}
