public class student
{
	public String xuehao = new String(new char[10]);
	public String xingming = new String(new char[20]);
	public char xingbie;
	public int nianling;
	public float chengji;
	public String dizhi = new String(new char[20]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		int n = 0;
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.xuehao = tempVar.charAt(0);
			}
			if (p1.xuehao.charAt(0) == 'e')
			{
				head = p2;
			break;
			}
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
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.nianling = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.chengji = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.dizhi = tempVar6.charAt(0);
			}
			if (n == 0)
			{
				p1.next = null;
			}
			else
			{
				p1.next = p2;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			n++;
		}
		return head;
	}
	public static int Main()
	{
		student p;
		p = creat();
		while (p != null)
		{
			System.out.printf("%s %s %c %d %g %s\n",p.xuehao,p.xingming,p.xingbie,p.nianling,p.chengji,p.dizhi);
			p = p.next;
		}
		return 0;
	}


}

