public class patient
{
	public int age;
	public String id = new String(new char[10]);
	public patient next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a = 0;
		int b = 0;
		patient p1;
		patient p2;
		patient head1 = null;
		patient head2 = null;
		patient q1;
		patient q2;
		patient temp;
		patient last;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (patient)malloc(LEN);
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
			q1 = p1;
				 if (p1.age >= 60)
				 {
				   if (head1 == null)
				   {
					   head1 = p1;
					   p2 = p1;
					   p1.next = null;
				   }
				   else
				   {
					 a = a + 1;
					 temp = head1;
					 last = head1;
					 for (j = 0;j < a;j++)
					 {
						if (p1.age > temp.age)
						{
						  if (j == 0)
						  {
							  p1.next = head1;
							  head1 = p1;
							  break;
						  }
						  else
						  {
							  last.next = p1;
							  p1.next = temp;
							  break;
						  }
						}
					  last = temp;
					  temp = temp.next;
					 }
					 if (j == a)
					 {
						 last.next = p1;
						 p1.next = null;
					 }
				   }
				 }
				 if (p1.age < 60)
				 {
				   if (head2 == null)
				   {
					   head2 = q1;
					   q2 = q1;
					   q1.next = null;
				   }
				   else
				   {
					   b = b + 1;
					   q1.next = null;
					   q2.next = q1;
					   q2 = q1;
				   }
				 }
		}
		p1 = head1;
		q1 = head2;
		for (i = 0;i <= a;i++)
		{
			System.out.printf("%s\n",p1.id);
			p1 = p1.next;
		}
		for (i = 0;i <= b;i++)
		{
			System.out.printf("%s\n",q1.id);
			q1 = q1.next;
		}
	}

}

