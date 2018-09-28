public class num
{
	public int nianling;
public float defen;
public String q = new String(new char[200]);
public String w = new String(new char[100]);
public char xingbie;
public String xuehao = new String(new char[200]);
public num next;
}

package <missing>;

public class GlobalMembers
{
	public static num crea()
	{
		int i;
	  num head;
	  num p1;
	  num p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	   p1 = p2 = (num)malloc(LEN);
	   head = p1;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   p1.xuehao = tempVar.charAt(0);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   p1.q = tempVar2.charAt(0);
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
		   p1.defen = Float.parseFloat(tempVar5);
	   }
	   String tempVar6 = ConsoleInput.scanfRead(" ");
	   if (tempVar6 != null)
	   {
		   p1.w = tempVar6.charAt(0);
	   }

	head.next = null;
	  for (;;)
	  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = (num)malloc(LEN);
	String tempVar7 = ConsoleInput.scanfRead();
	if (tempVar7 != null)
	{
		p1.xuehao = tempVar7.charAt(0);
	}
	if (p1.xuehao.charAt(0) != 'e')
	{
		String tempVar8 = ConsoleInput.scanfRead();
		if (tempVar8 != null)
		{
			p1.q = tempVar8.charAt(0);
		}
		String tempVar9 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar9 != null)
		{
			p1.xingbie = tempVar9.charAt(0);
		}
		String tempVar10 = ConsoleInput.scanfRead(" ");
		if (tempVar10 != null)
		{
			p1.nianling = Integer.parseInt(tempVar10);
		}
		String tempVar11 = ConsoleInput.scanfRead(" ");
		if (tempVar11 != null)
		{
			p1.defen = Float.parseFloat(tempVar11);
		}
		String tempVar12 = ConsoleInput.scanfRead(" ");
		if (tempVar12 != null)
		{
			p1.w = tempVar12.charAt(0);
		}

		   p1.next = p2;
		   p2 = p1;
	}
	else
	{
		p1.next = p2,p2 = p1;
		break;
	}
	  }
	   return (p1);
	}
	public static void Main()
	{

	int nx;
	int m;
	int m0;
	int tx;
	int qx;
	int q;
	int mxh;
	num hi;
	num p;
	num t;
	hi = crea();
	t = hi.next;
	for (p = t;p != null;p = p.next)
	{
		System.out.printf("%s %s %c %d %g %s\n",p.xuehao,p.q,p.xingbie,p.nianling,p.defen,p.w);
	}
	}


}

