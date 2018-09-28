package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct a
	//	{
	//		char s[100];
	//		struct a *next;
	//	};
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		int len = sizeof(a);
		int n = 0;
		a p1;
		a p2;
		a head;
		a p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (a)malloc(len);
		head = null;
		p1.s = new Scanner(System.in).nextLine();
		while (strcmp(p1.s,"end") != 0)
		{
			n++;
			if (n == 1)
			{
				head = p1;
			}
			else
			{
				p1.next = p2;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (a)malloc(len);
			p1.s = new Scanner(System.in).nextLine();
		}
		head.next = null;
		p = p2;
		if (head != null)
		{
			do
			{
				System.out.println(p.s);
				p = p.next;
			}while (p != null);
		}
	}

}
