public class stu
{
	public int num;
	public int yw;
	public int sx;
	public int zf;
}

package <missing>;

public class GlobalMembers
{
	public static stu s1 = new stu();
	public static stu s2 = new stu();
	public static stu s3 = new stu();
	public static stu s = new stu();
	public static int Main()
	{

		int n;
		int i;
		s1.zf = s2.zf = s3.zf = -1;
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
				s.num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s.yw = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s.sx = Integer.parseInt(tempVar4);
			}
			s.zf = s.yw + s.sx;
			if (s.zf > s1.zf)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s3=s2;
				s3.copyFrom(s2);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s2=s1;
				s2.copyFrom(s1);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s1=s;
				s1.copyFrom(s);
			}
			else if (s.zf > s2.zf)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s3=s2;
				s3.copyFrom(s2);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s2=s;
				s2.copyFrom(s);
			}
			else if (s.zf > s3.zf)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s3=s;
				s3.copyFrom(s);
			}

		}

		System.out.printf("%d %d\n",s1.num,s1.zf);
		System.out.printf("%d %d\n",s2.num,s2.zf);
		System.out.printf("%d %d",s3.num,s3.zf);

		return 0;
	}
}

