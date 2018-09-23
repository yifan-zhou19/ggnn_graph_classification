public class stu
{
	public int xuehao;
	public int yuwen;
	public int shuxue;
	public int sum;
public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void max(stu h)
	{
		stu a;
		stu b;
		stu c;
		stu d;
		int m = 0;
		a = h;
		do
		{
			c = a;
			a = a.next;
			if (m < a.sum)
			{
				m = a.sum;
				d = c;
				b = a;
			}
		}while (a.next != null);
			System.out.printf("%d %d\n",b.xuehao,b.sum);
			d.next = b.next;
			b = null;
	}

	public static void Main()
	{
		stu head;
		stu p;
		stu q;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = M;
		p = M;
		head.next = p;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.xuehao = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.yuwen = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.shuxue = Integer.parseInt(tempVar4);
			}
			p.sum = p.yuwen + p.shuxue;
			q = M;
			p.next = q;
			p = q;
		}
		p.next = null;
		max(head);
		max(head);
		max(head);
	}

}

