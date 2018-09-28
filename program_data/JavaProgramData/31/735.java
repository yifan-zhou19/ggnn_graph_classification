public class student
{
	public String id = new String(new char[100]);
   public String name = new String(new char[100]);
   public char sex;
   public int age;
   public String score = new String(new char[100]);
   public String adress = new String(new char[100]);
   public student next;
   public student formal;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int Main()
	{
		student head;
		student p1;
		student p2;
	   n = 0;
	   int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	   p1 = p2 = (student)malloc(len);
	   head = null;
	   while (0 == 0)
	   {
		   n = n + 1;

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   p1.id = tempVar.charAt(0);
	   }
	   if (p1.id.charAt(0) == 'e')
	   {
		   break;
	   }
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
		   p1.adress = tempVar6.charAt(0);
	   }
	   if (n == 1)
	   {
		   head = p1;
	   p1.formal = null;
	   }
	   else
	   {
		   p2.next = p1;
	   p1.formal = p2;
	   }
	   p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   p1 = (student) malloc(len);

	   }
		p2.next = null;
	   while (0 == 0)
	   {
		   System.out.printf("%s %s %c %d %s %s\n",p2.id,p2.name,p2.sex,p2.age,p2.score, p2.adress);
	   if (p2.formal == null)
	   {
		   break;
	   }
	   p2 = p2.formal;
	   }
	   return 0;
	}

}

