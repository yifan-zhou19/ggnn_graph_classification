package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char id[10];
	//		int age;
	//	}
	//	br[100];

		int n;
		int i;
		int j;
		int mid;
		int k;

		String s = new String(new char[10]);

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
				br[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				br[i].age = tempVar3;
			}

		}

		for (k = 0;k < n;k++)
		{
			for (i = 0;i < n;i++)
			{
				if (br[i].age >= 60)
				{
					for (j = i + 1;j < n;j++)
					{
						if (br[j].age >= 60)
						{
							if (br[j].age > br[i].age)
							{
								mid = br[i].age;
								br[i].age = br[j].age;
								br[j].age = mid;

								s = br[i].id;
								br[i].id = br[j].id;
								br[j].id = s;
							}
							break;
						}
					}
				}
			}
		}




		for (i = 0;i < n;i++)
		{
			if (br[i].age >= 60)
			{
				System.out.printf("%s\n",br[i].id);
			}
		}

		for (i = 0;i < n;i++)
		{
			if (br[i].age < 60)
			{
				System.out.printf("%s\n",br[i].id);
			}
		}


		return 0;
	}


}

