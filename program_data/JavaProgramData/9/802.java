//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class patient
{
	public String id = new String(new char[32]);
	public int age;
	public patient next;
}

package <missing>;

public class GlobalMembers
{
	public static int m = 0;
	public static patient find(patient head)
	{
	   patient p;
	   patient ppre;
	   p = head;
	   while (p != null && p.age >= 60)
	   {
			ppre = p;
			p = p.next;
	   }
		return ppre;
	}
	public static patient create(int n)
	{
		 patient head = null;
		 patient p1;
		 patient p2;
		 patient p0;
		 patient q;
		 int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 p1 = p2 = p0 = (patient)malloc(Len);
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
		 if (p1.age >= 60)
		 {
			 m++;
		 }
		 p1.next = null;
		 head = p1 = p0;
		 p2 = p1;
		 for (i = 1;i < n;i++)
		 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p1 = (patient)malloc(Len);
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
				if (p1.age < 60)
				{
					p1.next = null;
					p2.next = p1;
					p2 = p1;
				}
				else if (p1.age >= 60)
				{
					m++;
					if (head.age < 60)
					{
						head = p1;
						p1.next = p0;
					}
					if (head.age >= 60)
					{
					  p0 = find(head);
					  q = p0.next;
					  p0.next = p1;
					  p1.next = q;
					}
					if ((p0 = find(head)).next == null)
					{
					   p1.next = null;
					   p2.next = p1;
					   p2 = p1;
					}
				}
		 }
			 return head;
	}
	public static patient arrange(patient head)
	{
		patient p1;
		patient p2;
		int t1;
		int i;
		int j;
		String t2 = new String(new char[32]);
		for (j = 0;j < m;j++)
		{
			  p1 = head;
		   for (i = 1;i < m - j;i++)
		   {
			   p2 = p1;
			   p1 = p1.next;
			 if (p2.age < p1.age)
			 {
				  t1 = p1.age;
				  t2 = p1.id;
				  p1.age = p2.age;
				  p1.id = p2.id;
				  p2.age = t1;
				  p2.id = t2;
			 }
		   }
		}
	}
	public static void print(patient head)
	{
		 patient p;
		 p = head;
		 while (p != null)
		 {
			 System.out.printf("%s\n",p.id);
			 p = p.next;
		 }
	}
	public static int Main()
	{
		patient head;
		patient p;
		patient q;
		patient p0;
		int n;
		int m = 0;
		int age;
		String id = new String(new char[32]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = create(n);
		arrange(head);

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


