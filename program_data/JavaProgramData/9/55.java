public class bing
{
	public String id = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   bing[] peo = tangible.Arrays.initializeWithDefaultbingInstances(120);
	   bing[] old = tangible.Arrays.initializeWithDefaultbingInstances(120);
	   bing[] young = tangible.Arrays.initializeWithDefaultbingInstances(120);
	   bing temp = new bing();
	   int i;
	   int j;
	   int n;
	   int num1 = 0;
	   int num2 = 0;

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
				peo[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				peo[i].age = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0;i < n;i++)
		{
			if (peo[i].age >= 60)
			{
				old[num1] = peo[i];
				num1 = num1 + 1;
			}
			else
			{
				young[num2] = peo[i];
				num2 = num2 + 1;
			}
		}

		for (i = 0;i < num1 - 1;i++)
		{
			for (j = 0;j < num1 - i - 1;j++)
			{
				if (old[j].age < old[j + 1].age)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=old[j];
					temp.copyFrom(old[j]);
					old[j] = old[j + 1];
					old[j + 1] = temp;
				}
			}
		}

		for (i = 0;i < num1;i++)
		{
			System.out.printf("%s\n",old[i].id);
		}
		for (i = 0;i < num2;i++)
		{
			System.out.printf("%s\n",young[i].id);
		}

	}
}

