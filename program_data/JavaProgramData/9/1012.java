public class mice
{
	public int wei;
	public String color = new String(new char[100]);
	public mice next;
}

package <missing>;

public class GlobalMembers
{
	public static mice creat(int c)
	{
		mice head;
		mice p1;
		mice p2;
		mice kok;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		kok = (mice)malloc(LEN);
		kok.wei = 0;
		kok.color = "\0";
		int t;
		t = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (mice)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.color = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.wei = Integer.parseInt(tempVar2);
		}
		head = null;
		while (t < c)
		{
			t = t + 1;
			if (t == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
				p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p1 = (mice)malloc(LEN);
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p1.color = tempVar3.charAt(0);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					p1.wei = Integer.parseInt(tempVar4);
				}
			}
		}
		p2.next = p1;
		p2 = p1;
		p2.next = kok;
	return (head);
	}
		public static void mun(mice hoih, int io)
		{
			int i;
			int j;
			int k;
			k = 0;
			mice bt;
			bt = hoih;
			String str = new String(new char[100]);
				for (i = 0;i < io;i++)
				{
			for (j = 0;j < io - i;j++)
			{
				if (hoih.wei < (hoih.next).wei && (hoih.next).wei >= 60)
				{
					k = hoih.wei;
					hoih.wei = (hoih.next).wei;
					(hoih.next).wei = k;
					str = hoih.color;
					hoih.color = (hoih.next).color;
					(hoih.next).color = str;
				}

				hoih = hoih.next;
			}
			hoih = bt;
				}
		return;
		}

	public static void Main()
	{
		int n;
		int h;
		mice creat = new mice(int c);
		mice p;
		mice he;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = creat(n);
		he = p;
		void mun(struct mice * hoih,int io);
		mun(p, n);
		p = he;
			for (h = 0;h < n;h++)
			{
				System.out.printf("%s\n",p.color);
				p = p.next;
			}
	}

}

