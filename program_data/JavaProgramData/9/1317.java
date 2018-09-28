public class patient
{
  public String num = new String(new char[11]);
  public int age;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 patient[] pat1 = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	 patient[] pat2 = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  pat1[i].num = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  pat1[i].age = Integer.parseInt(tempVar3);
	  }
	  pat2[i].num = pat1[i].num;
	  pat2[i].age = pat1[i].age;
	 }
	 int j;
	 int e;
	 String e_num = new String(new char[11]);
	 for (j = 1;j < n;j++)
	 {
	  for (i = 0;i < n - j;i++)
	  {
	   if (pat1[i].age < pat1[i + 1].age)
	   {
		e = pat1[i + 1].age;
		e_num = pat1[i + 1].num;
		pat1[i + 1].age = pat1[i].age;
		pat1[i + 1].num = pat1[i].num;
		pat1[i].age = e;
		pat1[i].num = e_num;
	   }
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
		 if (pat1[i].age >= 60)
		 {
			System.out.printf("%s\n",pat1[i].num);
		 }
	 }
	 for (i = 0;i < n;i++)
	 {
		 if (pat2[i].age < 60)
		 {
			System.out.printf("%s\n",pat2[i].num);
		 }
	 }
	 return 0;
	}

}

