package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	int j = 0;
	int t = 0;

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct patient
	//{
	//char str[10];
	//int age;
	//}
	//pat[100],pat2[100],patt;


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
		pat[i].str = tempVar2;
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		pat[i].age = tempVar3;
	}
	}

	for (i = 0;i < n;i++)
	{
	if (pat[i].age >= 60)
	{
		pat2[j] = pat[i];
		j++;
		t++;
	}
	}


	for (i = 0;i < t - 1;i++)
	{
			for (j = 0;j < t - 1 - i;j++)
			{
				if (pat2[j + 1].age > pat2[j].age)
				{
				patt = pat2[j];
				pat2[j] = pat2[j + 1];
				pat2[j + 1] = patt;
				}
			}
	}


	for (i = 0;i < t;i++)
	{
	System.out.printf("%s\n",pat2[i].str);
	}

	for (i = 0;i < n;i++)
	{
	if (pat[i].age < 60)
	{
		System.out.printf("%s\n",pat[i].str);
	}
	}

	}
}

