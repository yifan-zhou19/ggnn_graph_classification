public class student
{
	public String a = new String(new char[100]);
	public student pre;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		student p1;
		student p2;
		student head;
		head =  new student();
		p1 = p2 = head;
		head.pre = null;
		while (true)
		{
			p1 = new student();
			p1.pre = p2;
			p1.a = new Scanner(System.in).nextLine();
			if (p1.a.charAt(0) == 'e')
			{
				return (p2);
			}
			p2 = p1;
		}
	}
	public static int Main()
	{
		student p1;
		p1 = creat();
		while (p1.pre != 0)
		{
			System.out.printf("%s\n",p1.a);
			p1 = p1.pre;
		}
		return 0;
	}
	//?????????????????

}
