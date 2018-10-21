public class pa
{
	public String id = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static pa[] patient = tangible.Arrays.initializeWithDefaultpaInstances(100);
	public static pa[] patient2 = tangible.Arrays.initializeWithDefaultpaInstances(100);

	public static void Main()
	{
		int i;
		int k;
		int m;
		int n;
		int j;
		int temp;
		String id2 = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++) //insert the information of the patients
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
		}
		for (i = 0,j = 0;i < n;) //deal with the information
		{
			if (patient[i].age >= 60)
			{
				 patient2[j].id = patient[i].id;
				patient2[j].age = patient[i].age;
													//	printf("%d ",patient2[j].age);
				j++;
				for (k = i;k < n - 1;k++)
				{
					patient[k].id = patient[k + 1].id;
					patient[k].age = patient[k + 1].age;
				}
				n--;
			}
			else
			{
				i++;
			}
		}
	//	printf("\n"); 
	//	printf("%d",j);
		for (i = 1;i < j;i++)
		{
			for (k = 0;k < i;k++)
			{
				if (patient2[i].age > patient2[k].age)
				{
					temp = patient2[i].age;
					id2 = patient2[i].id;
					for (m = i;m > k;m--)
					{
						patient2[m].age = patient2[m - 1].age;
						patient2[m].id = patient2[m - 1].id;
					}
					patient2[k].age = temp;
					patient2[k].id = id2;
				}
	//			printf("\n");
	//			printf("%d %d ",patient2[i].age,patient2[i+1].age);
			}
		}

		for (i = 0;i < j;i++)
		{
			System.out.printf("%s\n",patient2[i].id);
		}
		 for (i = 0;i < n;i++)
		 {
			 System.out.printf("%s\n",patient[i].id);
		 }
	}
}

