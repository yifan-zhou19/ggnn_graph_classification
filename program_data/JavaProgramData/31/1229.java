public class stu
{
	public stu back;
	public String info = new String(new char[number]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String infos = new String(new char[number]);
		final String s = "end";
		stu head;
		stu p1;
		stu p2;
		stu tail;

		infos = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p2 = (stu)malloc(Len);
		if (strcmp(infos,s) != 0)
		{
			head = p2;
			p2.back = null;
			p2.info = infos;
			p2.next = null;
			infos = new Scanner(System.in).nextLine();
			p1 = p2;
		}
		while (strcmp(infos,s) != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p2 = (stu)malloc(Len);
			p1.next = p2;
			p2.back = p1;
			p2.info = infos;
			p2.next = null;
			p1 = p2;
			infos = new Scanner(System.in).nextLine();
		}
		tail = p1;
		while (p1 != null)
		{
			System.out.printf("%s\n",p1.info);
			p1 = p1.back;
		}
	}
}
