public class stu
{
 public int a;
 public int b;
 public int c;
 public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int i;
	 int j;
	 int n;
	 int t;
	 int[] sum = new int[100000];
	 stu head;
	 stu p1;
	 stu p2;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 p1 = new stu();
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 (p1.a) = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 (p1.b) = Integer.parseInt(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 (p1.c) = Integer.parseInt(tempVar4);
		 }
		 sum[0] = p1.b + p1.c;
		 head = p1;
		 p2 = p1;
	 for (i = 1;i < n;i++)
	 {
		 p1 = new stu();
		 p2.next = p1;
		 String tempVar5 = ConsoleInput.scanfRead();
		 if (tempVar5 != null)
		 {
			 (p1.a) = Integer.parseInt(tempVar5);
		 }
		 String tempVar6 = ConsoleInput.scanfRead();
		 if (tempVar6 != null)
		 {
			 (p1.b) = Integer.parseInt(tempVar6);
		 }
		 String tempVar7 = ConsoleInput.scanfRead();
		 if (tempVar7 != null)
		 {
			 (p1.c) = Integer.parseInt(tempVar7);
		 }
		 sum[i] = p1.b + p1.c;
		 p2 = p1;
	 }
	   p2.next = null;
	  for (i = 0;i < 3;i++)
	  {
	   for (j = i + 1;j < n;j++)
	   {
		if (sum[i] < sum[j])
		{
		  t = sum[i];
		  sum[i] = sum[j];
		  sum[j] = t;
		}
	   }
	  }
	  for (i = 0;i < 3;i++)
	  {
	   p1 = head;
	   while (p1.b + p1.c != sum[i] && p1 != null)
	   {
		 p1 = p1.next;
	   }
	   if (p1 != null)
	   {
	   System.out.printf("%d %d\n",p1.a,sum[i]);
	   p1.b = 0;
	   p1.c = 0;
	   }
	  }
	}
}

