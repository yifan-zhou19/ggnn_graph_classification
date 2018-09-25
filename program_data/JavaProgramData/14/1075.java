public class info
{
	public String id = new String(new char[10]);
	public float ch;
	public float ma;
	public float tot;
	public info next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		info head;
		info pre;
		info p;
		info t;
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = pre = p = LEN;
		for (i = 0;i < 2;i++)
		{
			p.tot = 0F;
			p = LEN;
			pre.next = p;
			pre = p;
		}
		p.tot = 0F;
		p.next = null;
		for (i = 0;i < n;i++)
		{
			p = LEN;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.ch = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.ma = Float.parseFloat(tempVar4);
			}
			p.tot = p.ch + p.ma;
			if (p.tot > head.tot)
			{
				p.next = head;
				head = p;
			}
			else
			{
				pre = head;
				 t = head.next;
				for (j = 1;j <= 2;j++)
				{
				if (p.tot > t.tot)
				{
					pre.next = p;
					p.next = t;
					break;
				}
				pre = t;
				t = t.next;
				}

			}
		}
			p = head;
			for (i = 0;i < 3;i++)
			{
			 System.out.printf("%s %g\n",p.id,p.tot);
			 p = p.next;
			}

	}
}

