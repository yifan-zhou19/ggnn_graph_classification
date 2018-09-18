package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	// struct
	// {
	//  int ID;
	//  int ch,math;
	//  int sum;
	// }
	// a[100000];
	 int n;
	 int m1;
	 int m2;
	 int m3;
	 int x;
	 int y;
	 int z;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 a[0].ID = tempVar2;
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 a[0].ch = tempVar3;
	 }
	 String tempVar4 = ConsoleInput.scanfRead(" ");
	 if (tempVar4 != null)
	 {
		 a[0].math = tempVar4;
	 }
	 m1 = a[0].ch + a[0].math;
	 int i;
	 for (i = 0;i < n;i++)
	 {
	  String tempVar5 = ConsoleInput.scanfRead();
	  if (tempVar5 != null)
	  {
		  a[i].ID = tempVar5;
	  }
	  String tempVar6 = ConsoleInput.scanfRead(" ");
	  if (tempVar6 != null)
	  {
		  a[i].ch = tempVar6;
	  }
	  String tempVar7 = ConsoleInput.scanfRead(" ");
	  if (tempVar7 != null)
	  {
		  a[i].math = tempVar7;
	  }
	  a[i].sum = a[i].ch + a[i].math;
	  if (a[i].sum > m1)
	  {
	   m1 = a[i].sum;
	   x = i;
	  }
	 }
	 System.out.printf("%d %d\n",a[x].ID,m1);
	 a[x].ch = a[x].math = a[x].sum = 0;
	 int j;
	 String tempVar8 = ConsoleInput.scanfRead();
	 if (tempVar8 != null)
	 {
		 a[0].ID = tempVar8;
	 }
	 String tempVar9 = ConsoleInput.scanfRead(" ");
	 if (tempVar9 != null)
	 {
		 a[0].ch = tempVar9;
	 }
	 String tempVar10 = ConsoleInput.scanfRead(" ");
	 if (tempVar10 != null)
	 {
		 a[0].math = tempVar10;
	 }
	 m2 = a[0].sum;
	 for (j = 0;j < n;j++)
	 {
	  String tempVar11 = ConsoleInput.scanfRead();
	  if (tempVar11 != null)
	  {
		  a[j].ID = tempVar11;
	  }
	  String tempVar12 = ConsoleInput.scanfRead(" ");
	  if (tempVar12 != null)
	  {
		  a[j].ch = tempVar12;
	  }
	  String tempVar13 = ConsoleInput.scanfRead(" ");
	  if (tempVar13 != null)
	  {
		  a[j].math = tempVar13;
	  }
	  a[j].sum = a[j].ch + a[j].math;
	  if (a[j].sum > m2)
	  {
	   m2 = a[j].sum;
	   y = j;
	  }
	 }
	 System.out.printf("%d %d\n",a[y].ID,m2);
	 a[y].ch = a[y].math = a[y].sum = 0;
	 int k;
	 String tempVar14 = ConsoleInput.scanfRead();
	 if (tempVar14 != null)
	 {
		 a[0].ID = tempVar14;
	 }
	 String tempVar15 = ConsoleInput.scanfRead(" ");
	 if (tempVar15 != null)
	 {
		 a[0].ch = tempVar15;
	 }
	 String tempVar16 = ConsoleInput.scanfRead(" ");
	 if (tempVar16 != null)
	 {
		 a[0].math = tempVar16;
	 }
	 m3 = a[0].sum;
	 for (k = 0;k < n;k++)
	 {
	  String tempVar17 = ConsoleInput.scanfRead();
	  if (tempVar17 != null)
	  {
		  a[k].ID = tempVar17;
	  }
	  String tempVar18 = ConsoleInput.scanfRead(" ");
	  if (tempVar18 != null)
	  {
		  a[k].ch = tempVar18;
	  }
	  String tempVar19 = ConsoleInput.scanfRead(" ");
	  if (tempVar19 != null)
	  {
		  a[k].math = tempVar19;
	  }
	  a[k].sum = a[k].ch + a[k].math;
	  if (a[k].sum > m3)
	  {
	   m3 = a[k].sum;
	   z = k;
	  }
	 }
	 System.out.printf("%d %d\n",a[z].ID,m3);
	 return 0;
	}






}

