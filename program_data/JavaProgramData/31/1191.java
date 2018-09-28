public class student
{
	public String num = new String(new char[50]);
	public String ming = new String(new char[100]);
	public student pro;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student tail;

	public static student creat()
	{
		student head;
		student p1;
		student p2;
		int i;
		i = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(len);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		head = null;
		while (strcmp(p1.num,"end"))
		{
			p1.ming = new Scanner(System.in).nextLine();
			i++;
			if (i == 1)
			{
				head = p1;
				head.pro = null;
			}
			   else
			   {
				   p1.pro = p2;
			   }
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(len);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.num = tempVar2.charAt(0);
			}
		}
		tail = p2;
		return (tail);
	}

	public static int Main()
	{
		student p;
		creat();
		p = tail;
		for (;p != 0;)
		{
			System.out.printf("%s%s\n",p.num,p.ming);
			p = p.pro;
		}
	}

}

