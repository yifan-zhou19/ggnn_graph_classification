public class stu
{
public String data = new String(new char[100]);
public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	stu head;
	stu p1;
	stu p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = (stu)malloc(LEN);
	p1.next = null;
	p1.data = new Scanner(System.in).nextLine();
	while (strcmp(p1.data,"end"))
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p2 = (stu)malloc(LEN);
	 p2.next = p1;
	 p1 = p2;
	 p1.data = new Scanner(System.in).nextLine();
	}
	head = p1.next;
	for (p2 = head;p2 != null;p2 = p2.next)
	{
	System.out.println(p2.data);
	}
	}
}
