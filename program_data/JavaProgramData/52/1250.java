public class n
{
	public int pi;
	public n next;
}

package <missing>;

public class GlobalMembers
{
	public static n[] num = tangible.Arrays.initializeWithDefaultnInstances(100);
	public static void Main()
	{
		int[] a = new int[100];
		int i;
		int n;
		int m;
		n p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			num[i].pi = a[i];
		}
		for (i = 0;i < n - 1;i++)
		{
			num[i].next = num[i + 1];
		}
		num[n - 1].next = num[0];
		p = num[n - m];
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",p.pi);
			p = p.next;
		}
		System.out.printf("%d\n",p.pi);
	}

}

