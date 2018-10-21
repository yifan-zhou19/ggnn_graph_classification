public class student
{
	public String num = new String(new char[16]);
	public String a = new String(new char[64]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;

	public static student creat()
	{
		student head;
		student p;
		student q;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = q = (student)malloc(len);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p.num = tempVar.charAt(0);
		}
		head = null_Renamed;
		while (strcmp(p.num,"end") != 0)
		{
			p.a = new Scanner(System.in).nextLine();
			n++;
			if (n == 1)
			{
				head = p,p.next = null_Renamed;
			}
			else
			{
				head = p,p.next = q;
			}
			q = p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (student)malloc(len);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.num = tempVar2.charAt(0);
			}
		}
		return (head);
	}

	public static void print(student head)
	{
		student p;
		p = head;
		int i;
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s",p.num);
			System.out.println(p.a);
			p = p.next;
		}
	}

	public static void Main()
	{
		student head;
		head = creat();
		print(head);
	}
}

