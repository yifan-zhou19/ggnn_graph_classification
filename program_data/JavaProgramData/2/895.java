package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int x;
	//		char z[10];
	//		struct book *next;
	//	}
	//	*p1,*p2,*p,*head,*t;
		int i;
		int n;
		int max = 0;
		int j;
		int k;
		int l;
		int[] y = new int[400];
		int q;
		char u;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	p1 = p2 = head = new book();
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.x = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.z = tempVar3;
		}
		y[i] = p1.z.length();
		p1 = new book();
		p2.next = p1;
		p2 = p1;
	}
	p = head;
	for (i = 0;i < n - 1;i++)
	{
	for (j = 0;j < y[i];j++)
	{
		q = 1;
		t = p.next;
		for (k = i + 1;k < n;k++)
		{
			for (l = 0;l < y[k];l++)
			{
				if (p.z[j] == t.z[l])
				{
					q++;
				}
			}
				t = t.next;
		}
		if (q > max)
		{
			max = q;
			u = p.z[j];
		}
	}
	p = p.next;
	}
	System.out.printf("%c\n%d\n",u,max);
	p = head;
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < y[i];j++)
		{
			if (u == p.z[j])
			{
			System.out.printf("%d\n",p.x);
			break;
			}
		}
			p = p.next;
	}
	}

}

