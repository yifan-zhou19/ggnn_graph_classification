package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct weight
	//	{
	//		char name;
	//		int wei;
	//	};
		weight a1 = new weight();
		weight a2 = new weight();
		weight a3 = new weight();
		weight a4 = new weight();
		a1.name = 'z';
		a2.name = 'q';
		a3.name = 's';
		a4.name = 'l';
		for (a1.wei = 1;a1.wei <= 5;a1.wei++)
		{
			for (a2.wei = 1;a2.wei <= 5;a2.wei++)
			{
				if (a2.wei == a1.wei)
				{
					continue;
				}
				for (a3.wei = 1;a3.wei <= 5;a3.wei++)
				{
					if (a3.wei == a2.wei || a3.wei == a1.wei)
					{
						continue;
					}
					for (a4.wei = 1;a4.wei <= 5;a4.wei++)
					{
						if (a4.wei == a3.wei || a4.wei == a2.wei || a4.wei == a1.wei)
						{
							continue;
						}
						if (a1.wei + a2.wei == a3.wei + a4.wei && a1.wei + a3.wei < a2.wei && a1.wei + a4.wei> a2.wei + a3.wei)
						{
							for (int i = 5;i >= 1;i--)
							{
								if (a1.wei == i)
								{
									System.out.print(a1.name);
									System.out.print(" ");
									System.out.print((a1.wei * 10));
									System.out.print("\n");
								}
								if (a2.wei == i)
								{
									System.out.print(a2.name);
									System.out.print(" ");
									System.out.print((a2.wei * 10));
									System.out.print("\n");
								}
								if (a3.wei == i)
								{
									System.out.print(a3.name);
									System.out.print(" ");
									System.out.print((a3.wei * 10));
									System.out.print("\n");
								}
								if (a4.wei == i)
								{
									System.out.print(a4.name);
									System.out.print(" ");
									System.out.print((a4.wei * 10));
									System.out.print("\n");
								}
							}
						}
					}
				}
			}
		}
			return 0;
	}
}
