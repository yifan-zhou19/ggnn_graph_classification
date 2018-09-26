public class stu
{
	public String name = new String(new char[24]);
 public int score;
 public int ass;
 public char pos;
 public char west;
 public int paper;
 public int fel;
}

package <missing>;

public class GlobalMembers
{
	public static int f(stu q)
	{
		int z = 0;
	 if (q.score > 80 && q.paper > 0)
	 {
		 z = z + 8000;
	 }
	 if (q.score > 85 && q.ass > 80)
	 {
		 z = z + 4000;
	 }
	 if (q.score > 90)
	 {
		 z = z + 2000;
	 }
	 if (q.score > 85 && q.west == 'Y')
	 {
		 z = z + 1000;
	 }
	 if (q.ass > 80 && q.pos == 'Y')
	 {
		 z = z + 850;
	 }
	 return (z);
	}
	public static void Main()
	{
		stu p;
	 int n;
	 int i;
	 int m = 0;
	 int t = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	 p = (stu)malloc(n * sizeof(stu));
	 for (i = 0;i < n;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 (p + i).name = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 (p + i).score = Integer.parseInt(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead(" ");
		 if (tempVar4 != null)
		 {
			 (p + i).ass = Integer.parseInt(tempVar4);
		 }
		 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar5 != null)
		 {
			 (p + i).pos = tempVar5.charAt(0);
		 }
		 String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar6 != null)
		 {
			 (p + i).west = tempVar6.charAt(0);
		 }
		 String tempVar7 = ConsoleInput.scanfRead(" ");
		 if (tempVar7 != null)
		 {
			 (p + i).paper = Integer.parseInt(tempVar7);
		 }
	  (p + i).fel = f(p + i);
	   t = t + (p + i).fel;
	 }
	 for (i = 1;i < n;i++)
	 {
	  if ((p + i).fel > (p + m).fel)
	  {
		  m = i;
	  }
	 }
	 System.out.printf("%s\n%d\n%d",(p + m).name,(p + m).fel,t);
	}





}

