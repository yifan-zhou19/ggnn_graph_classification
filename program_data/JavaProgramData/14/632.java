package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  float one = 0F;
		  float two = 0F;
		  float three = 0F;
		  float yi = 0F;
		  float er = 0F;
		  float san = 0F;
		  float[][] a = new float[100000][2];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	  struct Student
	//	  {
	//		  float xuehao;
	//		  float yuwen;
	//		  float shuxue;
	//	  }
	//	  student;
		  for (i = 0;i < n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  student.xuehao = tempVar2;
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  student.yuwen = tempVar3;
			  }
			  String tempVar4 = ConsoleInput.scanfRead(" ");
			  if (tempVar4 != null)
			  {
				  student.shuxue = tempVar4;
			  }
			  for (j = 0;j < 2;j++)
			  {
				  a[i][1] = student.yuwen + student.shuxue;
				  a[i][0] = i + 1;
			  }
		  }
		  for (i = 0;i < n;i++)
		  {
			  if (a[i][1] > one)
			  {
				  one = a[i][1];
			  yi = a[i][0];
			  }
		  }
		  for (i = 0;i < n;i++)
		  {
			  if (a[i][1] > two && a[i][1] <= one != 0 && a[i][0] != yi)
			  {
				  two = a[i][1];
			  er = a[i][0];
			  }
		  }
		   for (i = 0;i < n;i++)
		   {
			  if (a[i][1] > three && a[i][1] <= one != 0 && a[i][1] <= two != 0 && a[i][0] != yi && a[i][0] != er)
			  {
				  three = a[i][1];
			  san = a[i][0];
			  }
		   }
		   System.out.printf("%.0f %.0f\n",yi,one);
		   System.out.printf("%.0f %.0f\n",er,two);
		   System.out.printf("%.0f %.0f\n",san,three);
		   return 0;
	}

}

