public class student
{
	public String inf = new String(new char[50]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student head;
		student p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (student)malloc(LEN);
		p.inf = new Scanner(System.in).nextLine();
		head = null;
		while (p.inf.charAt(0) != 'e')
		{
			p.next = head;
			head = p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (student)malloc(LEN);
			p.inf = new Scanner(System.in).nextLine();
		}
		p = head;
		while (true)
		{
		System.out.printf("%s",p.inf);
		p = p.next;
		if (p == null)
		{
			break;
		}
		else
		{
			System.out.print("\n");
		}
		}
		return 0;
	}

}
