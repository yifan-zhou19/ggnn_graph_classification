public class student
{
 public String xuehao = new String(new char[20]);
 public String name = new String(new char[30]);
 public char sex;
 public int age;
 public String score = new String(new char[20]);
 public String adress = new String(new char[40]);
 public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void insert(student pheader)
	{
	 student p;
	 p = new student();
	 p.next = pheader.next;
	 pheader.next = p;
	}
	public static int Main()
	{
	 student pheader;
	 student p;
	 pheader = new student();
	 pheader.next = null;
	 while (9 != 0)
	 {
	  insert(pheader);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  pheader.next.xuehao = tempVar.charAt(0);
	  }
	  if (pheader.next.xuehao.charAt(0) == 'e')
	  {
		break;
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  pheader.next.name = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ", 1);
	  if (tempVar3 != null)
	  {
		  pheader.next.sex = tempVar3.charAt(0);
	  }
	  String tempVar4 = ConsoleInput.scanfRead(" ");
	  if (tempVar4 != null)
	  {
		  pheader.next.age = Integer.parseInt(tempVar4);
	  }
	  String tempVar5 = ConsoleInput.scanfRead(" ");
	  if (tempVar5 != null)
	  {
		  pheader.next.score = tempVar5.charAt(0);
	  }
	  String tempVar6 = ConsoleInput.scanfRead(" ");
	  if (tempVar6 != null)
	  {
		  pheader.next.adress = tempVar6.charAt(0);
	  }
	 }
	 p = pheader.next;
	 while (9 != 0)
	 {
	   p = p.next;
	   System.out.printf("%s %s %c %d %s %s\n",p.xuehao,p.name,p.sex,p.age,p.score,p.adress);
	   if (p.next == null)
	   {
		 break;
	   }
	 }
	 while (9 != 0)
	 {
	 if (pheader.next.next == null)
	 {
	   break;
	 }
	 p = pheader.next;
	 pheader.next = p.next;
	 p = null;
	 }
	 pheader.next = null;
	 pheader = null;
	}



}

