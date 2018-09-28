public class qian
{
public String a = new String(new char[20]);
	public int[] b = new int[1];
	public int[] c = new int[1];
	public String d = new String(new char[2]);
	public String e = new String(new char[2]);
	public int[] f = new int[1];
}

package <missing>;

public class GlobalMembers
{
	public static qian[] stu = tangible.Arrays.initializeWithDefaultqianInstances(101);
	public static void Main()
	{
		int exin = new int(int A,int B,char C,char D,int E);
		int n;
		int x;
		int y = 0;
		int total = 0;
		int i;

		int[] sum = new int[101];
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
				stu[i].a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].b[0] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].c[0] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(null, 1);
			if (tempVar5 != null)
			{
				stu[i].d = tangible.StringFunctions.changeCharacter(stu[i].d, 0, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(null, 1);
			if (tempVar6 != null)
			{
				stu[i].d = tangible.StringFunctions.changeCharacter(stu[i].d, 1, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(null, 1);
			if (tempVar7 != null)
			{
				stu[i].e = tangible.StringFunctions.changeCharacter(stu[i].e, 0, tempVar7);
			}
			String tempVar8 = ConsoleInput.scanfRead(null, 1);
			if (tempVar8 != null)
			{
				stu[i].e = tangible.StringFunctions.changeCharacter(stu[i].e, 1, tempVar8);
			}
			String tempVar9 = ConsoleInput.scanfRead();
			if (tempVar9 != null)
			{
				stu[i].f[0] = Integer.parseInt(tempVar9);
			}
		}
		for (i = 0;i < n;i++)
		{
			sum[i] = exin(stu[i].b[0], stu[i].c[0], stu[i].d.charAt(1), stu[i].e.charAt(1), stu[i].f[0]);

		}
		for (i = 0;i < n;i++)
		{
			total = total + sum[i];
		}

		x = sum[0];
		for (i = 1;i < n;i++)
		{
			if (sum[i] > x)
			{
				x = sum[i];
				y = i;
			}
		}
		System.out.printf("%s\n",stu[y].a);

		System.out.printf("%d\n%d",x,total);

	}
	public static int exin(int A,int B,char C,char D,int E)
	{
		   int k = 0;
			if (A > 80 && E >= 1)
			{
				k = k + 8000;
			}
			if (A > 85 && B > 80)
			{
				k = k + 4000;
			}
			if (A > 90)
			{
				k = k + 2000;
			}
			if (A > 85 && D == 'Y')
			{
				k = k + 1000;
			}
			if (B > 80 && C == 'Y')
			{
				k = k + 850;
			}
			return (k);
	}
}

