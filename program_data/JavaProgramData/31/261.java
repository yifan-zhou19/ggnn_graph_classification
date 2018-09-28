public class student
{
	public String input = new String(new char[500]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[500]);
		student head;
		student p1;
		student p;
		head = null;
		while (strcmp(gets(c),"end") != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			p1.input = c;
			p1.next = head;
			head = p1;
		}
		p = head;
			do
			{
				System.out.println(p.input);
				p = p.next;
				System.out.print('\n');
			}while (p != null);
	}


}
