public class patient
{
	public String ID = new String(new char[10]);
	public int age;
	public int a6;
	public String Id = new String(new char[10]);
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		patient[] bin = tangible.Arrays.initializeWithDefaultpatientInstances(N);
		int n;
		int mid;
		String s = new String(new char[10]);
		int i = 0;
		int j = 0;
		int k = 0;
		String c = new String(new char[10]);
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
				bin[i].ID = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				bin[i].age = Integer.parseInt(tempVar3);
			}
		}


		for (i = 0;i < n;i++)
		{
			if (bin[i].age >= 60)
			{
				bin[j].a6 = bin[i].age;
				bin[j].Id = bin[i].ID;
				j++;
				bin[i].age = 0;


			}
		}
		for (k = 1;k < j;k++)
		{
			for (i = 0;i < j - k;i++)
			{
			if (bin[i].a6 < bin[i + 1].a6)
			{
				mid = bin[i].a6;
				bin[i].a6 = bin[i + 1].a6;
				bin[i + 1].a6 = mid;


				c = bin[i].Id;
				s = bin[i + 1].Id;
				bin[i + 1].Id = c;
				bin[i].Id = s;
			}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%s\n",bin[i].Id);
		}

		for (i = 0;i < n;i++)
		{
			if (bin[i].age != 0)
			{
				System.out.printf("%s\n",bin[i].ID);
			}
		}

	}

}

