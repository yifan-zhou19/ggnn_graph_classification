public class a
{
public a back;
public String a = new String(new char[20]);
public String b = new String(new char[20]);
public char c;
public String d = new String(new char[20]);
public String e = new String(new char[20]);
public String f = new String(new char[20]);
public a next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		a pHeader;
		a pEnd;
		a p1;
		a p;
		pHeader = new a();
		pHeader.back = null;
		p1 = pHeader;
		for (;;)
		{
			p = new a();
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p.a = tempVar.charAt(0);
			}
			if (p.a.charAt(0) == 'e')
			{
				pEnd = p;
				p.back = p1;
				p1.next = p;
				p.next = null;
				break;
			}
			p.back = p1;
			p1.next = p;
			p1 = p;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.b = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				p.c = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.d = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p.e = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p.f = tempVar6.charAt(0);
			}
		}
		System.out.printf("%s %s %c %s %s %s\n",p1.a,p1.b,p1.c,p1.d,p1.e,p1.f);
		p1.next = null;
		for (;;)
		{
			System.out.printf("%s %s %c %s %s %s\n",p1.back.a,p1.back.b,p1.back.c,p1.back.d,p1.back.e,p1.back.f);
			p1 = p1.back;
			p1.next = null;
			if (p1.back == null)
			{
				break;
			}
		}
	}

}

