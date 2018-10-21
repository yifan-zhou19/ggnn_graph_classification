public class Student
{
	public int id;
	public int c;
	public int m;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		Student temp = new Student();
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		int i;
		int n;
		s1.sum = s2.sum = s3.sum = -1;
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
				temp.id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				temp.c = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				temp.m = Integer.parseInt(tempVar4);
			}
			temp.sum = temp.c + temp.m;
			if (temp.sum > s1.sum)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s3=s2;
				s3.copyFrom(s2);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s2=s1;
				s2.copyFrom(s1);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s1=temp;
				s1.copyFrom(temp);
			}
			else if (temp.sum > s2.sum)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s3=s2;
				s3.copyFrom(s2);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s2=temp;
				s2.copyFrom(temp);
			}
			else if (temp.sum > s3.sum)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s3=temp;
				s3.copyFrom(temp);
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",s1.id,s1.sum,s2.id,s2.sum,s3.id,s3.sum);
	}


}

