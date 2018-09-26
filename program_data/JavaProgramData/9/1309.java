public class Patient
{
	   public String id = new String(new char[10]);
	   public int age;
	   public int num;
}

package <missing>;

public class GlobalMembers
{
	public static Patient[] patient = tangible.Arrays.initializeWithDefaultPatientInstances(100);
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int k = 0;
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				patient[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				patient[i].age = Integer.parseInt(tempVar3);
			}
			patient[i].num = i;
		}
		int[] s = new int[100];
		for (i = 0;i <= 99;i++)
		{
			s[i] = i;
		}
		for (i = 0;i <= n - 2;i++)
		{
			for (j = 0;j <= n - 2;j++)
			{
				if (patient[s[j]].age < patient[s[j + 1]].age)
				{
													a = s[j];
													s[j] = s[j + 1];
													s[j + 1] = a;
				}
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (patient[i].age >= 60)
			{
			k = k + 1;
			}
		}
		for (i = 0;i <= k - 2;i++)
		{
			for (j = 0;j <= k - 2;j++)
			{
				if (s[j] > s[j + 1] && patient[s[j]].age == patient[s[j + 1]].age)
				{
													a = s[j];
													s[j] = s[j + 1];
													s[j + 1] = a;
				}
			}
		}

		for (i = k;i <= n - 2;i++)
		{
			for (j = k;j <= n - 2;j++)
			{
				if (s[j] > s[j + 1])
				{
								a = s[j];
								s[j] = s[j + 1];
								s[j + 1] = a;
				}
			}
		}

		for (i = 0;i <= n - 1;i++)
		{
			System.out.printf("%s\n", patient[s[i]].id);
		}

		return 0;
	}








}

