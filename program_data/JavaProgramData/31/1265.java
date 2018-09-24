public class stu
{
	public String id = new String(new char[20]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public String score = new String(new char[20]);
	public String address = new String(new char[20]);
	public stu next;
	public stu former;
}

package <missing>;

public class GlobalMembers
{
	public static stu cr()
	{
		stu head;
		stu end;
	 stu p1;
	 stu p2;
	 int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p1 = p2 = (stu)malloc(LEN);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 p1.id = tempVar.charAt(0);
	 }
	 if (strcmp(p1.id,"end") != 0)
	 {
		String tempVar2 = ConsoleInput.scanfRead();
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
			p1.address = tempVar6.charAt(0);
		}
		 head = null;
			 while (true)
			 {
			 i++;
			 if (i == 1)
			 {
				 head = p1;
				 p1.former = null;
			 }
			 else
			 {
				 p2.next = p1;
				 p1.former = p2;
			 }
			  p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			  p1 = (stu)malloc(LEN);
			 String tempVar7 = ConsoleInput.scanfRead();
			 if (tempVar7 != null)
			 {
				 p1.id = tempVar7.charAt(0);
			 }
			  if (strcmp(p1.id,"end") == 0)
			  {
				  break;
			  }
				// printf("%s",p1->id);
			  String tempVar8 = ConsoleInput.scanfRead();
			  if (tempVar8 != null)
			  {
				  p1.name = tempVar8.charAt(0);
			  }
			  String tempVar9 = ConsoleInput.scanfRead(" ", 1);
			  if (tempVar9 != null)
			  {
				  p1.sex = tempVar9.charAt(0);
			  }
			  String tempVar10 = ConsoleInput.scanfRead(" ");
			  if (tempVar10 != null)
			  {
				  p1.age = Integer.parseInt(tempVar10);
			  }
			  String tempVar11 = ConsoleInput.scanfRead(" ");
			  if (tempVar11 != null)
			  {
				  p1.score = tempVar11.charAt(0);
			  }
			  String tempVar12 = ConsoleInput.scanfRead(" ");
			  if (tempVar12 != null)
			  {
				  p1.address = tempVar12.charAt(0);
			  }
			 }


			  p2.next = null;
			  end = p2;
			  return (end);

	 }
	 else
	 {
		 return (null);
	 }
	}

	public static void print(stu end)
	{


		stu q = end; // printf("%s",end->id);

		while (q != null && end != null)
		{
			System.out.printf("%s %s %c %d %s %s\n",q.id,q.name,q.sex,q.age,q.score,q.address);
			q = q.former; //printf("%s",q->id);
		}
	//printf("%s",q->id);
	}

	public static int Main()
	{
		stu p;
	  p = cr();

	print(p);
	return 0;
	}

}

