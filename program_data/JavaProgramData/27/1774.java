package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		 int n;
		 int i;
		 int j;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	 struct data
	//	 {
	//		 double a,b,c;
	//	 }
	//	 *datas;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		 datas = (data)malloc(sizeof(data) * n);
		 for (i = 0;i < n;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 datas[i].a = tempVar2;
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 datas[i].b = tempVar3;
			 }
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 datas[i].c = tempVar4;
			 }
		 }
		 double[] x1;
		 double[] x2;
		 x1 = new double[n];
		 x2 = new double[n];
		 for (j = 0;j < n;j++)
		 {
			 if ((datas[j].b * datas[j].b - 4 * datas[j].a * datas[j].c) > 0)
			 {
				 x1[j] = (-datas[j].b + Math.sqrt(datas[j].b * datas[j].b - 4 * datas[j].a * datas[j].c)) / (2 * datas[j].a);
				 x2[j] = (-datas[j].b - Math.sqrt(datas[j].b * datas[j].b - 4 * datas[j].a * datas[j].c)) / (2 * datas[j].a);
				 System.out.printf("x1=%.5f;x2=%.5f\n",x1[j],x2[j]);
			 }
			 else if ((datas[j].b * datas[j].b - 4 * datas[j].a * datas[j].c) == 0)
			 {
				 x1[j] = (-datas[j].b) / (2 * datas[j].a);
				 System.out.printf("x1=x2=%.5f\n",x1[j]);
			 }
			 else if ((datas[j].b * datas[j].b - 4 * datas[j].a * datas[j].c) < 0)
			 {
				 x1[j] = (-datas[j].b) / (2 * datas[j].a);
				 double x = 0;
				 x = Math.sqrt((-1) * (datas[j].b * datas[j].b - 4 * datas[j].a * datas[j].c)) / (2 * datas[j].a);
				 if (x1[j] == 0)
				 {
					 System.out.printf("x1=0.00000+%.5fi;x2=0.00000-%.5fi\n",x,x);
				 }
				 else if (x1[j] != 0)
				 {
					 System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",x1[j],x,x1[j],x);
				 }
			 }
		 }
		 return 0;
	 }
}

