public class patient
{
	public String a = new String(new char[100]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] pat = tangible.Arrays.initializeWithDefaultpatientInstances(110);
	public static patient[] pat1 = tangible.Arrays.initializeWithDefaultpatientInstances(110);

	public static void bubble(int n)
	{
		int i;
		int j;
		patient temp = new patient();
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (pat1[j].age < pat1[j + 1].age)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=pat1[j];
					temp.copyFrom(pat1[j]);
					pat1[j] = pat1[j + 1];
					pat1[j + 1] = temp;
				}
			}
		}
	}

	public static void Main()
	{
		int n;
		int i;
		int k = 0;
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
				pat[i].a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pat[i].age = Integer.parseInt(tempVar3);
			}
			if (pat[i].age >= 60)
			{
				pat1[k++] = pat[i];
			}
		}
		bubble(k);
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s\n",pat1[i].a);
		}
		for (i = 0;i < n;i++)
		{
			if (pat[i].age < 60)
			{
				System.out.printf("%s\n",pat[i].a);
			}
		}
	}






}

