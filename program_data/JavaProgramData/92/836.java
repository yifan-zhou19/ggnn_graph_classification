package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_t = new int[1005];
int[] q = new int[1005];
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int k;
	  int a;
	  int b;
	  int t1;
	  int t2;
	  int q1;
	  int q2;
	  int w = 0;
	  int l = 0;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//  static int t[1005],q[1005];
	  do
	  {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 if (n == 0)
		 {
		   break;
		 }
		 for (i = 1;i <= n;i++)
		 {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				Main_t[i] = Integer.parseInt(tempVar2);
			}
		 }
		 for (i = 1;i <= n;i++)
		 {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				q[i] = Integer.parseInt(tempVar3);
			}
		 }
		 for (i = 1;i < n;i++)
		 {
			for (j = i + 1;j <= n;j++)
			{
				 if (Main_t[i] < Main_t[j])
				 {
					 a = Main_t[i];
					 Main_t[i] = Main_t[j];
					 Main_t[j] = a;
				 }
			}
		 }
		  for (i = 1;i < n;i++)
		  {
			for (j = i + 1;j <= n;j++)
			{
				 if (q[i] < q[j])
				 {
					 a = q[i];
					 q[i] = q[j];
					 q[j] = a;
				 }
			}
		  }
		  t1 = 1;
		  t2 = n;
		  q1 = 1;
		  q2 = n;
		  while (t1 != t2 && q2 != q1)
		  {
				 if (Main_t[t1] > q[q1])
				 {
					w++;
					t1++;
					q1++;
					continue;
				 }
				 else if (Main_t[t2] > q[q2])
				 {
					 w++;
					 t2--;
					 q2--;
					 continue;
				 }
				 else if (Main_t[t2] == q[q1])
				 {
					t2--;
					q1++;
				 }
				 else if (Main_t[t2] < q[q1])
				 {
					 l++;
					 t2--;
					 q1++;
				 }
		  }
		  if (Main_t[t1] > q[q1])
		  {
			w++;
		  }
		  if (Main_t[t1] < q[q1])
		  {
			l++;
		  }
		  System.out.printf("%d\n",(w - l) * 200);
		  for (i = 1;i <= n;i++)
		  {
			   Main_t[i] = 0;
			   q[i] = 0;
		  }
		 w = 0;
		 l = 0;
	  }while (1 != 0);
	}
}

