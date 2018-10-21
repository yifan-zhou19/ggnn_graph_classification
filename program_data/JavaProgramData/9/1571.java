public class stu
{
	public String name = new String(new char[20]);
	public int age;
	public int order;
	public stu next;
}
		p = head,j = 0;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		stu p;
		stu q;
		stu t;
		stu r;
		stu head;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = (stu)malloc(l);
		q = head;
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (stu)malloc(l);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.age = Integer.parseInt(tempVar3);
			}
			p.order = i;
			q.next = p;
			q = p;
		}
		q.next = null;
		for (i = 0;i < n - 1;i++)
		{
			for (p = head,j = 0;j < n - 1 - i;j++,p = p.next)
			{
				q = p.next;
				t = q.next;
				if ((q.age == t.age && q.order > t.order) || (q.age < 60 && t.age < q.age && q.order> t.order) || (t.age < 60 && t.age> q.age && q.order> t.order) || (t.age >= 60 && t.age > q.age))
				{
					r = t.next;
					t.next = q;
					p.next = t;
					q.next = r;
				}
			}
		}
		p = head.next;
		while (p != null)
		{
			System.out.printf("%s\n",p.name);
			p = p.next;
		}
	}








}

