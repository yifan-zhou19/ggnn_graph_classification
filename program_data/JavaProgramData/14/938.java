public class info
{
		public String num = new String(new char[10]);
		public int chn;
		public int math;
		public info next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int all;
	public static info setup()
	{
		info head;
		info p1;
		info p2;
		n = 0;
		while (n < all)
		{
			p1 = new info();
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p1.chn = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.math = Integer.parseInt(tempVar3);
			}
			n += 1;
			if (n == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
		}
		p2.next = null;
		return (head);
	}
	public static void Main()
	{

		info p;
		int i;
		int first = 0;
		int second = 0;
		int third = 0;
		String fnum = new String(new char[10]);
		String snum = new String(new char[10]);
		String tnum = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			all = Integer.parseInt(tempVar);
		}
		p = setup();
		do
		{
			if (TOTAL > first)
			{
				third = second;
				second = first;
				first = TOTAL;
				tnum = "";
				tnum += snum;
				snum = "";
				snum += fnum;
				fnum = "";
				fnum += p.num;
			}
			else if (TOTAL > second)
			{
				third = second;
				second = TOTAL;
				tnum = "";
				tnum += snum;
				snum = "";
				snum += p.num;
			}
			else if (TOTAL > third)
			{
				third = TOTAL;
				tnum = "";
				tnum += p.num;
			}
			p = p.next;
		}while (p != null);
		System.out.printf("%s %d\n%s %d\n%s %d\n",fnum,first,snum,second,tnum,third);
	}
}

