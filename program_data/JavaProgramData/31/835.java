public class student
{
	public String info = new String(new char[100]);
public student next1;
public student next2;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i;
	public static student creat()
	{
	student p1;
	student p2;
	student p3;
	n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p3 = p2 = p1 = (student)malloc(LEN);
	p1.info = new Scanner(System.in).nextLine();
	while (p1.info.charAt(0) != 'e')
	{
	n += 1;
	if (n == 1)
	{
		p2.next1 = p1;
	p2.next2 = null;
	}
	else
	{
		p2.next1 = p1;
	p2.next2 = p3;
	}
	p3 = p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = (student)malloc(LEN);
	p1.info = new Scanner(System.in).nextLine();
	p2 = p1;
	}
	p3.next1 = null;
	return p3;
	}

	public static void print(student head)
	{
	student p;
	p = head;
	if (head != null)
	{
	do
	{
	System.out.printf("%s\n",p.info);
	p = p.next2;
	}while (p != null);
	}
	}

	public static int Main()
	{
		student top;
	top = creat();
	print(top);
	}


}
