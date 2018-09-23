public class student
{
	   public int id;
	   public int chinese;
	   public int math;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int maxi1;
		  int maxi2;
		  int maxi3;
		  int num;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  num = Integer.parseInt(tempVar);
		  }
		  student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(num);
		  for (i = 0;i < num;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i].id = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  a[i].chinese = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  a[i].math = Integer.parseInt(tempVar4);
		  }
		  }
		  int maxpt1 = 0;
		  int maxpt2 = 0;
		  int maxpt3 = 0;
		  for (i = 0;i < num;i++)
		  {
			  if (maxpt1 < a[i].chinese + a[i].math)
			  {
								   maxpt3 = maxpt2;
								   maxpt2 = maxpt1;
								   maxpt1 = a[i].chinese + a[i].math;
								   maxi3 = maxi2;
								   maxi2 = maxi1;
								   maxi1 = a[i].id;
			  }
			  else if (maxpt2 < a[i].chinese + a[i].math)
			  {
								   maxpt3 = maxpt2;
								   maxpt2 = a[i].chinese + a[i].math;
								   maxi3 = maxi2;
								   maxi2 = a[i].id;
			  }
			  else if (maxpt3 < a[i].chinese + a[i].math)
			  {
								   maxpt3 = a[i].chinese + a[i].math;
								   maxi3 = a[i].id;
			  }
		  }
		  System.out.printf("%d %d\n%d %d\n%d %d",maxi1,maxpt1,maxi2,maxpt2,maxi3,maxpt3);

	}

}

