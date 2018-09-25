public class student
{
	   public String sex = new String(new char[7]);
	   public float h;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(41);
		  student t = new student();
		  int i;
		  int j;
		  int k;
		  int n;
		  int count1 = 0;
		  int count2 = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   a[i].sex = tempVar2.charAt(0);
			   }
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   a[i].h = Float.parseFloat(tempVar3);
			   }
		  }
		  for (i = 0;i < n;i++)
		  {
				 if (strcmp(a[i].sex,"male") == 0)
				 {
				 count1++;
				 }
				 else
				 {
				 count2++;
				 }
		  }
		  for (i = 0;i < n - 1;i++)
		  {
			  for (j = i + 1;j < n;j++)
			  {
					if (a[i].h > a[j].h)
					{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=a[i];
					t.copyFrom(a[i]);
					a[i] = a[j];
					a[j] = t;
					}
			  }
		  }
		  for (i = 0;i < n;i++)
		  {
				 if (strcmp(a[i].sex,"male") == 0)
				 {
				 System.out.printf("%.2f ",a[i].h);
				 }
		  }
		  int count = 0;
		  for (i = n - 1;i >= 0;i--)
		  {
				 if (strcmp(a[i].sex,"female") == 0)
				 {
						   if (count != count2 - 1)
						   {
						   System.out.printf("%.2f ",a[i].h);
						   count++;
						   }
						   else
						   {
						   System.out.printf("%.2f",a[i].h);
						   }
				 }

		  }
		  System.in.read();
		  System.in.read();
	}

}

