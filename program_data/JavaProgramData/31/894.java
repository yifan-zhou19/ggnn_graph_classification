public class student
 {
		public String all = new String(new char[100]);

		public student next;
 }

package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		   int k;
		   int a = 0;
		   student p;
		   student head;
		   student p1;
		   student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   p1 = p2 = (student)malloc(n);
		   head = null;
		   k = 0;
		   for (k = 0;;k++)
		   {
		   p1.all = new Scanner(System.in).nextLine();
		   a++;
		   if ((p1.all).charAt(0) != 'e')
		   {
								 if (a == 1)
								 {
								  p1.next = null;
								 }
									   else
									   {
									   p1.next = p2;
									   }
									   p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
									   p1 = (student)malloc(n);
		   }

								else
								{
									 head = p2;
									 break;
								}
		   }
									 p = head;
									 while (p != null)
									 {
												   System.out.println(p.all);
												   p = p.next;
									 }

	 }


}
