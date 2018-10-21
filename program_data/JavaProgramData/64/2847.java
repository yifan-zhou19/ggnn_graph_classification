package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct dian
	//	{
	//		int x,y,z;
	//	}
	//	dians[45];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct suoyou
	//	{
	//		struct dian qian;
	//		struct dian hou;
	//		double ji;
	//	}
	//	suoyous[45],e;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				dians[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				dians[i].y = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				dians[i].z = tempVar4;
			}
		}
		int k;
		int l = 0;
		for (i = 0;i < n;i++)
		{
			for (k = i + 1;k < n;k++)
			{
				suoyous[l].qian = dians[i];
				suoyous[l].hou = dians[k];
				suoyous[l].ji = Math.sqrt((dians[i].x - dians[k].x) * (dians[i].x - dians[k].x) + (dians[i].y - dians[k].y) * (dians[i].y - dians[k].y) + (dians[i].z - dians[k].z) * (dians[i].z - dians[k].z));
				l++;
			}
		}
		for (i = 1;i <= n * (n - 1) / 2;i++)
		{
			for (k = 0;k < n * (n - 1) / 2 - i;k++)
			{
				if (suoyous[k].ji < suoyous[k + 1].ji)
				{
					e = suoyous[k];
					suoyous[k] = suoyous[k + 1];
					suoyous[k + 1] = e;
				}
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",suoyous[i].qian.x,suoyous[i].qian.y,suoyous[i].qian.z,suoyous[i].hou.x,suoyous[i].hou.y,suoyous[i].hou.z,suoyous[i].ji);
		}
		return 0;
	}
}

