public class student
{
	public String information = new String(new char[100]);
 public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student creat()
	{
		student head;
	 student p1;
	 student p2;
	 n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p1 = p2 = (student)malloc(LEN);
	 p1.information = new Scanner(System.in).nextLine();
	 while (strcmp(p1.information,"end") != 0)
	 {
		 n = n + 1;
	  if (n == 1)
	  {
		  p1.next = null;
	  }
	  else
	  {
		  p1.next = p2;
		  p2 = p1;
	  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  p1 = (student)malloc(LEN);
	  p1.information = new Scanner(System.in).nextLine();
	 }
	 head = p2;
	 return (head);
	}
	public static void print(student p)
	{
		do
		{
			System.out.printf("%s\n",p.information);
			p = p.next;
		}while (p != null);
	}
	public static void Main()
	{
		student head;
		head = creat();
		print(head);
	}
}
