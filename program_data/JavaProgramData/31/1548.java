public class stru
{
	public stru pre;
	public String msg = new String(new char[200]);
	public stru next;
}

package <missing>;

public class GlobalMembers
{
	public static stru head;
	public static stru p;
	public static stru q;
	public static stru end;

	public static void creat()
	{
		String temp = new String(new char[200]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = q = (stru)malloc(LEN);
		head = p;
		head.pre = null;
		p.msg = new Scanner(System.in).nextLine();
		while (true)
		{
			temp = new Scanner(System.in).nextLine();
			if (strcmp(temp,"end") != 0)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p = (stru)malloc(LEN);
			p.msg = temp;
			p.pre = q;
			q.next = p;
			q = p;
			}
			else
			{
				break;
			}
		}
		q.next = null;
		end = q;
	}

	public static void print(stru end)
	{
		for (p = end;p != null;p = p.pre)
		{
			System.out.printf("%s\n",p.msg);
		}
	}

	public static void Main()
	{
		creat();
		print(end);
	}

}
