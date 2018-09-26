package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		 int n;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	 struct qj
	//	 {
	//	   int a,b;
	//	 }
	//	 *qjs,e;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		 qjs = (qj)malloc(sizeof(qj) * n);
		 for (i = 0;i < n;i++)
		 {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   qjs[i].a = tempVar2;
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   qjs[i].b = tempVar3;
		   }
		 }
		 int k;
		 int t;
		 for (k = 1;k <= n;k++)
		 {
		   for (i = 0;i < n - k;i++)
		   {
			 if (qjs[i].a > qjs[i + 1].a)
			 {
			   e = qjs[i];
			   qjs[i] = qjs[i + 1];
			   qjs[i + 1] = e;
			 }
			 if (qjs[i].b > qjs[i + 1].b)
			 {
			   t = qjs[i].b;
			   qjs[i].b = qjs[i + 1].b;
			   qjs[i + 1].b = t;
			 }
		   }
		 }

		 int c = 0;
		 for (i = 0;i < n - 1;i++)
		 {
		   if (qjs[i].b < qjs[i + 1].a)
		   {
			 c++;
		   }
		 }
		 if (c == 0)
		 {
		   System.out.printf("%d %d",qjs[0].a,qjs[n - 1].b);
		 }
		 else
		 {
		   System.out.print("no");
		 }
		 qjs = null;
	 return 0;
	 }


}

