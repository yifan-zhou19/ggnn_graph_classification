package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct st
	//	{
	//		int id;
	//	int yu;
	//	int ma;
	//	};
		int n;
		int i;
		st st1 = new st(0,0,0);
		st st2 = new st(0,0,0);
		st st3 = new st(0,0,0);
		st stn = new st();
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
				stn.id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stn.yu = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stn.ma = tempVar4;
			}
			if (stn.yu + stn.ma > st1.yu + st1.ma)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: st3=st2;
				st3.copyFrom(st2);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: st2=st1;
				st2.copyFrom(st1);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: st1=stn;
				st1.copyFrom(stn);
			}
			else
			{
				if (stn.yu + stn.ma > st2.yu + st2.ma)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: st3=st2;
					st3.copyFrom(st2);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: st2=stn;
					st2.copyFrom(stn);
				}
				else
				{
					if (stn.yu + stn.ma > st3.yu + st3.ma)
					{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: st3=stn;
						st3.copyFrom(stn);
					}
				}
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d",st1.id,st1.yu + st1.ma,st2.id,st2.yu + st2.ma,st3.id,st3.yu + st3.ma);
	}
}

