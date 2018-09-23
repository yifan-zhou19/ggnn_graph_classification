public class student
{
	   public int ID;
	   public int Chinese;
	   public int Math;
	   public int Score;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int first = 0;
		  int ifirst;
		  int second = 0;
		  int isecond;
		  int third = 0;
		  int ithird;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  student[] STUDENT_NUM = tangible.Arrays.initializeWithDefaultstudentInstances(n);
		  for (i = 0;i < n;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  STUDENT_NUM[i].ID = Integer.parseInt(tempVar2);
						  }
						  String tempVar3 = ConsoleInput.scanfRead(" ");
						  if (tempVar3 != null)
						  {
							  STUDENT_NUM[i].Chinese = Integer.parseInt(tempVar3);
						  }
						  String tempVar4 = ConsoleInput.scanfRead(" ");
						  if (tempVar4 != null)
						  {
							  STUDENT_NUM[i].Math = Integer.parseInt(tempVar4);
						  }
						  STUDENT_NUM[i].Score = STUDENT_NUM[i].Chinese + STUDENT_NUM[i].Math;
		  }
		  for (i = 0;i < n;i++)
		  {
						  if (first < STUDENT_NUM[i].Score)
						  {
										 first = STUDENT_NUM[i].Score;
										 ifirst = i;
						  }
		  }
		  for (i = 0;i < n;i++)
		  {
						  if (second < STUDENT_NUM[i].Score && STUDENT_NUM[i].Score <= first != 0 && i != ifirst)
						  {
										 second = STUDENT_NUM[i].Score;
										 isecond = i;
						  }
		  }
		  for (i = 0;i < n;i++)
		  {
						  if (third < STUDENT_NUM[i].Score && STUDENT_NUM[i].Score <= second != 0 && i != ifirst && i != isecond)
						  {
										 third = STUDENT_NUM[i].Score;
										 ithird = i;
						  }
		  }
		  System.out.printf("%d %d\n",STUDENT_NUM[ifirst].ID,first);
		  System.out.printf("%d %d\n",STUDENT_NUM[isecond].ID,second);
		  System.out.printf("%d %d\n",STUDENT_NUM[ithird].ID,third);



	}

}

