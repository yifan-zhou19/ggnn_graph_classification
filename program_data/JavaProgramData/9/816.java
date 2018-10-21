public class f
{
	public String id;
	public String id_ = new String(new char[11]);
	public int age;
	public f next;
}
public class in
{
	public f old;
	public f young;
	public int num;
}
		p1 = p,j = 0;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int num_;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		f p2;
		f p3;
		in p1;
		in cr = new in(int x); //?????????????????????
		p1 = cr(n);
		p3 = p1.young;
		p2 = p1.old;
		num_ = p1.num;
		void sort(struct f * p,int x);
		sort(p2, num_);
		while (p2 != null)
		{
			System.out.printf("%s\n",p2.id);
			p2 = p2.next;
		}
		while (p3 != null)
		{
			System.out.printf("%s\n",p3.id);
			p3 = p3.next;
		}
	}
	public static in cr(int x)
	{
		f head1;
		f head2;
		f p;
		int k = 0;
		in p3;
		p3 = new in();
		head1 = new f();
		head2 = new f();
		p3.old = head1; //??????????????
		p3.young = head2;
		f p4;
		f p5;
		f p6;
		f p7;
		p4 = head1;
		p6 = head2;
		int i;
		for (i = 0;i < x;i++)
		{
			p = new f();
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p.id_ = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p.age = Integer.parseInt(tempVar2);
			}
			if (p.age >= 60) //????????????
			{
				p4.age = p.age;
				p4.id = p.id_;
				p5 = p4;
				p4 = new f();
				p5.next = p4;
				k++;
			}
			else //??????????????
			{
				p6.age = p.age;
				p6.id = p.id_;
				p7 = p6;
				p6 = new f();
				p7.next = p6;
			}
		}
		p5.next = null;
		p7.next = null;
		p3.num = k;
		return p3; //?????
	}
	public static void sort(f p, int x)
	{
		int i;
		int j;
		int k1;
		String k2;
		f p1;
		f p2;
		for (i = 0;i < x - 1;i++) //???????????
		{
			for (p1 = p,j = 0;i + j < x - 1;j++,p1 = p1.next)
			{
				p2 = p1.next;
				if (p2.age > p1.age)
				{
					k1 = p2.age;
					p2.age = p1.age;
					p1.age = k1;
					k2 = p2.id;
					p2.id = p1.id;
					p1.id = k2;
				}
			}
		}
	}









}

