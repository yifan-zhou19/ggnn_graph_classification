package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct shu
	//	{
	//		int bian;
	//		char name[26];
	//	};

		shu[] a = tangible.Arrays.initializeWithDefaultshuInstances(1000);
		int n;
		int i;
		int j;
		int[] l = new int[1000];
		int[] b = new int[26];
		int most;
		int good;
		int k;

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
				a[i].bian = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].name = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			l[i] = String.valueOf(a[i].name).length();
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < l[i];j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (a[i].name[j] == 65 + k)
					{
						b[k]++;
					}
				}
			}
		}

					most = b[0];
					for (i = 0;i < 26;i++)
					{
						if (b[i] > most)
						{
							most = b[i];
							good = i;
						}
					}
						System.out.printf("%c\n",65 + good);
						System.out.printf("%d\n",most);


						for (i = 0;i < n;i++)
						{
							for (j = 0;j < 26;j++)
							{
								if (a[i].name[j] == 65 + good)
								{
									System.out.printf("%d\n",a[i].bian);
								}
							}
						}
	}





}

