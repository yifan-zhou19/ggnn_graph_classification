//???????

public class data
{

public String a = new String(new char[20]);
public int b;
public int c;
public String d = new String(new char[10]);
public String e = new String(new char[10]);
public int f;
public int g;
public data next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		data head;
		data p;
		data pp;
		head = new data();
		p = head;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			pp = new data();
			pp.g = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pp.a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pp.b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				pp.c = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				pp.d = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				pp.e = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				pp.f = Integer.parseInt(tempVar7);
			}
			if (pp.b > 80 && pp.f > 0)
			{
				pp.g = pp.g + 8000;
			}
			if (pp.b > 85 && pp.c > 80)
			{
				pp.g = pp.g + 4000;
			}
			if (pp.b > 90)
			{
				pp.g = pp.g + 2000;
			}
			if (pp.b > 85 && pp.e.charAt(0) == 'Y')
			{
				pp.g = pp.g + 1000;
			}
			if (pp.c > 80 && pp.d.charAt(0) == 'Y')
			{
				pp.g = pp.g + 850;
			}
			p.next = pp;
			p = pp;
		}
		p = head.next;
		data x;
		int max = 0;
		int zz = 0;

		for (i = 0;i < n;i++)
		{
			if (p.g > max)
			{
				max = p.g;
				x = p;
			}
			zz = zz + p.g;
			p = p.next;
		}

		System.out.printf("%s\n",x.a);
		System.out.printf("%d\n",x.g);
		System.out.printf("%d\n",zz);
	}
}

