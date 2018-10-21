package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char id[10];
	//		int a;
	//	}
	//	patients[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct old
	//	{
	//		char ido[10];
	//		int ao;
	//	}
	//	olds[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct young
	//	{
	//		char idy[10];
	//		int ay;
	//	}
	//	youngs[100];
		int n;
		int y = 0;
		int o = 0;
		int so = 0;
		int sy = 0;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String f = new String(new char[10]);
		for (int j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				patients[j].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				patients[j].a = tempVar3;
			}
			if (patients[j].a < 60)
			{
				youngs[y].idy = patients[j].id;
				youngs[y].ay = patients[j].a;
				y++;
			}
			if (patients[j].a >= 60)
			{
				olds[o].ido = patients[j].id;
				olds[o].ao = patients[j].a;
				o++;
			}
		}
			for (int r = o - 1;r > 0;r--)
			{
				for (int i = 0;i < r;i++)
				{
					if (olds[i].ao < olds[i + 1].ao)
					{
						e = olds[i + 1].ao;
						olds[i + 1].ao = olds[i].ao;
						olds[i].ao = e;
						f = olds[i + 1].ido;
						olds[i + 1].ido = olds[i].ido;
						olds[i].ido = f;
					}
				}
			}
			for (int l = 0;l <= o - 1;l++)
			{
				System.out.printf("%s\n",olds[l].ido);
			}
			for (int m = 0;m <= y - 1;m++)
			{
				System.out.printf("%s\n",youngs[m].idy);
			}
		return 0;
	}


}

