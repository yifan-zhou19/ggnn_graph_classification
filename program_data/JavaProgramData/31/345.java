public class s
{
public String xh = new String(new char[50]);
public String xm = new String(new char[55]);
public char xb;
public int nl;
public String df = new String(new char[50]);
public String dz = new String(new char[50]);
public s next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	s head;
	s p1;
	s p2;
	s p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p2 = (s)malloc(len);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		p2.xh = tempVar.charAt(0);
	}
	p2.next = null;
	while (strcmp(p2.xh,"end") != 0)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		p2.xm = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar3 != null)
	{
		p2.xb = tempVar3.charAt(0);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		p2.nl = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		p2.df = tempVar5.charAt(0);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		p2.dz = tempVar6.charAt(0);
	}
	head = p2;
	p1 = p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p2 = (s)malloc(len);
	String tempVar7 = ConsoleInput.scanfRead();
	if (tempVar7 != null)
	{
		p2.xh = tempVar7.charAt(0);
	}
	p2.next = p1;
	}
	p = head;
	while (p != null)
	{
		System.out.printf("%s %s %c %d %s %s\n",p.xh,p.xm,p.xb,p.nl,p.df,p.dz);
	p = p.next;
	}


	}
}

