public class patient
{
	public String num = new String(new char[20]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		void bubble(struct patient a[],int len);
		int n;
		int i;
		int old;
		int sum;
		int age;
		int j;
		patient[] a = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		patient[] b = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		final String str = "";
		final String str1 = "";

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0,j = 0,sum = 0;sum <= n;)
		{
			age = 0;
			str = str1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				age = Integer.parseInt(tempVar3);
			}

			if (age >= 60)
			{
				a[i].num = str;
				a[i].age = age;
				i++;
				sum++;
			}
			else
			{
				b[j].num = str;
				b[j].age = age;
				j++;
				sum++;
			}

		}
		//printf("%d",i);

		bubble(a, i);
		old = i;

		for (i = 0;i < old;i++)
		{
			System.out.printf("%s\n",a[i].num);
		}
		for (i = 0;i < j;i++)
		{
			 System.out.printf("%s\n",b[i].num);
		}

		return 0;
	}


	public static void bubble(patient[] a, int len)
	{
		int i;
		int pass;
		patient temp = new patient(); //temp????????????

		for (pass = 1;pass < len;pass++)
		{
			for (i = 0;i < len - pass;i++)
			{
				if (a[i].age < a[i + 1].age)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=a[i];
					temp.copyFrom(a[i]);
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
		}
	}




}

