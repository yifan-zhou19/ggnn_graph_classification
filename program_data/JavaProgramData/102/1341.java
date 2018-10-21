package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char gender[6];
	//		float h;
	//	}
	//	a[50],b[50],c[50],t;
		int n;
		int i;
		int j = 0;
		int k = 0;
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
				a[i].gender = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].h = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (strcmp(a[i].gender,"male") == 0)
			{
				b[j] = a[i];
				j++;
			}
			else
			{
				c[k] = a[i];
				k++;
			}
		}
		int nan;
		int nv;
		nan = j;
		nv = k;
		for (i = 0;i < nan;i++)
		{
			for (j = nan - 1;j > i;j--)
			{
				if (b[j].h < b[j - 1].h)
				{
					t = b[j];
					b[j] = b[j - 1];
					b[j - 1] = t;
				}
			}
		}
		for (i = 0;i < nv;i++)
		{
			for (j = nv - 1;j > i;j--)
			{
				if (c[j].h > c[j - 1].h)
				{
					t = c[j];
					c[j] = c[j - 1];
					c[j - 1] = t;
				}
			}
		}
		System.out.printf("%1.2f",b[0].h);
		for (i = 1;i < nan;i++)
		{
			System.out.printf(" %1.2f",b[i].h);
		}
		for (i = 0;i < nv;i++)
		{
			System.out.printf(" %1.2f",c[i].h);
		}
	}
}

