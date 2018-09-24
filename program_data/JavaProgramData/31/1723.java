public class student
{
	public String xuehao = new String(new char[200]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student create(n UnnamedParameter)
	{
		student p1;
		student p2;
		student head;
		p1 = p2 = new student();
		p1.next = null;
		p1.xuehao = new Scanner(System.in).nextLine();
		while (p1.xuehao.charAt(0) != 'e')
		{
			p2 = p1;
			p1 = new student();
			p1.next = p2;
			p1.xuehao = new Scanner(System.in).nextLine();
		}
		head = p2;
		return (head);
	}
	public static int Main()
	{
		student p1;
		int n;
		p1 = create(n);
		while (p1 != 0)
		{
			System.out.printf("%s\n",p1.xuehao);
			p1 = p1.next;
		}
	}


}
