public class patient
{
 public String id = new String(new char[20]);
 public int age;
 public patient next;
}

package <missing>;

public class GlobalMembers
{
	public static patient head;
	public static patient p1;
	public static patient p2;
	public static patient order(int n)
	{
	 int i;
	 int j;
	 int t;
	 String a = new String(new char[20]);
	 for (i = 0;i < n - 1;i++)
	 {
	  p1 = head;
	  p2 = p1.next;
	   for (j = 0;j < n - 1 - i;j++)
	   {
		if (p2.age >= 60 && p1.age < p2.age)
		{
		   t = p1.age;
		   p1.age = p2.age;
		   p2.age = t;
		   a = p1.id;
		   p1.id = p2.id;
		   p2.id = a;
		}
		 p1 = p1.next;
		 p2 = p2.next;
	   }
	 }
	return head;
	}
	public static void Main()
	{
	 int n;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 p1 = head = new patient();
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  p1.id = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  p1.age = Integer.parseInt(tempVar3);
	  }
	  p2 = p1;
	  p1 = new patient();
	  p2.next = p1;
	 }
	 p2.next = null;
	 p1 = order(n);
	 while (p1 != null)
	 {
	  System.out.printf("%s\n",p1.id);
	  p1 = p1.next;
	 }
	}
}

