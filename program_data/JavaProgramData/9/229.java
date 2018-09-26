public class ill
{
	public String id = new String(new char[100]);
	public int age;
	public ill next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		ill creat = new ill(int x);
		ill p;
		ill head;
		String[] w = new String[1000];
		String temp1;
		int n;
		int i;
		int j = 0;
		int k;
		int temp;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = creat(n);
		head = p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
			if (p.age >= 60)
			{
				*(q + j) = p.age;
				w[j] = p.id;
				j++;
			}
			p = p.next;
		}
		k = j;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	for (i = 0;i < j - 1;i++)
	{
			if (*(q + i) < *(q + i + 1))
			{
				temp = (q + i);
				*(q + i) = *(q + i + 1);
				*(q + i + 1) = temp;
				temp1 = w[i];
				w[i] = w[i + 1];
				w[i + 1] = temp1;
			}
	}
		for (i = 0;i < j - 1;i++)
		{
			if (*(q + i) < *(q + i + 1))
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto loop;
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%s\n",w[i]);
		}
		p = head;
		for (i = 0;i < n;i++)
		{
			if (p.age >= 60)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto lop;
			}
			else
			{
				System.out.printf("%s\n",p.id);
			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	lop:
	p = p.next;
		}



	}
	public static ill creat(int x)
	{
		ill head;
		ill p1;
		ill p2;
		int i;
		p1 = new ill();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.id = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.age = Integer.parseInt(tempVar2);
		}
		p2 = p1;
		head = p1;
		for (i = 0;i < x;i++)
		{
		p1 = new ill();
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.id = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.age = Integer.parseInt(tempVar4);
		}
		p2.next = p1;
		p2 = p1;
		}
		p2.next = null;
		return (head);
	}
}

