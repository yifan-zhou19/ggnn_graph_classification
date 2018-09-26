public class num
{
	public String content = new String(new char[50]);
	public num next;
}

package <missing>;

public class GlobalMembers
{
	public static num crea()
	{
		int i;
		num head;
		num p1;
		num p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (num)malloc(LEN);
		head = p1;
		p1.content = new Scanner(System.in).nextLine();
		head.next = null;
		for (;;)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (num)malloc(LEN);
			p1.content = new Scanner(System.in).nextLine();
			if (p1.content.charAt(0) != 'e')
			{
				p1.next = p2;
				p2 = p1;
			}
			else
			{
				p1.next = p2,p2 = p1;
				break;
			}
		}
	   return (p1);
	}
	public static int Main()
	{
	int nx;
	int m;
	int m0;
	int tx;
	int qx;
	int q;
	int mxh;
	num hi;
	num p;
	num t;
	hi = crea();
	t = hi.next;
	for (p = t;p != null;p = p.next)
	{
	System.out.printf("%s\n",p.content);
	}
	return 0;
	}
}
