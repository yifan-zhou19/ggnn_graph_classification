package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct Patient
	//	{
	//		int flag;
	//		char id[10];
	//		int age;
	//	};
		Patient[] p = tangible.Arrays.initializeWithDefaultPatientInstances(100);
		Patient[] p2 = tangible.Arrays.initializeWithDefaultPatientInstances(100);
		Patient temp = new Patient();
		int n;
		int i;
		int t = 0;
		int k;
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
				p[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].age = tempVar3;
			}
			p[i].flag = 0;
			if (p[i].age >= 60)
			{
				t = t + 1;
				p[i].flag = 1;
			}
			p2[i] = p[i];
		}
	/*
		for(i=0;i<n-1;i++)
		{
			k=i;
			for(j=i+1;j<n;j++)
			{
				if(p[j].age>p[k].age) k=j;
			}
			if(k!=i)
			{
				temp=p[i];
				p[i]=p[k];
				p[k]=temp;
			}
		}
	*/
		  for (i = 0;i < n - 1;i++)
		  {
			  for (j = 0;j < n - 1 - i;j++)
			  {
				  if (p[j].age < p[j + 1].age)
				  {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=p[j];
					  temp.copyFrom(p[j]);
					  p[j] = p[j + 1];
					  p[j + 1] = temp;
				  }
			  }
		  }
		for (i = 0;i < t;i++)
		{
			System.out.printf("%s\n",p[i].id);
		}
		for (i = 0;i < n;i++)
		{
			if (p2[i].flag == 0)
			{
				System.out.printf("%s\n",p2[i].id);
			}
		}
		return 0;
	}

	/*
	int main()
	{
		struct patient
		{
			char ID[10];
			int age;
		}patient1[100];
		struct patient patient2[100];
		struct patient temp;
		int n,i,s=0,j;
		scanf("%d",&n);
		for(i=0;i<n;i++)
		{
			scanf("%s %d",&patient1[i].ID,&patient1[i].age);
		}
		for(i=0;i<n;i++)
		{
			if(patient1[i].age>=60)
			{
				patient2[s]=patient1[i];
				s++;
			}
		}
	    for(j=0;j<s-1;j++)
		{
			for(i=0;i<s-1-j;i++)
			{
				if(patient2[i].age<patient2[i+1].age)
				{
					temp=patient2[i];
					patient2[i]=patient2[i+1];
					patient2[i+1]=temp;
				}
			}
		}
		for(i=0;i<s;i++)
		{
			printf("%s\n",patient2[i].ID);
		}
		for(i=0;i<n;i++)
		{
			if(patient1[i].age<60)
			{
				printf("%s\n",patient1[i].ID);
			}
		}
		return 0;
	}
	*/
}

