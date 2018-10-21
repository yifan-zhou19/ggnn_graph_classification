package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct pa
	//	{
	//		char id[10];
	//		int age;
	//	}
	//	pat[100],p1[100],p2[100],temp;
		int i;
		int n;
		int j = 0;
		int k = 0;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			pat[i].id = ConsoleInput.readToWhiteSpace(true);
			pat[i].age = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 0;i < n;i++)
		{
			if (pat[i].age >= 60)
			{
				p1[j] = pat[i];
				j++;
			}
			else
			{
				p2[k] = pat[i];
				k++;
			}
		}
		for (i = j - 1;i > 0;i--)
		{
			for (m = 0;m < i;m++)
			{
				if (p1[m].age < p1[m + 1].age)
				{
					temp = p1[m];
					p1[m] = p1[m + 1];
					p1[m + 1] = temp;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%s\n",p1[i].id);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s\n",p2[i].id);
		}
		return 0;
	}
}

