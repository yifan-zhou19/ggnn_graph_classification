public class stu
{
	public String num = new String(new char[10]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public float[] mark = new float[6];
	public String add = new String(new char[10]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static stu creat()
	{
		stu head;
		stu p1;
		stu p2;
		n = 0;
		p1 = p2 = new stu();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		if (strcmp(p1.num,"end") == 0)
		{
			p1 = null;
			head = null;
			return head;
		}
		else
		{
			scanf(A, p1.name, p1.sex, p1.age, p1.mark, p1.add);
			head = p1;
			p2 = p1;
			p1.next = null;
			do
			{
				p1 = new stu();
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					p1.num = tempVar2.charAt(0);
				}
				if (strcmp(p1.num,"end") == 0)
				{
					 p1 = null;
					 break;
				}
				else
				{
					scanf(A, p1.name, p1.sex, p1.age, p1.mark, p1.add);
					head = p1;
					p1.next = p2;
					p2 = p1;
				}
			}while (1 != 0);
			return head;
		}
	}

	public static int Main()
	{
		stu p;
		stu head;
		p = creat();
		while (p != null)
		{
			System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.sex,p.age,p.mark,p.add);
			p = p.next;
		}
	}
}

