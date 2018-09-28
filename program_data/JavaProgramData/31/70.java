public class student
{
public String info = new String(new char[100]);
public student next;
public student former;
}

package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static int k;
	public static int n;
	public static void Main()
	{
	student head;
	student p1;
	student p2;
	n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = p2 = (student)malloc(len);
	p1.info = new Scanner(System.in).nextLine();
	head = null;
	while (strcmp(p1.info,"end") != 0)
	{
	n = n + 1;
	if (n == 1)
	{
		head = p1;
	p1.former = null;
	}
	else
	{
		p2.next = p1;
	p1.former = p2;
	}
	p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = (student)malloc(len);
	p1.info = new Scanner(System.in).nextLine();
	}
	p2.next = null;
	p1 = p2;

	do
	{
	System.out.println(p2.info);
	System.out.print("\n");
	p2 = p2.former;
	} while (p2 != 0);
	}
}
