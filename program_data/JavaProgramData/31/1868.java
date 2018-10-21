public class student
{
	public String str = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(len);
		p1.str = new Scanner(System.in).nextLine();
		if (strcmp(p1.str,"end") == 0)
		{
			p1 = null;
			head = null;
			return head;
		}
		else
		{
			p1.next = null;
			head = p1;
			p2 = p1;
			do
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p1 = (student)malloc(len);
				p1.str = new Scanner(System.in).nextLine();
				if (strcmp(p1.str,"end") == 0)
				{
					p1 = null;
					break;
				}
				else
				{
					p1.next = null;
					p1.next = p2;
					p2 = p1;
					head = p1;
				}
			} while (1 != 0);
			return head;
		}
	}
	public static int Main()
	{
		student p;
		student pa;
		pa = creat();
		p = pa;
		do
		{
			System.out.printf("%s\n",p.str);
			p = p.next;
		} while (p != null);
		return 0;
	}
}
