package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		int x;
		int t = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		float h;
	//		char s[SEX+1];
	//	}
	//	a[MAX];
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i].h = tempVar3;
		}
		}

		for (i = 0;i < n;i++)
		{
			k = i;
			if (strcmp(a[i].s,"male") == 0)
			{
				t++;
				for (j = i + 1;j < n;j++)
				{
					if (strcmp(a[j].s,"male") == 0 && a[j].h < a[k].h)
					{
					k = j;
					}
					else
					{
						continue;
					}
				}
			 if (t == 1)
			 {
				 System.out.printf("%.2f",a[k].h);
			 }
			  else
			  {
				  System.out.printf(" %.2f",a[k].h);
			  }



				 a[k] = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			k = i;
			if (strcmp(a[i].s,"female") == 0)
			{
				for (j = i + 1;j < n;j++)
				{
					if (strcmp(a[j].s,"female") == 0 && a[j].h > a[k].h)
					{
						k = j;
					}
				}

					 System.out.printf(" %.2f",a[k].h);


				 a[k] = a[i];
			}
			else
			{
				continue;
			}
		}
	}
}

