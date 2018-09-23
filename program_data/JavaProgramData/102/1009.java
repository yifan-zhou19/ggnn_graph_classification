package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//	   char s[10];
	//	   double h;
	//
	//	}
	//	a[41],t;
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
			  a[i].s = tempVar2;
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  a[i].h = tempVar3;
		  }

		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (strcmp(a[j].s,"male") == 0)
				{
					if (strcmp(a[j].s,a[j + 1].s) == 0)
					{
						if (a[j].h > a[j + 1].h)
						{
							t = a[j];
							a[j] = a[j + 1];
							a[j + 1] = t;

						}
					}

				}
				else if (strcmp(a[j].s,"female") == 0)
				{
					if (strcmp(a[j].s,a[j + 1].s) == 0)
					{
							if (a[j].h < a[j + 1].h)
							{
							t = a[j];
							a[j] = a[j + 1];
							a[j + 1] = t;

							}

					}
					else
					{
							t = a[j];
							a[j] = a[j + 1];
							a[j + 1] = t;



					}



				}

			}


		}
		System.out.printf("%.2lf",a[0].h);
		for (i = 1;i < n;i++)
		{
		   System.out.printf(" %.2lf",a[i].h);

		}



		return 0;
	}

}

