public class pt
{
  public String id = new String(new char[10]);
  public int age;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int i;
	  int j;
	  int old;
	  pt[] p = tangible.Arrays.initializeWithDefaultptInstances(100);
	  pt[] o = tangible.Arrays.initializeWithDefaultptInstances(100);
	  pt tem = new pt();
	  char cao;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(null, 1);
	  if (tempVar2 != null)
	  {
		  cao = tempVar2.charAt(0);
	  }
	  old = 0;
	  for (i = 0;i < n;i++)
	  {

	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   p[i].id = tempVar3.charAt(0);
	   }
	   String tempVar4 = ConsoleInput.scanfRead(" ");
	   if (tempVar4 != null)
	   {
		   p[i].age = Integer.parseInt(tempVar4);
	   }
	  if (p[i].age >= 60)
	  {
		  o[old] = p[i];
		  old++;
	  }
	  }
	for (i = 0;i < old - 1;i++)
	{
	  for (j = 0;j < old - 1;j++)
	  {
	  if (o[j + 1].age > o[j].age)
	  {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: tem=o[j];
	  tem.copyFrom(o[j]);
	  o[j] = o[j + 1];
	  o[j + 1] = tem;
	  }
	  }
	}
	 for (i = 0;i < old;i++)
	 {
		 System.out.printf("%s\n",o[i].id);
	 }
	 for (i = 0;i < n;i++)
	 {
	  if (p[i].age < 60)
	  {
	  System.out.printf("%s\n",p[i].id);
	  }
	 }


	}
}

