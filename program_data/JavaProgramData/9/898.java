package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s = 0;
		int j = 0;
		int k = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		int age;
	//		char id[10];
	//	}
	//	patient[100],old[100],young[100],temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			patient[i].id = ConsoleInput.readToWhiteSpace(true);
			patient[i].age = ConsoleInput.readToWhiteSpace(true);
			if (patient[i].age >= 60)
			{
				old[k] = patient[i];
				k++;
			}
			else
			{
				young[s] = patient[i];
				s++;
			}
		}
		for (i = k - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (old[j].age < old[j + 1].age)
				{
					temp = old[j];
					old[j] = old[j + 1];
					old[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.print(old[i].id);
			System.out.print("\n");
		}
		for (i = 0;i < s;i++)
		{
			System.out.print(young[i].id);
			System.out.print("\n");
		}
		return 0;
	}

}

