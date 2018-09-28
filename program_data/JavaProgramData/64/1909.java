package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'q', so pointers on this parameter are left unchanged:
	public static float ju(int * p, int * q)
	{
	float s = 0F;
	int i = 0;
	for (i = 0;i < 3;i++)
	{
		s = (*(p) - *(q)) * (*(p) - *(q)) + s;
	p++,q++;
	}
	return s = Math.sqrt(s);
	}

	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct s
	//	{
	//		int i;
	//		int j;
	//		float l;
	//	}
	//	s[100],t;

		int n;
		int[][] a = new int[11][3];
		int i;
		int j;
		int p = 0;
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
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i][2] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				s[p].i = i,s[p].j = j,s[p].l = ju(a[i], a[j]),p++;
			}
		}
		for (i = 0;i < p;i++)
		{
			for (j = i + 1;j < p;j++)
			{
				if (s[i].l < s[j].l)
				{
					t = s[i],s[i] = s[j],s[j] = t;
				}
				else if (s[i].l == s[j].l)
				{
				if (s[i].i > s[j].i)
				{
					t = s[i],s[i] = s[j],s[j] = t;
				}
				else if (s[i].i == s[j].i && s[i].j > s[j].j)
				{
					t = s[i],s[i] = s[j],s[j] = t;
				}
				}
			}
		}

		for (i = 0;i < p;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",a[s[i].i][0],a[s[i].i][1],a[s[i].i][2],a[s[i].j][0],a[s[i].j][1],a[s[i].j][2],s[i].l);
		}
	}
}

