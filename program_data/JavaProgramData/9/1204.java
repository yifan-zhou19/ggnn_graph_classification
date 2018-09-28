package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//	char id[11];
	//	int age;
	//	}
	//	*p,*p60_up,*p60_low,t;

		int n;
		int i;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		p = (patient) malloc(sizeof(patient) * n);

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(p[i].id) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(p[i].age) = tempVar3;
			}
		}
		for (i = 0;i <= n;i++)
		{
			if (p[i].age >= 60)
			{
			k++;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		p60_up = (patient) malloc(sizeof(patient) * k);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		p60_low = (patient) malloc(sizeof(patient) * (n - k));

		for (i = 0,j = 0;i < n;i++)
		{
			if (p[i].age >= 60)
			{
			   p60_up[j] = p[i];
			   j++;
			}
		}
		for (i = 0,j = 0;i < n;i++)
		{
			if (p[i].age < 60)
			{
			   p60_low[j] = p[i];
			   j++;
			}
		}
	  for (j = 1 ; j <= k ; j++)
	  {
		   for (i = 0; i < k - j; i++)
		   {
				if (p60_up[i].age < p60_up[i + 1].age)
				{
					t = p60_up[i + 1];
					p60_up[i + 1] = p60_up[i];
					p60_up[i] = t;
				}
		   }
	  }

		for (i = 0;i < k;i++)
		{
			System.out.println(p60_up[i].id);
		}
		p60_up = null;
		for (i = 0;i < n - k;i++)
		{
			System.out.println(p60_low[i].id);
		}
		p60_low = null;

		return 0;
	}
}

