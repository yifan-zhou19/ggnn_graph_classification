public class a
{
	public int year;
 public String id = new String(new char[10]);
 public a next;
}

package <missing>;

public class GlobalMembers
{
	public static a create(int n)
	{
		a p1;
		a p2;
		a head;
	int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = (a)malloc(len);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		p1.id = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		p1.year = Integer.parseInt(tempVar2);
	}
	p1.next = null;
	head = p1;
	p2 = p1;
	for (i = 1;i < n;i++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (a)malloc(len);
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		p1.id = tempVar3.charAt(0);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		p1.year = Integer.parseInt(tempVar4);
	}
	p1.next = null;
	p2.next = p1;
	p2 = p1;
	}
	return head;
	}
	public static void Main()
	{
		a head;
		a p;
		a q;
		a[] t = tangible.Arrays.initializeWithDefaultaInstances(100);
		int m;
		int i;
		int j = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		head = create(m);
		p = head;
		for (i = 0;i < m;i++)
		{
			if (p.year >= 60)
			{
				t[j] = p;
				j++;
			}
		p = p.next;
		}
		for (k = 0;k < j - 1;k++)
		{
			for (i = 0;i < j - 1 - k;i++)
			{
				if (t[i].year < t[i + 1].year)
				{
					p = t[i];
				t[i] = t[i + 1];
				t[i + 1] = p;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
				System.out.printf("%s\n",t[i].id);
		}
		p = head;
		j = 0;
		for (i = 0;i < m;i++)
		{
			if (p.year < 60)
			{
				t[j] = p;
				j++;
			}
		p = p.next;
		}
		for (i = 0;i < j;i++)
		{
				System.out.printf("%s\n",t[i].id);
		}
	}


}

