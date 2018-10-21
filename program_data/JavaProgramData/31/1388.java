public class student
{
public String s = new String(new char[100]);
public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;

	public static void Main()
	{
	student head;
	student p1;
	student p2;
	n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = p2 = (student) malloc(LEN);
	p1.s = new Scanner(System.in).nextLine();
	head = null;

	while (p1.s.charAt(0) != 'e')
	{
	n = n + 1;
	if (n == 1)
	{
		p1.next = null;
	}
	else
	{
		p1.next = p2;
	}
	p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = (student)malloc(LEN);
	p1.s = new Scanner(System.in).nextLine();
	}
	head = p2;




	p1 = head;
	while (p1 != null)
	{
	System.out.printf("%s\n",p1.s);
	p1 = p1.next;
	}




	}

}
