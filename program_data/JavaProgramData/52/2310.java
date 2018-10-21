public class shu
{
	public int num;
	public shu next;
}

package <missing>;

public class GlobalMembers
{
	public static shu[] shu = tangible.Arrays.initializeWithDefaultshuInstances(100);
	public static int Main()
	{
		shu head;
		shu p;
		int n;
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				shu[i].num = Integer.parseInt(tempVar3);
			}
		}

		head = shu[n - m];
		for (i = n - m;i < n;i++)
		{
			shu[i].next = shu[i + 1];
		}
		shu[n - 1].next = shu[0];
		for (i = 0;i < n - m - 1;i++)
		{
			shu[i].next = shu[i + 1];
		}
		shu[n - m - 1].next = null;

		p = head;
		{
			System.out.printf("%d",p.num);
				p = p.next;
		   do
		   {
				System.out.printf(" %d",p.num);
				p = p.next;
		   }while (p != null);
		}

		 System.out.print("\n");
	}
}

