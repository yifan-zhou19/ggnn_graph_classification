package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int o = 0;
		int oz;
		int t = 0;
		int tz;
		int th = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int h,z;
	//	}
	//	s[100000];
		  for (i = 0;i < n;i++)
		  {
			int h0;
			int x0;
			int y0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h0 = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x0 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				y0 = Integer.parseInt(tempVar4);
			}
			s[i].h = h0;
			s[i].z = x0 + y0;
		  }
		for (i = 0;i < n;i++)
		{
			if (s[i].z > o)
			{
				o = s[i].z;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (s[i].z == o)
			{
				oz = i;
				System.out.printf("%d %d\n",s[i].h,s[i].z);
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((i != oz) && (s[i].z > t))
			{
				t = s[i].z;
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((i != oz) && (s[i].z == t))
			{
				tz = i;
				System.out.printf("%d %d\n",s[i].h,s[i].z);
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((i != oz) && (i != tz) && (s[i].z > th))
			{
				th = s[i].z;
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((i != oz) && (i != tz) && (s[i].z == th))
			{
				System.out.printf("%d %d\n",s[i].h,s[i].z);
				break;
			}
		}
		return 0;
	}

}

