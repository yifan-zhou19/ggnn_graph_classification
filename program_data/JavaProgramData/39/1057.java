package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int e;
	  int f;
	  int h;
	  int j;
	  int k;
	  int max = 0;
	  int l = 0;
	  int s = 0;
	  int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//  struct xinxi
	//  {
	//	  char name[50];
	//	  int qc; // ???? //
	//	  int bc; //  ???? //
	//	  char g; //  ??????  //
	//	  char w; //   ???????  //
	//	  int ls; //????//
	//  }
	//  a[100];
	  int[] score = new int[100];
	  for (i = 0;i < n;i++)
	  {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i].name = tempVar2;
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 a[i].qc = tempVar3;
		 }
		 String tempVar4 = ConsoleInput.scanfRead(" ");
		 if (tempVar4 != null)
		 {
			 a[i].bc = tempVar4;
		 }
		 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar5 != null)
		 {
			 a[i].g = tempVar5;
		 }
		 String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar6 != null)
		 {
			 a[i].w = tempVar6;
		 }
		 String tempVar7 = ConsoleInput.scanfRead(" ");
		 if (tempVar7 != null)
		 {
			 a[i].ls = tempVar7;
		 }
		  e = f = h = j = k = 0;
		 if (a[i].qc > 80 && a[i].ls >= 1)
		 {
			  e = 8000;
		 }
		if (a[i].qc > 85 && a[i].bc > 80)
		{
			  f = 4000;
		}
		if (a[i].qc > 90)
		{
			  h = 2000;
		}
		if (a[i].qc > 85 && a[i].w == 'Y')
		{
			  j = 1000;
		}
		if (a[i].bc > 80 && a[i].g == 'Y')
		{
			  k = 850;
		}
		score[i] = e + f + h + j + k;
		s = s + score[i];
		if (max < score[i])
		{
		   max = score[i];
		}
	  }
	  for (i = 0;i < n;i++)
	  {
		if (max == score[i])
		{
		 System.out.printf("%s\n",a[i].name);
		 System.out.printf("%d\n",max);
		 System.out.printf("%d\n",s);
		 l++;
		}
		if (l > 0)
		{
		  break;
		}
	  }
	 return 0;
	}

}

