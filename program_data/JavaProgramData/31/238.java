public class st
{
	public String s = new String(new char[200]);
	public st next1;
}

package <missing>;

public class GlobalMembers
{
	public static char[] ss = {'e', 'n', 'd'};
	public static int n = 0;
	public static void Main()
	{
		st p;
		st creat = new st();
		int i = 0;
		st head;
		st p1;
		st p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (st)malloc(len);
		p1.next1 = null;
		p1.s = new Scanner(System.in).nextLine();
		head = p1;
		while (true)
		{
			n++;
			if (n == 1)
			{
				head = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (st)malloc(len);
			p1.s = new Scanner(System.in).nextLine();
			p1.next1 = p2;
			if (strcmp(p1.s,ss) == 0)
			{
				break;
			}
		}
		head.next1 = null;
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",p2.s);
			p2 = p2.next1;
		}
	}
}
