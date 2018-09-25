public class s
{
	public int num;
	public int x;
	public int y;
	public int z;
}

package <missing>;

public class GlobalMembers
{
	public static s[] s = tangible.Arrays.initializeWithDefaultsInstances(100000);
	public static s s1 = new s();
	public static s s2 = new s();
	public static s s3 = new s();
	public static s A = new s();
	public static void Main(String[] args)
	{
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
				s[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[i].x = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				s[i].y = Integer.parseInt(tempVar4);
			}
			s[i].z = s[i].x + s[i].y;
		}
		if (s[0].z >= s[1].z)
		{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s1=s[0];
			s1.copyFrom(s[0]);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s2=s[1];
			s2.copyFrom(s[1]);
		}
		else
		{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s1=s[1];
			s1.copyFrom(s[1]);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s2=s[0];
			s2.copyFrom(s[0]);
		}
		if (s[2].z >= s1.z)
		{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: A=s1;
			A.copyFrom(s1);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s1=s[2];
			s1.copyFrom(s[2]);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s3=s2;
			s3.copyFrom(s2);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s2=A;
			s2.copyFrom(A);
		}
		else if (s[2].z < s2.z)
		{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s3=s[2];
			s3.copyFrom(s[2]);
		}
		else if (s[2].z >= s2.z != 0 && s[2].z < s1.z)
		{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s3=s2;
			s3.copyFrom(s2);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s2=s[2];
			s2.copyFrom(s[2]);
		}
		for (i = 3;i < n;i++)
		{
			if (s[i].z > s1.z)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s3=s2;
				s3.copyFrom(s2);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s2=s1;
				s2.copyFrom(s1);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s1=s[i];
				s1.copyFrom(s[i]);
			}
			else if (s[i].z < s3.z)
			{
				;
			}
			else if (s[i].z < s1.z && s[i].z> s3.z)
			{
				if (s[i].z > s2.z)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s3=s2;
					s3.copyFrom(s2);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s2=s[i];
					s2.copyFrom(s[i]);
				}
				else
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s3=s[i];
					s3.copyFrom(s[i]);
				}
			}
			else if (s[i].z == s1.z)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s3=s2;
				s3.copyFrom(s2);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s2=s[i];
				s2.copyFrom(s[i]);
			}
			else if (s[i].z == s2.z)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s3=s[i];
				s3.copyFrom(s[i]);
			}
		}
		System.out.printf("%d %d\n",s1.num,s1.z);
		System.out.printf("%d %d\n",s2.num,s2.z);
		System.out.printf("%d %d\n",s3.num,s3.z);
	}
}

