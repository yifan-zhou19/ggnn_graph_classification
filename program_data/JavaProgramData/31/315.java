public class student
{
	public String num = new String(new char[10]);
	public String qita = new String(new char[50]);
	public student last;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int l;
		student end;
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		l = sizeof(student);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		end = (student)malloc(l);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = (student)malloc(l);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			head.num = tempVar.charAt(0);
		}
		head.qita = new Scanner(System.in).nextLine();
		head.last = end;
		end.last = null;
		p1 = head;
		p2 = head;
		for (;;)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(l);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.num = tempVar2.charAt(0);
			}
			if (p1.num.charAt(0) == 'e')
			{
				break;
			}
			p1.qita = new Scanner(System.in).nextLine();
			p1.last = p2;
			p2 = p1;
		}
		while (p2.last != null)
		{
			System.out.printf("%s%s\n",p2.num,p2.qita);
			p2 = p2.last;
		}
	}



}

