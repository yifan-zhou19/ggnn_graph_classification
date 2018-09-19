public class shu
{
	public int num;
	public String name = new String(new char[26]);
	public shu next;
}

package <missing>;

public class GlobalMembers
{
	public static int[] cishu = new int[26];

	public static shu app(int n)
	{
		int i;
		int len;
		int j;
		shu newnode;
		shu p;
		shu head;
		for (i = 1;i <= n;i++)
		{
			newnode = new shu();
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				newnode.num = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				newnode.name = tempVar2.charAt(0);
			}
			len = newnode.name.length();

			for (j = 0;j < len;j++)
			{
				cishu[newnode.name.charAt(j) - 'A']++;
			}

			if (i == 1)
			{
				head = newnode;
			}
			else
			{
				p.next = newnode;
			}
			p = newnode;
		}
		p.next = null;
		return head;
	}

	public static int max()
	{
		int m = 0;
		int i;
		int x;
		for (i = 0;i < 26;i++)
		{
			if (cishu[i] > m)
			{
				m = cishu[i];
			x = i;
			}
		}
		return x;
	}

	public static int cunzai(String a, int kk)
	{
		int l;
		int i;
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (a[i].equals(kk + 'A'))
			{
				return 1;
			}
		}
		return 0;
	}


	public static int Main()
	{
		int n;
		int kk;
		shu head;
		shu p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		head = app(n);
		kk = max();
		System.out.printf("%c\n%d\n", 'A' + kk, cishu[kk]);

		for (p = head;p != 0;p = p.next)
		{
			if (cunzai(p.name, kk) != 0)
			{
				System.out.printf("%d\n",p.num);
			}
		}
		return 0;
	}





}

