package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char ID[10];
	//	  int age;
	//	}
	//	pa[100];
		int n;
		int i;
		int t;
		int j;
		int k;
		String m = new String(new char[10]);
		char[][] str = new char[100][100];
		int[] a = new int[100];
		int[] b = new int[100];
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
				pa[i].ID = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pa[i].age = tempVar3;
			}
			a[i] = pa[i].age;
			str[i] = pa[i].ID;
		}
		for (i = 0,j = 0;i < n;i++,j++)
		{
			if (a[i] >= 60)
			{
			 b[j] = a[i];
			}

		}

		for (i = 0;i < n - 1;i++)
		{

				for (j = 0;j < n - 1 - i;j++)
				{

						if (b[j + 1] > b[j])
						{
							t = b[j];
							m = pa[j].ID;
							b[j] = b[j + 1];
							pa[j].ID = pa[j + 1].ID;
							b[j + 1] = t;
							pa[j + 1].ID = m;
						}

				}

		}



		for (i = 0;i < n;i++)
		{

			if (b[i] != 0)
			{
				System.out.printf("%s\n",pa[i].ID);
			}
		}
		for (i = 0;i < n;i++)
		{
				if (a[i] < 60)
				{
				System.out.printf("%s\n",str[i]);
				}
		}
	}



}

