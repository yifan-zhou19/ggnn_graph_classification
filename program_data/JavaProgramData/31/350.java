public class a
{
public String id = new String(new char[150]);

public a pre;
}

package <missing>;

public class GlobalMembers
{
	public static a creat()
	{

	a head;
	a p1;
	a p2;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = (a)malloc(l);
	p1.id = new Scanner(System.in).nextLine();
	p1.pre = null;

	p2 = p1;

	while (true)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = (a)malloc(l);
	p1.id = new Scanner(System.in).nextLine();
	if (p1.id.charAt(0) == 'e')
	{
		break;
	}
	p1.pre = p2;
	p2 = p1;
	}
	p1 = null;
	head = p2;
	return head;
	}

	public static void des(a head)
	{
	a p;
	while (head != null)
	{
	p = head;
	head = head.pre;
	p = null;
	}
	}

	public static int Main()
	{
	a head;
	a p;
	head = creat();

	p = head;
	while (p != null)
	{
	System.out.printf("%s\n", p.id);
	p = p.pre;
	}

	des(head);
	return 0;
	}
}
