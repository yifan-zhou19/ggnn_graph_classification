public class moncky
{
	public int seq;
	public moncky next;
}
public class monckycircle
{
	public int allnumber;
	public moncky curp;
}

package <missing>;

public class GlobalMembers
{
	public static monckycircle creat(int allnum)
	{
		int i = 1;
		monckycircle p;
		moncky head;
		moncky now;
		p = new monckycircle();
		now = head = new moncky();
		p.allnumber = allnum;
		p.curp = head;
		while (i < allnum)
		{
			now.seq = i;
			now.next = new moncky();
			now = now.next;
			i++;
		}
		now.seq = i;
		now.next = head;
		return p;
	}
	public static void cry_123(monckycircle circlename, int unlucky)
	{
		int i = 1;
		moncky p;
		moncky aux;
		p = circlename.curp;
		for (i = 1;i != unlucky;i++)
		{
			p = (i == 1?p:p.next);
		}
		aux = p.next.next;

		p.next = aux;
		circlename.allnumber--;
		circlename.curp = p.next;
	}

	public static int Main()
	{
		int n_all;
		int n_unlucky;
		monckycircle circlename;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n_all = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n_unlucky = Integer.parseInt(tempVar2);
		}
		while (n_all != 0)
		{
			if (n_unlucky == 1)
			{
				System.out.printf("%d\n",n_all);
			}
			else
			{
				circlename = creat(n_all);
				while (circlename.allnumber != 0)
				{
					cry_123(circlename, n_unlucky);
				}
				System.out.printf("%d\n",circlename.curp.seq);

			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n_all = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n_unlucky = Integer.parseInt(tempVar4);
			}
		}
		return 0;
	}





}

