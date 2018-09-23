public class stu
{
public int ID;
public int yuwen;
public int shuxue;
public int sum;
public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu creat(int n)
	{
		int i;
	 stu p;
	 stu q;
	 stu head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p = (stu)malloc(LEN);
	 head = q = p;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 p.ID = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 p.yuwen = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 p.shuxue = Integer.parseInt(tempVar3);
	 }
	 for (i = 1;i < n;i++)
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 p = (stu)malloc(LEN);
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   p.ID = Integer.parseInt(tempVar4);
	   }
	   String tempVar5 = ConsoleInput.scanfRead(" ");
	   if (tempVar5 != null)
	   {
		   p.yuwen = Integer.parseInt(tempVar5);
	   }
	   String tempVar6 = ConsoleInput.scanfRead(" ");
	   if (tempVar6 != null)
	   {
		   p.shuxue = Integer.parseInt(tempVar6);
	   }
	   q.next = p,q = p;
	 }
	 p.next = null;
	 return (head);
	}

	public static int Main()
	{
	 int i;
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 stu h;
	 stu p;
	 stu q1;
	 stu q2;
	 stu q3;
	 h = creat(n);
	 int m1;
	 int m2;
	 int m3;
	 for (p = h,m1 = p.sum;p != null;p = p.next)
	 {
	 if (p.sum > m1)
	 {
		 m1 = p.sum,q1 = p;
	 }
	 }
	 System.out.printf("%d %d",q1.ID,q1.sum);
	 for (p = h,m2 = p.sum;p != null;p = p.next)
	 {
	 if (p.sum > m2 && p != q1)
	 {
		 m2 = p.sum,q2 = p;
	 }
	 }
	 System.out.printf("\n%d %d",q2.ID,q2.sum);
	 for (p = h,m3 = p.sum;p != null;p = p.next)
	 {
	 if (p.sum > m3 && p != q1 && p != q2)
	 {
		 m3 = p.sum,q3 = p;
	 }
	 }
	 System.out.printf("\n%d %d",q3.ID,q3.sum);
	}



}

