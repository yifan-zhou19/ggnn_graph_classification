public class student
{
	public int num;
	public int chi;
	public int mat;
	public int tol;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		student p1;
		student p2;
		student head;
		student p;
		student a;
		student b;
		student c;
		student temp = new student();

		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.chi = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.mat = Integer.parseInt(tempVar4);
			}
			p1.tol = p1.chi + p1.mat;
			if (i == 0)
			{
				head = p2 = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
		}
		p2.next = null;

		p = head;
		temp.tol = 0;
		a = b = c = temp;
		while (p != null)
		{
			if (p.tol > a.tol)
			{
				c = b;
				b = a;
				a = p;
			}
			else if (p.tol > b.tol)
			{
				c = b;
				b = p;
			}
			else if (p.tol > c.tol)
			{
				c = p;
			}
			p = p.next;
		}

		System.out.printf("%d %d\n",a.num,a.tol);
		System.out.printf("%d %d\n",b.num,b.tol);
		System.out.printf("%d %d\n",c.num,c.tol);
	}

}

