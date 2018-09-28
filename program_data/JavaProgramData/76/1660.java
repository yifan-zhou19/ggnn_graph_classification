package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	// struct qujian
	// {
	//	int a;
	//	int b;
	// }
	// q[MAX_NUM];
	 int[] s = new int[MAX_LEN];
	 int n;
	 int i;
	 int j;
	 int min_a;
	 int max_b;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 q[1].a = tempVar2;
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 q[1].b = tempVar3;
	 }
	 min_a = q[1].a;
	 max_b = q[1].b;
	 for (j = q[1].a;j < q[1].b;j++)
	 {
		 s[j] = 1;
	 }
	 for (i = 1;i < n;i++)
	 {
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 q[i].a = tempVar4;
		 }
		 String tempVar5 = ConsoleInput.scanfRead();
		 if (tempVar5 != null)
		 {
			 q[i].b = tempVar5;
		 }
		 if (q[i].a < min_a)
		 {
			 min_a = q[i].a;
		 }
		 if (q[i].b > max_b)
		 {
			 max_b = q[i].b;
		 }
		 for (j = q[i].a;j < q[i].b;j++)
		 {
			 s[j] = 1;
		 }
	 }
	 s[max_b] = 1;
	 for (i = min_a;i <= max_b;i++)
	 {
		 if (s[i] == 0)
		 {
			 System.out.print("no");
			 break;
		 }
	 }
	 if (i == max_b + 1)
	 {
		 System.out.printf("%d %d",min_a,max_b);
	 }
	return 0;
	}
}

