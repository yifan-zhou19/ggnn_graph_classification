public class patient
{
	public String ID = new String(new char[10]);
	public int age;
	public patient next;
}

package <missing>;

public class GlobalMembers
{
	public static patient creat(int n)
	{
		int i;
	  patient head;
	  patient p1;
	  patient p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	   p2 = p1 = (patient)malloc(LEN);
	   head = p1;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   p1.ID = tempVar.charAt(0);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   p1.age = Integer.parseInt(tempVar2);
	   }
	  for (i = 1;i < n;i++)
	  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = (patient)malloc(LEN);
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 p1.ID = tempVar3.charAt(0);
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

	public static int Main()
	{
		int i;
		int j;
		int n;
		String a = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		patient h;
		patient q;
		patient p;
		h = creat(n);
		for (i = 0;i < n;i++)
		{
		 for (q = h;q.next != null;q = q.next)
		 {
		 if (q.next.age >= 60 && q.next.age > q.age)
		 {
			 a = q.ID;
			 q.ID = q.next.ID;
			 q.next.ID = a;
			 j = q.age;
			 q.age = q.next.age;
			 q.next.age = j;
		 }
		 }
		}
		for (p = h;p != null;p = p.next)
		{
		 System.out.printf("%s\n",p.ID);
		}
	}

}

