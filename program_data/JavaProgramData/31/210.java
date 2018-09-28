public class student
{
	public String inf = new String(new char[1000]);
	public student pre;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student head;
		student p1;
		student p2;
		student tail;
		int i;
		int j;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = (student)malloc(LEN);
		p1 = head;
		p2 = null;
		p1.pre = null;
		p1.next = null;
		for (;;)
		{
			p1.inf = new Scanner(System.in).nextLine();
			if (strcmp(p1.inf,"end") == 0)
			{
				p1.pre = p2;
				tail = p2;
				break;
			}
			else
			{
				p1.pre = p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p1.next = (student)malloc(LEN);
				p2 = p1;
				p1 = p1.next;
				p1.next = null;
			}
		}
		p1 = tail;
		while (p1 != null)
		{
			System.out.println(p1.inf);
			p1 = p1.pre;
		}
	}
}
