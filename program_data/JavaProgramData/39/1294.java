public class student
{
	public String name = new String(new char[20]);
 public int qimo;
 public int banji;
 public char xs;
 public char xb;
 public int lw;
}

package <missing>;

public class GlobalMembers
{
	public static int f(student p)
	{
		int num = 0;
		if (((p.qimo) > 80) && ((p.lw) >= 1))
		{
			num = num + 8000;
		}
		if (((p.qimo) > 85) && ((p.banji) > 80))
		{
			num = num + 4000;
		}
		if ((p.qimo) > 90)
		{
			num = num + 2000;
		}
		if (((p.qimo) > 85) && ((p.xb) == 'Y'))
		{
			num = num + 1000;
		}
		if (((p.banji) > 80) && ((p.xs) == 'Y'))
		{
			num = num + 850;
		}
		return num;
	}



	public static void Main()
	{
		int f = struct student * p;
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		student * p = new student();
		int n;
		int i;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *ap;
		int ap;
		int b = 0;
		int k;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=stu;
		p.copyFrom(stu);
		ap = a;
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
				p.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.qimo = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.banji = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p.xs = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p.xb = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p.lw = Integer.parseInt(tempVar7);
			}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=p+1;
			p.copyFrom(p + 1);
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=stu;
		p.copyFrom(stu);
		for (i = 0;i < n;i++)
		{

			*(ap + i) = f(p + i);
			b = b + (*(ap + i));
		}


		k = a[0];
		for (i = 0;i < n;i++)
		{
			if (a[i] > k)
			{
				k = a[i];
				m = i;
			}
		}
		System.out.printf("%s\n%d\n%d\n",(stu + m).name,k,b);
	}
}

