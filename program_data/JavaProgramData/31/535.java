// ??????????.cpp : ??????????????
//


public class student
{
	public String info = new String(new char[100]);
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(L);
		p1.info = new Scanner(System.in).nextLine();
		if (strcmp(p1.info,"end") == 0)
		{
			return (null);
			exit;
		}
		else
		{
			p2 = null;
			for (int i = 1;;i++)
			{
				p1.pre = p2;
				p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p1 = (student)malloc(L);
				p1.info = new Scanner(System.in).nextLine();
				if (strcmp(p1.info,"end") == 0)
				{
					break;
				}
			}
			p1.pre = p2;
			head = p1.pre;
			return (head);
		}
	}

	public static int Main()
	{
		student p;
		p = creat();
		while (p != null)
		{
			System.out.printf("%s\n",p.info);
			p = p.pre;
		};
		return 0;
	}

}
