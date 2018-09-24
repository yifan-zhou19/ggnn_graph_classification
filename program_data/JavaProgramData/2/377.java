public class su
{
	public int a;
	public String b = new String(new char[26]);
	public su next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] c = new int[26];
		int i;
		int k;
		int j;
		int l;
		int max;
		int m;
		su p;
		su head;
		su q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			p = new su();
			if (i == 0)
			{
				head = p;
			q = p;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.b = tempVar3.charAt(0);
			}
			k = p.b.length();
				for (j = 0;j < k;j++)
				{
					l = p.b.charAt(j) - 'A';
					c[l] = c[l] + 1;
				}
			}
		   else
		   {
			   q.next = p;
			q = p;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p.a = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p.b = tempVar5.charAt(0);
			}
			k = p.b.length();
				for (j = 0;j < k;j++)
				{
					l = p.b.charAt(j) - 'A';
					c[l] = c[l] + 1;
				}
		   }

		}
		q.next = null;
		max = c[0];
		m = 0;
		for (j = 0;j < 26;j++)
		{
			if (max < c[j])
			{
				max = c[j];
			m = j;
			}

		}
		System.out.printf("%c\n%d\n",m + 'A',max);
		p = head;
		do
		{
			k = p.b.length();
			for (j = 0;j < k;j++)
			{
				if (('A' + m) == p.b.charAt(j))
				{
					System.out.printf("%d\n",p.a);
				}
			}
			p = p.next;
		}while (p != null);





	return 0;
	}
}

