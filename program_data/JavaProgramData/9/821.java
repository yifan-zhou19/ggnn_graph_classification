public class patient
{

	public String id = new String(new char[10]);
	public int age;
	public patient next;
}

package <missing>;

public class GlobalMembers
{
	public static patient creat(int n)
	{
		patient head;
		patient p1;
		patient p2;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (patient)malloc(len);
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
		p1.next = null;
		head = p1;
		p2 = p1;
		i = 1;
		do
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (patient)malloc(len);
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
			p1.next = null;
			i++;
			p2.next = p1;
			p2 = p1;
		}while (i < n);
		return (head);
	}

	public static patient tiao(patient head, int n)
	{
		patient p1;
		int t;
		int i;
		String s = new String(new char[10]);
		p1 = head;
	   for (i = 0;i < n;i++)
	   {
		   p1 = head;
		do
		{
			if (p1.age < (p1.next).age && (p1.next).age >= 60)
			{
				t = p1.age;
				p1.age = (p1.next).age;
				(p1.next).age = t;
				s = p1.id;
				p1.id = (p1.next).id;
				(p1.next).id = s;
			}
			p1 = p1.next;
		}while (p1.next != null);
	   }

		return (head);
	}

	public static void print(patient head)
	{
		patient p;
		p = head;

		do
		{
			System.out.printf("%s\n",p.id);
			p = p.next;
		}while (p != null);
	}

	public static void Main()
	{
		patient head;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(n);
		head = tiao(head, n);
		print(head);
	}

}

