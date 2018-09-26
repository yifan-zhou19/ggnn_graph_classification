public class patient
{
	   public String name = new String(new char[20]);
	   public int age;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] line = tangible.Arrays.initializeWithDefaultpatientInstances(202);
	public static patient temp = new patient();

	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				line[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				line[i].age = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= n;i++)
		{
		   for (j = n;j > i;j--)
		   {
			   if (line[j].age >= 60)
			   {
		   if (line[j].age > line[j - 1].age)
		   {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=line[j];
			   temp.copyFrom(line[j]);
			   line[j] = line[j - 1];
			   line[j - 1] = temp;
		   }
			   }
		   }
		}
		for (i = 1;i <= n;i++)
		{

				System.out.printf("%s\n", line[i].name);

		}
		return 0;
	}
}

