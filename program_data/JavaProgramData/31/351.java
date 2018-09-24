public class stu
{
	public String xuehao = new String(new char[20]);
	public String name = new String(new char[20]);
	public String sex = new String(new char[10]);
	public int old;
	public float score;
	public String where = new String(new char[20]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		stu head;
		stu p0;
		stu p;
		int i;
		final String a = "end\0";
		head = null;
		for (i = 0;;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p0 = (stu)malloc(LEN);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p0.xuehao = tempVar.charAt(0);
			}
			if (strcmp(p0.xuehao,a) == 0)
			{
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p0.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p0.sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p0.old = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p0.score = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p0.where = tempVar6.charAt(0);
			}
			if (head == null)
			{
				head = p0;
				p0.next = null;
				p = p0;
			}
			else
			{
				head = p0;
				p0.next = p;
				p = p0;
			}
		}
		for (p = head;p != null;p = p.next)
		{
			System.out.printf("%s %s %s %d %g %s\n",p.xuehao,p.name,p.sex,p.old,p.score,p.where);
		}
	}

}

