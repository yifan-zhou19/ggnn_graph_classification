public class myturn
{
	public String ID = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int max = 0;
		myturn[] patient = tangible.Arrays.initializeWithDefaultmyturnInstances(100);
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
				patient[i].ID = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				patient[i].age = Integer.parseInt(tempVar3);
			}
			if (patient[i].age > max)
			{
				max = patient[i].age; //    ?????????
			}
		}
		if (max >= 60)
		{ // ??????max??????????
			for (max;max >= 60;max--)
			{
				for (i = 0;i < n;i++)
				{
					if (patient[i].age == max)
					{
						System.out.printf("%s\n",patient[i].ID); //???????????0???�flag�?
						patient[i].age = 0;
						j++;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{ // ??????ID?
			if (patient[i].age != 0)
			{
				System.out.printf("%s",patient[i].ID);
			j++;
			if (j < n)
			{
				System.out.print("\n");
			}
			}
		}
		return 0;
	}
}

