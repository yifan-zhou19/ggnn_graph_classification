package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int N;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 N = Integer.parseInt(tempVar);
	 }
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	// struct std
	// {
	//  char name[21];
	//  int pin;
	//  int yi;
	//  char gan;
	//  char west;
	//  int n;
	// }
	// std[100];
	 int i;
	 for (i = 0;i < N;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  std[i].name = tempVar2;
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  std[i].pin = tempVar3;
	  }
	  String tempVar4 = ConsoleInput.scanfRead(" ");
	  if (tempVar4 != null)
	  {
		  std[i].yi = tempVar4;
	  }
	  String tempVar5 = ConsoleInput.scanfRead(" ", 1);
	  if (tempVar5 != null)
	  {
		  std[i].gan = tempVar5;
	  }
	  String tempVar6 = ConsoleInput.scanfRead(" ", 1);
	  if (tempVar6 != null)
	  {
		  std[i].west = tempVar6;
	  }
	  String tempVar7 = ConsoleInput.scanfRead(" ");
	  if (tempVar7 != null)
	  {
		  std[i].n = tempVar7;
	  }
	 }
	 int[] sum = new int[100];
	 for (i = 0;i < N;i++)
	 {
	  sum[i] = 0;
	 }
	 for (i = 0;i < N;i++)
	 {
	  if (std[i].pin > 80 && std[i].n > 0)
	  {
	   sum[i] += 8000;
	  }
	  if (std[i].pin > 85 && std[i].yi > 80)
	  {
	   sum[i] += 4000;
	  }
	  if (std[i].pin > 90)
	  {
	   sum[i] += 2000;
	  }
	  if (std[i].pin > 85 && std[i].west == 'Y')
	  {
	   sum[i] += 1000;
	  }
	  if (std[i].yi > 80 && std[i].gan == 'Y')
	  {
	   sum[i] += 850;
	  }
	 }
	 int max = sum[0];
	 int k = 0;
	 int he = sum[0];
	 for (i = 1;i < N;i++)
	 {
	  he += sum[i];
	  if (max < sum[i])
	  {
	   max = sum[i];
	   k = i;
	  }
	 }
	 System.out.printf("%s\n",std[k].name);
	 System.out.printf("%d\n",max);
	 System.out.printf("%d\n",he);
	 return 0;
	}



}

