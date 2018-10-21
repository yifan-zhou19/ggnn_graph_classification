public class num
{
	public String juzhen = new String(new char[20]);
	public num next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		num[] number = tangible.Arrays.initializeWithDefaultnumInstances(5);
		num head;
		num p;
		int l;
		int m;
		int i;
		String change = new String(new char[10]);
		for (i = 0;i < 5;i++)
		{
			number[i].juzhen = new Scanner(System.in).nextLine();
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			l = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		change = number[l].juzhen;
		number[l].juzhen = number[m].juzhen;
		number[m].juzhen = change;
		head = number[0];
		p = head;
		number[4].next = null;
		if (l >= 5 || m >= 5)
		{
			System.out.print("error");
		}
		else
		{

		for (i = 0;i < 4;i++)
		{
			number[i].next = number[i + 1];
		}
		do
		{
			System.out.println(p.juzhen);
			p = p.next;
		}while (p != null);
		}
		return 0;
	}
}

