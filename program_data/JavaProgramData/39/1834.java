public class student
{
	public String name = new String(new char[20]);
 public int score;
 public int banji;
 public char ganbu;
 public char xibu;
 public int lunwen;
 public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student create()
	{
		int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 student head;
	 student p1;
	 student p2;
	 int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p1 = p2 = (student)malloc(LEN);
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 p1.name = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 p1.score = Integer.parseInt(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead(" ");
	 if (tempVar4 != null)
	 {
		 p1.banji = Integer.parseInt(tempVar4);
	 }
	 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
	 if (tempVar5 != null)
	 {
		 p1.ganbu = tempVar5.charAt(0);
	 }
	 String tempVar6 = ConsoleInput.scanfRead(" ", 1);
	 if (tempVar6 != null)
	 {
		 p1.xibu = tempVar6.charAt(0);
	 }
	 String tempVar7 = ConsoleInput.scanfRead(" ");
	 if (tempVar7 != null)
	 {
		 p1.lunwen = Integer.parseInt(tempVar7);
	 }
	 head = null;
	 for (i = 1;i < n;i++)
	 {
		 if (i == 1)
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
		 String tempVar8 = ConsoleInput.scanfRead();
		 if (tempVar8 != null)
		 {
			 p1.name = tempVar8.charAt(0);
		 }
		 String tempVar9 = ConsoleInput.scanfRead(" ");
		 if (tempVar9 != null)
		 {
			 p1.score = Integer.parseInt(tempVar9);
		 }
		 String tempVar10 = ConsoleInput.scanfRead(" ");
		 if (tempVar10 != null)
		 {
			 p1.banji = Integer.parseInt(tempVar10);
		 }
		 String tempVar11 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar11 != null)
		 {
			 p1.ganbu = tempVar11.charAt(0);
		 }
		 String tempVar12 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar12 != null)
		 {
			 p1.xibu = tempVar12.charAt(0);
		 }
		 String tempVar13 = ConsoleInput.scanfRead(" ");
		 if (tempVar13 != null)
		 {
			 p1.lunwen = Integer.parseInt(tempVar13);
		 }
	 }
	 p2.next = p1;
	 p1.next = null;
	 return (head);
	}
	public static void Main()
	{
		student p1;
		student p2;
		int max = 0;
		int sum = 0;
		for (p1 = create();p1 != null;p1 = p1.next)
		{
			int total = 0;
			if (p1.score > 80 && p1.lunwen >= 1)
			{
				total = total + 8000;
			}
	  if (p1.score > 85 && p1.banji > 80)
	  {
		  total = total + 4000;
	  }
	  if (p1.score > 90)
	  {
		  total = total + 2000;
	  }
	  if (p1.score > 85 && p1.xibu == 'Y')
	  {
		  total = total + 1000;
	  }
	  if (p1.banji > 80 && p1.ganbu == 'Y')
	  {
		  total = total + 850;
	  }
	  if (total > max)
	  {
		  max = total;
		  p2 = p1;
	  }
	  sum = sum + total;
	 // printf("%d\n",total);
		}
		System.out.printf("%s\n%d\n%d",p2.name,max,sum);
	}

}

