public class grade
{
	public String ID = new String(new char[20]);
	public int math;
	public int cn;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int max;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *s;
		int s;
	grade[] stu = tangible.Arrays.initializeWithDefaultgradeInstances(100000);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		if (n == 1)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[0].ID = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[0].math = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[0].cn = Integer.parseInt(tempVar4);
			}
			System.out.printf("%s %d",stu[0].ID,stu[0].math + stu[0].cn);
		}
		else if (n == 2)
		{
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				stu[0].ID = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				stu[0].math = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[0].cn = Integer.parseInt(tempVar7);
			}
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				stu[1].ID = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				stu[1].math = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				stu[1].cn = Integer.parseInt(tempVar10);
			}
			if (stu[0].math + stu[0].cn > stu[1].math + stu[1].cn)
			{
				System.out.printf("%s %d\n",stu[0].ID,stu[0].math + stu[0].cn);
				System.out.printf("%s %d\n",stu[1].ID,stu[1].math + stu[1].cn);
			}
			else
			{
				System.out.printf("%s %d\n",stu[0].ID,stu[0].math + stu[0].cn);
				System.out.printf("%s %d\n",stu[1].ID,stu[1].math + stu[1].cn);
			}
		}
		else if (n >= 2)
		{
			for (i = 0;i < n;i++)
			{
				String tempVar11 = ConsoleInput.scanfRead();
				if (tempVar11 != null)
				{
					stu[i].ID = tempVar11.charAt(0);
				}
				String tempVar12 = ConsoleInput.scanfRead(" ");
				if (tempVar12 != null)
				{
					stu[i].math = Integer.parseInt(tempVar12);
				}
				String tempVar13 = ConsoleInput.scanfRead(" ");
				if (tempVar13 != null)
				{
					stu[i].cn = Integer.parseInt(tempVar13);
				}
				s[i] = stu[i].math + stu[i].cn;
			}
			for (i = 1;i < 4;i++)
			{
				max = s[0];
				for (j = 1;j < n;j++)
				{
					if (s[j] > max)
					{
						max = s[j];
						m = j;
					}
				}
				System.out.printf("%s %d\n",stu[m].ID,max);
				s[m] = 0;
			}
		}
		return 0;
	}
}

