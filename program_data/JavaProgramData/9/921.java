package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j = 0;
	int k;
	int l;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct patient
	//{
	//	char num[10];
	//	int age;
	//}
	//p[100],temp;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		do
		{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				p[i].num[j] = tempVar2;
			}
			j++;
		} while (p[i].num[j - 1] != ' ');
		p[i].num[j - 1] = '\0';
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p[i].age = tempVar3;
		}
		j = 0;
	}
		for (i = 0;i < n;i++)
		{
			k = i;
			for (j = i + 1;j < n;j++)
			{
				if (p[j].age > p[k].age)
				{
					k = j;
				}
			}
			if (k != i && p[k].age >= 60)
			{
				temp = p[k];
				for (l = k;l >= i + 1;l--)
				{
					p[l] = p[l - 1];
				}
				p[i] = temp;
			}
		}
	for (i = 0;i < n;i++)
	{
		  System.out.printf("%s",p[i].num);
		  if (i != n - 1)
		  {
			  System.out.print("\n");
		  }
	}
	return 0;
	}
}

