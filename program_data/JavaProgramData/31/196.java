public class student
{
	   public String information = new String(new char[50]);
	   public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student create_and_reverse = new student();
		void print(struct student * head);
		student head;
		head = create_and_reverse();
		print(head);
		return 0;
	}

	public static student create_and_reverse()
	{
		   student p1;
		   student p2;
		   student head;
		   char[] end = {'e', 'n', 'd', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   p1 = (student)malloc(len);
		   p2 = p1;

		   (p1.information) = new Scanner(System.in).nextLine();
		   for (;;)
		   {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				  p1 = (student)malloc(len);
				  (p1.information) = new Scanner(System.in).nextLine();
				  if (strcmp(p1.information,end))
				  {
												 (p1.next) = p2;
				  }
				  else
				  {
					  head = p2;
					  break;
				  }
				  p2 = p1;
		   }
		   return (head);
	}

	public static void print(student head)
	{
		 student p;
		 p = head;
		 for (;;)
		 {
							   System.out.printf("%s\n",p.information);
							   if ((p.next) == null)
							   {
												  break;
							   }
							   else
							   {
								   p = (p.next);
							   }
		 }
	}
}
