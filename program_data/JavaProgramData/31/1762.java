public class student
{
	   public String ID = new String(new char[10]);
	   public String name = new String(new char[20]);
	   public char s;
	   public int age;
	   public String score = new String(new char[10]);
	   public String ad = new String(new char[20]);
	   public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student head;
		int n;
		int i;
		int j;
		n = 0;
		head = null;
		student p1;
		while (true)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			  p1 = (student)malloc(len);
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  p1.ID = tempVar.charAt(0);
			  }
			  if (p1.ID.charAt(0) == 'e' && p1.ID.charAt(1) == 'n' && p1.ID.charAt(2) == 'd')
			  {
				  break;
			  }
			  String tempVar2 = ConsoleInput.scanfRead(" ");
			  if (tempVar2 != null)
			  {
				  p1.name = tempVar2.charAt(0);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			  if (tempVar3 != null)
			  {
				  p1.s = tempVar3.charAt(0);
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
				  p1.ad = tempVar6.charAt(0);
			  }
			  n++;
			  p1.next = head;
			  head = p1;
		}
		p1 = head;
		while (p1 != null)
		{
			System.out.printf("%s %s %c %d %s %s\n",p1.ID,p1.name,p1.s,p1.age,p1.score,p1.ad);
			p1 = p1.next;
		}

	}

}

