public class student
{
	   public String num = new String(new char[11]);
	   public int age;
}

package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int n;
	  int i;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  student[] pa = tangible.Arrays.initializeWithDefaultstudentInstances(n);
	  for (i = 0;i <= n - 1;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  pa[i].num = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  pa[i].age = Integer.parseInt(tempVar3);
		  }
	  }
	  student temp = new student();
	  for (j = n - 1;j >= 1;j--)
	  {
		  for (i = 0;i <= j - 1;i++)
		  {
			  if (pa[i].age < pa[i + 1].age && !(pa[i].age < 60 && pa[i + 1].age < 60))
			  {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=pa[i];
				  temp.copyFrom(pa[i]);
				  pa[i] = pa[i + 1];
				  pa[i + 1] = temp;
			  }
		  }
	  }
	  for (i = 0;i <= n - 1;i++)
	  {
		  System.out.printf("%s",pa[i].num);
		  (i <= n - 2)?System.out.print("\n"):printf("");
	  }
	}

}

