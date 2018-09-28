public class student
{
	public String _no = new String(new char[9]);
	public String name = new String(new char[20]);
	public String sex = new String(new char[1]);
	public int age;
	public float score;
	public String add = new String(new char[20]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static void Main()
	{
		int i;
		student p1;
		student p2;
		student head;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		head = null;
		for (n = 0;;)
		{
			n = n + 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			if (n == 1)
			{
				p2.next = null;
			}
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					p1._no = tempVar.charAt(0);
				}
				if (p1._no.charAt(0) != 'e')
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						p1.name = tempVar2.charAt(0);
					}
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						p1.sex = tempVar3.charAt(0);
					}
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						p1.age = Integer.parseInt(tempVar4);
					}
					String tempVar5 = ConsoleInput.scanfRead();
					if (tempVar5 != null)
					{
						p1.score = Float.parseFloat(tempVar5);
					}
					String tempVar6 = ConsoleInput.scanfRead();
					if (tempVar6 != null)
					{
						p1.add = tempVar6.charAt(0);
					}
					p1.next = p2;
					p2 = p1;
				}
				else
				{
					head = p2;
					break;
				}
		}
		}
		p1 = head;
		for (i = 0;p1.next != null;i++)
		{
			System.out.printf("%s %s %s %d %g %s\n",p1._no,p1.name,p1.sex,p1.age,p1.score,p1.add);
			p1 = p1.next;
		}
	}

}

