package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] b = new int[100];
		int t;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char num[10];
	//		int age;
	//	}
	//	a[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].age = tempVar3;
			}
			b[i] = a[i].age;
		}
		for (j = 0;j < n - 1;j++)
		{
		   for (i = 0;i < n - 1 - j;i++)
		   {
			   if (b[i] < b[i + 1])
			   {
				   t = b[i];
				   b[i] = b[i + 1];
				   b[i + 1] = t;
			   }
		   }
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] < 60)
			{
			m = i;
			break;
			}
		}
		for (j = 0;j < m;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (a[i].age == b[j] && (j == 0 || b[j] != b[j - 1]))
				{
					System.out.printf("%s\n",a[i].num);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i].age < 60)
			{
				System.out.printf("%s\n",a[i].num);
			}
		}
	}

}

