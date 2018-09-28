public class patient
{
	   public String id = new String(new char[11]);
	   public int age;
	   public patient next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		patient head;
		patient create = new patient(int n);
		void sort(struct patient * head);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = create(n);
		sort(head);

		return 0;
	}

	public static patient create(int n)
	{
		   int i;
		   patient head;
		   patient p1;
		   patient p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   p1 = (patient)malloc(len);
		   head = p1;
		   p2 = p1;
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
		   for (i = 1;i < n;i++)
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
						   (p2.next) = p1;
						   p2 = p1;
						   if (i == (n - 1))
						   {
						   (p1.next) = null;
						   }
		   }
		   return head;
	}

	public static void sort(patient head)
	{
		 int m;
		 patient p1;
		 patient p2;

		 for (;;)
		 {
				p1 = head;
				p2 = head;
				m = 0;
				for (;;)
				{
					   if ((p1.age) > m)
					   {
						   m = (p1.age);
					   }
					   if ((p1.next) == null)
					   {
						   break;
					   }
					   else
					   {
						   p1 = (p1.next);
					   }
				}
				if (m < 60)
				{
					break;
				}
				p1 = head;
				for (;;)
				{
					   if ((p1.age) == m)
					   {
									   System.out.printf("%s\n",p1.id);
									   if (p1 == head)
									   {
										   head = (p1.next);
									   }
									   else
									   {
										   (p2.next) = (p1.next);
									   }
									   break;
					   }
					   else
					   {
						   if (p1 != p2)
						   {
									 p2 = p1;
									 p1 = (p1.next);
						   }
						   else
						   {
							   p1 = (p1.next);
						   }
					   }
				}
		 }
		 p1 = head;
		 for (;;)
		 {
				System.out.printf("%s\n",p1.id);
				if ((p1.next) == null)
				{
					break;
				}
				else
				{
					p1 = (p1.next);
				}
		 }
	}
}

