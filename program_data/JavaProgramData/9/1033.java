public class patient
{
	public String id = new String(new char[10]);
	public int age;
	public patient next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static patient creat(int x)
	{
		patient head;
		patient p1;
		patient p2;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (patient)malloc(LEN);
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
		head = null;
		while (n != x)
		{
			n = n + 1;
			if (n == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (patient)malloc(LEN);
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
		}
		p2.next = null;
		return (head);
	}
	public static void Main()
	{
		int m;
		int i;
		int j;
		int v;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b;
		int b;
		patient head;
		patient p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (int)malloc(100 * (Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		head = creat(m);
		p1 = head;
		for (i = 0;i < m;i++)
		{
			*(b + i) = p1.age;
			p1 = p1.next;
		}
		for (j = 0;j < m - 1;j++)
		{
		   for (i = 0;i < m - 1 - j;i++)
		   {
			   if (*(b + i) < *(b + i + 1))
			   {
				   t = (b + i);
				   *(b + i) = *(b + i + 1);
				   *(b + i + 1) = t;
			   }
		   }
		}
		for (i = 0;i < m;i++)
		{
			if (*(b + i) < 60)
			{
			v = i;
			break;
			}
		}
		p1 = head;
		for (j = 0;j < v;j++)
		{
			p1 = head;
			while (p1 != null)
			{
				if (p1.age == *(b + j) && (j == 0 || *(b + j) != *(b + j - 1)))
				{
					System.out.printf("%s\n",p1.id);
				}
				p1 = p1.next;
			}
		}
		p1 = head;
		while (p1 != null)
		{
			if (p1.age < 60)
			{
				System.out.printf("%s\n",p1.id);
			}
			p1 = p1.next;
		}
	}
}

