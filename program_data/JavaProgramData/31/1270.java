public class student
{
	public String num = new String(new char[30]); //???????end??strcpy??
	public String name = new String(new char[30]);
	public char sex;
	public int age;
	public String score = new String(new char[30]); //???????????
		 public String add = new String(new char[30]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student p1; //???????????
	public static student p2;
	public static int n; //????

	public static student creat() //????
	{
		student head = null;
		final String temp = "end";
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			 p1 = p2 = (student)malloc(LEN); // ?????
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}

		while (strcmp(p1.num,temp) != 0) //?????end???

		{
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				p1.sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.age = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.add = tempVar6.charAt(0);
			}
			n = n + 1;
			if (n == 1)
			{
				head = p1; //????
			}
			else
			{

				p2.next = p1;
			}
				p2 = p1;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN); // ?????
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}

		}
		p2.next = null;
		return (head);
	}

	public static student change(student head) //????
	{
		student head1;
		student head2 = null;
		do
		{
			 p2 = null;
			 p1 = head;
			 while (p1.next != null) //?p1????
			 {
				 p2 = p1;
				 p1 = p1.next;
			 }
			 if (head2 == null)
			 {
				 head2 = p1; //?????
				 head1 = head2.next = p2;
			 }
			 head1 = head1.next = p2; //????????
			 p2.next = null;
		}while (head.next != null);
		 return (head2);
	}
	public static void print(student head) //??
	{
	   student p1;
	   p1 = head;
	   while (p1 != null)
	   {
		System.out.printf("%s %s %c %d %s %s\n",p1.num,p1.name,p1.sex,p1.age,p1.score,p1.add);
		p1 = p1.next;
	   }
	   System.out.print("\n");
	}

	public static int Main()
	{
		student head;
		head = creat();
		head = change(head);
		print(head);
		return 0;
	}



}

