public class patient
{
	public String id = new String(new char[11]);
  public int age;
  public int seq;
  public patient next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int n1 = 0;
		int n2 = 0;
		int i;
		int j;
		int m;
		int at;
	   String id = new String(new char[10]);
	   patient head1;
	   patient head2;
	   patient p11;
	   patient p12;
	   patient p21;
	   patient p22;
	   patient t;
	   patient q;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   head1 = null;
	   head2 = null;
	   for (i = 0;i < n;i++)
	   {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 id = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 at = Integer.parseInt(tempVar3);
		 }
		 if (at >= 60)
		 {
			 if (head1 == null)
			 {
			 head1 = new patient();
		 head1.id = id;
		 head1.age = at;
			 head1.next = null;
			 }
		else
		{
			p11 = new patient();
			  p11.age = at;
			  p11.id = id;
			   for (t = head1,q = t;t != null;q = t,t = t.next)
			   {
			  if (t.age < at && t != head1)
			  {
				  q.next = p11;
			  p11.next = t;
				  break;
			  }
			 if (t.age < at && t == head1)
			 {

				  p11.next = head1;
			  head1 = p11;
			  break;
			 }
			   }
		  if (t == null)
		  {
				q.next = p11;
				p11.next = null;
		  }
		}
		 }

		 if (at < 60)
		 {
			 if (head2 == null)
			 {
			 head2 = new patient();
		 head2.id = id;
		 head2.age = at;
		 head2.next = null;
		 p22 = head2;
			 }
			else
			{
			  p21 = new patient();
			  p21.age = at;
		  p21.id = id;
			  p22.next = p21;
			  p21.next = null;
			  p22 = p21;
			}
		 }
	   }

	   for (t = head1,q = t;t != null;q = t,t = t.next)
	   {
		   ;
	   }
	   q.next = head2;
	   for (t = head1;t.next != null;t = t.next)
	   {
		System.out.printf("%s\n",t.id);
	   }
	   System.out.printf("%s",t.id);
	}
}

