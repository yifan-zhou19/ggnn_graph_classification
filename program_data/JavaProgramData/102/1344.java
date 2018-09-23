package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	// struct student
	// {
	//  char sex[6];
	//  float height;
	// }
	// stu[40];
	 int n;
	 int bnum = 0;
	 int gnum = 0;
	 int i;
	 int j;
	 float temp;
	 float[] boy = new float[40];
	 float[] girl = new float[40];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0; i < n; i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  stu[i].sex = tempVar2;
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  stu[i].height = tempVar3;
	  }
	  if (strcmp(stu[i].sex, "female") > 0)
	  {
	   boy[i - gnum] = stu[i].height;
	   bnum++;
	  }
	  else
	  {
	   girl[i - bnum] = stu[i].height;
	   gnum++;
	  }
	 }

	 for (i = 0; i < bnum; i++)
	 {
	  for (j = bnum - 1; j > i; j--)
	  {
	   if (boy[j] < boy[j - 1])
	   {
		temp = boy[j - 1];
		boy[j - 1] = boy[j];
		boy[j] = temp;
	   }
	  }
	 }

	 for (i = 0; i < gnum; i++)
	 {
	  for (j = gnum - 1; j > i; j--)
	  {
	   if (girl[j] > girl[j - 1])
	   {
		temp = girl[j - 1];
		girl[j - 1] = girl[j];
		girl[j] = temp;
	   }
	  }
	 }

	 for (i = 0; i < bnum; i++)
	 {
		 System.out.printf("%.2f ", boy[i]);
	 }
	 for (i = 0; i < gnum - 1; i++)
	 {
		 System.out.printf("%.2f ", girl[i]);
	 }
	 System.out.printf("%.2f", girl[gnum - 1]);

	}

}

