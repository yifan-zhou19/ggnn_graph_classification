public class student
{
	public String number = new String(new char[20]);
	public String name = new String(new char[20]);
	public char c;
	public int age;
	public float score;
	public String address = new String(new char[30]);
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
		  int m;
		  n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  p1 = p2 = (student)malloc(LEN);
		  head = null;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  p1.number = tempVar.charAt(0);
		  }
		  for (m = 0;;m++)
		  {
		  if (strcmp(p1.number,"end") != 0)
		  {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				p1.c = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.age = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.score = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.address = tempVar6.charAt(0);
			}
			  n = n + 1;
			  if (n == 1)
			  {
				  head = p1;
			  }
			  else
			  {
				  p2.next = p1;
			  }
			  p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			  p1 = (student)malloc(LEN);
		  }
		  else
		  {
			  break;
		  }
		  String tempVar7 = ConsoleInput.scanfRead();
		  if (tempVar7 != null)
		  {
			  p1.number = tempVar7.charAt(0);
		  }
		  }
		  p2.next = null;
		  return (head);
	  }
	  public static student del(student head, tangible.RefObject<String> str)
	  {
		  student p1;
		  student p2;
		  p1 = head;
		  while (strcmp(str.argValue,p1.number) != 0 && p1.next != null)
		  {
			  p2 = p1;
			  p1 = p1.next;
		  }
		  if (strcmp(str.argValue,p1.number) == 0)
		  {
			  if (p1 == head)
			  {
				  head = p1.next;
			  }
			  else
			  {
				  p2.next = p1.next;
			  }
			  n = n - 1;
		  }
		  return (head);

	  }
	  public static void Main()
	  {
		  student head;
		  student p1;
		  head = creat();

			   while (head != null)
			   {
				   p1 = head;
				   while (p1.next != null)
				   {
					   p1 = p1.next;
				   }
				   System.out.printf("%s %s %c %d %g %s\n",p1.number,p1.name,p1.c,p1.age,p1.score,p1.address);
			   tangible.RefObject<String> tempRef_number = new tangible.RefObject<String>(p1.number);
				   head = del(head, tempRef_number);
				   p1.number = tempRef_number.argValue;
			   }
	  }







}

