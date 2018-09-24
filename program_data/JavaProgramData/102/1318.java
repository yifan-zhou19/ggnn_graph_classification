public class photo
{
	   public String gen = new String(new char[10]);
	   public double height;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  photo[] a = tangible.Arrays.initializeWithDefaultphotoInstances(50);
		  photo b = new photo();
		  int i;
		  int j;
		  int k = 0;
		  for (i = 0;i < n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i].gen = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  a[i].height = Double.parseDouble(tempVar3);
		  }
		  }
		  for (i = 0;i < n;i++)
		  {
				for (j = 0;j < n - 1 - i;j++)
				{
					if (a[j].height < a[j + 1].height)
					{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: b=a[j];
						b.copyFrom(a[j]);
						a[j] = a[j + 1];
						a[j + 1] = b;
					}
				}
		  }
		  for (i = n - 1;i >= 0;i--)
		  {
				 if (strcmp(a[i].gen,"male") == 0 && k != 0)
				 {
				 System.out.printf(" %.2f",a[i].height);
				 }
				 if (strcmp(a[i].gen,"male") == 0 && k == 0)
				 {
					System.out.printf("%.2f",a[i].height);
					k = k + 1;
				 }
		  }
		  for (i = 0;i < n;i++)
		  {
				 if (strcmp(a[i].gen,"female") == 0)
				 {
				 System.out.printf(" %.2f",a[i].height);
				 }
		  }
	}






}

