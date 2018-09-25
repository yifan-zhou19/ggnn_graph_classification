public class inf
{
	public int num;
	public String name = new String(new char[26]);
	public inf next;
}

package <missing>;

public class GlobalMembers
{
	public static int m;
	public static inf creat()
	{
		inf head;
		inf p1;
		inf p2;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (inf)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		head = null;
		n = 0;
		while (true)
		{
			n++;
			if (n == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
			if (n == m)
			{
				break;
			}
			else
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (inf)malloc(LEN);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.num = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.name = tempVar4.charAt(0);
			}
			}
		}
		p2.next = null;
		return (head);
	}

	public static void count(inf head, int o)
	{
		inf q1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q2,*q3,*q4;
		int q2;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q3;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q4;
		int q4;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * t1;
		q1 = head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q2 = (int)malloc(26 * LEM);
		for (q3 = q2;q3 < q2 + 26;q3++)
		{
			*q3 = 0;
		}
		while (q1 != null)
		{
			for (t1 = q1.name; * t1 != '\0';t1++)
			{
				*(q2 + (*t1 - 'A')) = *(q2 + (*t1 - 'A')) + 1;
			}
			q1 = q1.next;
		}
		q4 = q2;
		for (q3 = q2;q3 < q2 + 26;q3++)
		{
			if (q4 < *q3)
			{
				q4 = q3;
			}
		}
		System.out.printf("%c\n%d\n",q4 - q2 + 'A', q4);
		q1 = head;
		while (q1 != null)
		{
			for (t1 = q1.name; * t1 != '\0';t1++)
			{
				if (*t1 == (q4 - q2 + 'A'))
				{
					System.out.printf("%d\n",q1.num);
				}
			}
			q1 = q1.next;
		}


	}



	public static void Main()
	{
		inf head;
		inf s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		head = creat();
		s = head;
		count(head, m);
	/*	while(s!=NULL)
		{
			printf("%d %s\n",s->num,s->name);
			s=s->next;
		}*/
	}




}

