public class student
{
	public String a = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(len);
		p1.next = null;
		p1.a = new Scanner(System.in).nextLine();
		while ((strcmp(p1.a,"end")) != 0)
		{
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(len);
			p1.next = p2;
			p1.a = new Scanner(System.in).nextLine();
		}
		p1 = p1.next;
		while (p1 != null)
		{
			System.out.printf("%s\n",p1.a);
			p1 = p1.next;
		}
		return 0;
	}
}
