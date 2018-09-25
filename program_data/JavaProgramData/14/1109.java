package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int id,chin,math,z;
	//	}
	//	p[100000];
		int id;
		int math;
		int chin;
		int z;
		int i;
		int n;
		int f;
		int s;
		int t;
		int id1;
		int id2;
		int id3;
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
				id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				chin = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				math = Integer.parseInt(tempVar4);
			}
			p[i].id = id;
			p[i].math = math;
			p[i].chin = chin;
		}

		for (i = 0;i < n;i++)
		{
			id = p[i].id;
			math = p[i].math;
			chin = p[i].chin;
			z = math + chin;

			if (i == 0)
			{
				f = s = t = z;
				id1 = id2 = id3 = id;
			}
			else if (i == 1)
			{
				if (z > f)
				{
					t = s;
					id3 = id2;
					s = f;
					id2 = id1;
					f = z;
					id1 = id;
				}
				else
				{
					t = s = z;
					id2 = id3 = id;
				}
			}
			else
			{
				if (z > f)
				{
					t = s;
					id3 = id2;
					s = f;
					id2 = id1;
					f = z;
					id1 = id;
				}
				else if (z > s)
				{
					t = s;
					id3 = id2;
					s = z;
					id2 = id;
				}
				else if (z > t)
				{
					t = z;
					id3 = id;
				}
			}
		}
		System.out.printf("%d %d\n",id1,f);
		System.out.printf("%d %d\n",id2,s);
		System.out.printf("%d %d\n",id3,t);
		return 0;
	}






}

