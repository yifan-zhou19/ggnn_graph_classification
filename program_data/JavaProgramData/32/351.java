//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
	public String a = new String(new char[200]);
public String b = new String(new char[200]);
public int[] as = new int[200];
public int[] bs = new int[200];
public int ad;
public int bd;
}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass[] num = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(200);
	public static void Main()
	{
		int n;
		int i;
		int j;
		int x;
		int y;
		int[][] z = new int[200][200];
		int h = 0;
		int k;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i].a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead("\n");
			if (tempVar3 != null)
			{
				num[i].b = tempVar3.charAt(0);
			}
			num[i].ad = String.valueOf(num[i].a).length();
			num[i].bd = String.valueOf(num[i].b).length();
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			num[n - 1].a = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead("\n");
		if (tempVar5 != null)
		{
			num[n - 1].b = tempVar5.charAt(0);
		}
		num[n - 1].ad = String.valueOf(num[n - 1].a).length();
		num[n - 1].bd = String.valueOf(num[n - 1].b).length();
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < num[i].ad;j++)
			{
				num[i].as[j] = num[i].a.charAt(j) - 48;
			}
			for (k = 0;k < num[i].bd;k++)
			{
				num[i].bs[k] = num[i].b.charAt(k) - 48;
			}
		}
		for (i = 0;i < n;i++)
		{
			h = 0;
			for (j = num[i].ad - 1,k = num[i].bd - 1;k >= 0;k--,j--)
			{
				if (num[i].as[j] - num[i].bs[k] < 0)
				{
					z[i][h] = num[i].as[j] - num[i].bs[k] + 10;
					num[i].as[j - 1] = num[i].as[j - 1] - 1;
					h = h + 1;
				}
				if (num[i].as[j] - num[i].bs[k] >= 0)
				{
					z[i][h] = num[i].as[j] - num[i].bs[k];
					h = h + 1;
				}
			}
				for (;j >= 0;j--)
				{
					if (num[i].as[j] >= 0)
					{
						z[i][h] = num[i].as[j];
						h = h + 1;
					}
					if (num[i].as[j] < 0)
					{
						z[i][h] = num[i].as[j] + 10;
						num[i].as[j - 1] = num[i].as[j - 1] - 1;
						h = h + 1;
					}
				}
			for (t = num[i].ad - 1;t >= 0;t--)
			{
				System.out.printf("%d",z[i][t]);
			}
			System.out.print("\n");
		}
	}
}

