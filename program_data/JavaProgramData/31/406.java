public class stu
{
	public String info = new String(new char[50]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		stu head;
		stu p1;
		stu p2;
		p2 = null;
		while (true)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (stu)malloc(LEN);
			p1.info = new Scanner(System.in).nextLine();
			if (strcmp(p1.info,"end") == 0)
			{
				break;
			}
			p1.next = p2;
			p2 = p1;
		}
		head = p2;
		p1 = head;
		while (true)
		{
			System.out.printf("%s\n",p1.info);
			if (p1.next == null)
			{
				break;
			}
			p1 = p1.next;
			p2 = null;
			p2 = p1;
		}
	}

}
