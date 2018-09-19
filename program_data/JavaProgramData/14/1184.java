package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//	   int id,chi,math,sum;
	//	}
	//	s,s1,s2,s3;
		s1.sum = s2.sum = s3.sum = 0;
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
				s.id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s.chi = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s.math = tempVar4;
			}
			s.sum = s.chi + s.math;
			if (s.sum > s1.sum)
			{
				s3 = s2;
				s2 = s1;
				s1 = s;
			}
			else if (s.sum > s2.sum)
			{
				 s3 = s2,s2 = s;
			}
			else if (s.sum > s3.sum)
			{
				 s3 = s;
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",s1.id,s1.sum,s2.id,s2.sum,s3.id,s3.sum);
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}



}

