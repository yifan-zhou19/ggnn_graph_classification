public class st
{
	public String id = new String(new char[200]);
	public st pre;
	public st next;
}

package <missing>;

public class GlobalMembers
{
	public static st p1;
	public static st p2;
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (st)malloc(LEN);
		p1.pre = null;
		p1.id = new Scanner(System.in).nextLine();

		while (strcmp(p1.id,"end"))
		{
			p2.next = p1;
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (st)malloc(LEN);
			p1.id = new Scanner(System.in).nextLine();
			p1.pre = p2;
		}

		while (p2 != null)
		{
			System.out.printf("%s\n",p2.id);
			p2 = p2.pre;
		}

		return 0;
	}

}
