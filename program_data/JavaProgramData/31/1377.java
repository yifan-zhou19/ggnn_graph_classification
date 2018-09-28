public class S
{
	public String xuehao = new String(new char[200]);
	public String xingming = new String(new char[200]);
	public char xingbie;
	public int nianling;
	public float defen;
	public String dizhi = new String(new char[200]);
	public S next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		S p1;
		S p2;
		S head;
		head = new S();
		p1 = head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.xuehao = tempVar.charAt(0);
		}
		head.next = null;
		while (p1.xuehao.charAt(0) != 'e')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.xingming = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				p1.xingbie = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.nianling = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.defen = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.dizhi = tempVar6.charAt(0);
			}
			p2 = new S();
			p2.next = p1;
			p1 = p2;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.xuehao = tempVar7.charAt(0);
			}
		}
		while (p1.next != null)
		{
			System.out.printf("%s %s %c %d %g %s\n",p1.next.xuehao,p1.next.xingming,p1.next.xingbie,p1.next.nianling,p1.next.defen,p1.next.dizhi);
			p1 = p1.next;
		}
		return 0;
	}





}

