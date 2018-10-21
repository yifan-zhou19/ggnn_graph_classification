package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct num
	//	{
	//		char a[100],b[100];
	//	}
	//	jian[100];
		int n;
		int j;
		int i;
		int m;
		int l;
		int p;
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
			jian[i].a = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			jian[i].b = tempVar3;
		}
		 m = String.valueOf(jian[i].a).length();
		 l = String.valueOf(jian[i].b).length();
		 for (j = m - 1,p = l - 1;j >= m - l,p >= 0;j--,p--)
		 {
				jian[i].a[j] = 48 + jian[i].a[j] - jian[i].b[p];
			 if (jian[i].a[j] < 48)
			 {
				 jian[i].a[j] += 10;
				jian[i].a[j - 1]--;
			 }
		 }
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",jian[i].a);
		}
	}

}

