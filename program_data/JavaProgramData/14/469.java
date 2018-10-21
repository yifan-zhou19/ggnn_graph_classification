public class student
 {
	public int id;
 public int chinese;
 public int maths;
 public int total;
 }

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		student s = new student();
		student s1 = new student();
		student s2 = new student();
		student s3 = new student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s2.total = s1.total = s3.total = -1;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s.id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s.chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				s.maths = Integer.parseInt(tempVar4);
			}
			s.total = s.chinese + s.maths;
			if (s.total > s1.total)
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
			else if (s.total > s2.total)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s3=s2;
				s3.copyFrom(s2);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s2=s;
				s2.copyFrom(s);
			}
			else if (s.total > s3.total)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s3=s;
				s3.copyFrom(s);
			}
		}

		System.out.printf("%d %d\n",s1.id,s1.total);
		System.out.printf("%d %d\n",s2.id,s2.total);
		System.out.printf("%d %d\n",s3.id,s3.total);

	}
}

