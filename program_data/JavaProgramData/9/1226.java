public class patient
{
  public String id = new String(new char[10]);
  public int age;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] young = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	public static patient[] old = tangible.Arrays.initializeWithDefaultpatientInstances(100);

	public static int Main()
	{
	   int i;
	   int j;
	   int n;
	   int temp;
	   int yn = 0;
	   int on = 0;
	   int[] people = new int[150];
	   String t = new String(new char[10]);
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
			   t = tempVar2.charAt(0);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   temp = Integer.parseInt(tempVar3);
		   }
		   if (temp >= 60)
		   {
			  old[on].id += t;
			  old[on].age = temp;
			  on++;
			  people[temp]++;
		   }
		   else
		   {
			  young[yn].id += t;
			  young[yn].age = temp;
			  yn++;
		   }
	   }
	   for (i = 149;i >= 60;i--)
	   {
		   if (people[i] > 0)
		   {
			  for (j = 0;j < on;j++)
			  {
				 if (old[j].age == i)
				 {
					System.out.printf("%s\n",old[j].id);
				 }
			  }
		   }
	   }
	   for (i = 0;i < yn;i++)
	   {
		 System.out.printf("%s\n",young[i].id);
	   }
	}

}

