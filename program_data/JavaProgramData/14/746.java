public class point
{
		   public int id;
		   public int a;
		   public int b;
		   public int c;
}

package <missing>;

public class GlobalMembers
{
			   public static point[] s = tangible.Arrays.initializeWithDefaultpointInstances(100000);
			   public static point tmp = new point();
	public static void Main(String[] args)
	{

		int i;
		int n;
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
				s[i].id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[i].a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				s[i].b = Integer.parseInt(tempVar4);
			}
			s[i].c = s[i].a + s[i].b;
		}
		for (i = 1;i < n;i++)
		{
			if (s[i].c > s[0].c)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: tmp=s[0];
				tmp.copyFrom(s[0]);
				s[0] = s[i];
				s[i] = tmp;
			}
		}
		for (i = 2;i < n;i++)
		{
			if (s[i].c > s[1].c)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: tmp=s[1];
				tmp.copyFrom(s[1]);
				s[1] = s[i];
				s[i] = tmp;
			}
		}
		for (i = 3;i < n;i++)
		{
			if (s[i].c > s[2].c)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: tmp=s[2];
				tmp.copyFrom(s[2]);
				s[2] = s[i];
				s[i] = tmp;
			}
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",s[i].id,s[i].c);
		}
	}

}

