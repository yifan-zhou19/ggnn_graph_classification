public class patient
{
	   public String ID = new String(new char[10]);
	   public int age;
	   public patient next;
}

package <missing>;

public class GlobalMembers
{
	public static patient creat()
	{
		   patient head;
		   patient p1;
		   patient p2;
		   int num;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   num = Integer.parseInt(tempVar);
		   }
		   p2 = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   p1 = (patient)malloc(LEN);
		   head = p1;
		   while (num > 0)
		   {
					   p2 = p1;
					   String tempVar2 = ConsoleInput.scanfRead();
					   if (tempVar2 != null)
					   {
						   p1.ID = tempVar2.charAt(0);
					   }
					   String tempVar3 = ConsoleInput.scanfRead(" ");
					   if (tempVar3 != null)
					   {
						   p1.age = Integer.parseInt(tempVar3);
					   }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
					   p1 = (patient)malloc(LEN);
					   p2.next = p1;
					   num--;
		   }
		   p2.next = null;
		   return (head);
	}

	public static patient sort(patient head)
	{
		patient first;
		patient tail;
		patient p_max;
		patient max;
		patient p;
		first = null;
		while (head != null)
		{
			for (p = head,max = head; p.next != null; p = p.next)
			{
				if (p.next.age > max.age && p.next.age >= 60)
				{
					p_max = p;
					max = p.next;
				}
			}
			if (first == null)
			{
				first = max;
				tail = max;
			}
			else
			{
				tail.next = max;
				tail = max;
			}
			if (max == head)
			{
				head = head.next;
			}
			else
			{
				p_max.next = max.next;
			}
		}
		if (first != null)
		{
			tail.next = null;
		}
		head = first;
		return head;
	}

	public static void print(patient head)
	{
		 patient p;
		 p = head;
		 while (p != null)
		 {
					   System.out.printf("%s\n",p.ID);
					   p = p.next;
		 }
	}
	public static int Main()
	{
		patient head;
		int n;
		int i;
		int j;
		head = creat();
		head = sort(head);
		print(head);
	}

	/*?????????????????????????????????????a?b,??b??>a????b>=60????????
	???????????????????????60+???60-?????????????????......*/

}

