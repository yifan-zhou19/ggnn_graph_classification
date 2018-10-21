public class student
{
	   public String num = new String(new char[100]);
	   public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  student head;
		  student p1;
		  student p2;
		  n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  p1 = p2 = (student)malloc(LEN);
		  p1.num = new Scanner(System.in).nextLine();

		  while (p1.num.charAt(0) != 'e')
		  {
		  n = n + 1;
		  if (n == 1)
		  {
			  p1.next = null;
		  }
		  else
		  {
			  p1.next = p2;
		  }
		  p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  p1 = (student)malloc(LEN);
		  p1.num = new Scanner(System.in).nextLine();
		  }
		  head = p2;
		  do
		  {
				  System.out.printf("%s\n",head.num);
				  head = head.next;
		  }while (head != null);

	}


}
