public class patient
{
	public String id = new String(new char[20]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		patient[] a = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		patient[] b = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		patient[] c = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		patient temp = new patient();
		int n;
		int i;
		int j;
		int k = 0;
		int l = 0;
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
				a[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].age = Integer.parseInt(tempVar3);
			}
			if (a[i].age >= 60)
			{
				for (j = 0;j < 20;j++)
				{
				 b[k].id = tangible.StringFunctions.changeCharacter(b[k].id, j, a[i].id.charAt(j));
			 b[k].age = a[i].age;
				}
			 k++;
			}
			else
			{
				for (j = 0;j < 20;j++)
				{
				c[l].id = tangible.StringFunctions.changeCharacter(c[l].id, j, a[i].id.charAt(j));
				}
			l++;
			}
		}
		for (i = k - 1;i > 0;i--)
		{
			 for (j = 0;j < i;j++)
			 {
				 if (b[j].age < b[j + 1].age)
				 {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=b[j];
					 temp.copyFrom(b[j]);
					 b[j] = b[j + 1];
					 b[j + 1] = temp;
				 }
			 }
		}
		 for (i = 0;i < k;i++)
		 {
		 System.out.printf("%s\n",b[i].id);
		 }
		for (i = 0;i < l;i++)
		{
		  System.out.printf("%s\n",c[i].id);
		}
	}
}

