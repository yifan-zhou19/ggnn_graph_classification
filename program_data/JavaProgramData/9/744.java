public class patient
{
	public String id = new String(new char[10]);
   public short age;
}

package <missing>;

public class GlobalMembers
{
	   public static void Main()
	   {
		 int i;
		 int j;
		 int k;
		 int l;
		 int n;
		 patient[] pat = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		 patient temp = new patient();
		 patient[] pa = tangible.Arrays.initializeWithDefaultpatientInstances(100);
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
				 pat[i].id = tempVar2.charAt(0);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 pat[i].age = Short.parseShort(tempVar3);
			 }
		 }
		 for (i = 0,j = 0;i < n;i++)
		 {

			 if (pat[i].age >= 60)
			 {
		   pa[j] = pat[i];
		   j++;
			 }
		 }
			 for (k = 0;k < j - 1;k++)
			 {
				 for (l = j - 1;l > k;l--)
				 {
					if (pa[l].age > pa[l - 1].age)
					{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=pa[l];
					temp.copyFrom(pa[l]);
					pa[l] = pa[l - 1];
					pa[l - 1] = temp;
					}
				 }
			 }
		  for (k = 0;k < j;k++)
		  {
			  System.out.printf("%s\n",pa[k].id);
		  }

		 for (i = 0;i < n;i++)
		 {
			 if (pat[i].age < 60)
			 {
			System.out.printf("%s\n",pat[i].id);
			 }
		 }
	   }
}

