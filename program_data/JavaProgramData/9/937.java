public class patient
{
	public String id = new String(new char[10]);
	public int age;
	public int turn;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] pat = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	public static patient temp = new patient();
	public static void Main()
	{
		int n;
		int i;
		int j;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				pat[i].age = Integer.parseInt(tempVar3);
			}
			pat[i].turn = i;
		}
		for (i = 0;i < n;i++)
		{
		   if (pat[i].age < 60)
		   {
			   j = i + 1;
			   while ((pat[j].age < 60) && (j < n))
			   {
				   j++;
			   }
			   if (pat[j].age >= 60)
			   {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=pat[i];
				   temp.copyFrom(pat[i]);
				   pat[i] = pat[j];
				   pat[j] = temp;
			   }
		   }
		}
		for (i = 0;(pat[i].age >= 60) && (i < n);i++)
		{
		   for (j = i + 1;j < n;j++)
		   {
			  if ((pat[j].age > pat[i].age) || ((pat[i].age == pat[j].age) && (pat[j].turn < pat[i].turn)))
			  {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=pat[i];
				  temp.copyFrom(pat[i]);
				  pat[i] = pat[j];
				  pat[j] = temp;
			  }
		   }
		}
		for (i = 0;i < n;i++)
		{
		   if (pat[i].age < 60)
		   {
			   for (j = i + 1;j < n;j++)
			   {
				 if (pat[i].turn > pat[j].turn)
				 {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=pat[i];
					 temp.copyFrom(pat[i]);
					 pat[i] = pat[j];
					 pat[j] = temp;
				 }
			   }
		   }
		}
		for (i = 0;i < n;i++)
		{
		   System.out.printf("%s\n",pat[i].id);
		}
	}
}

