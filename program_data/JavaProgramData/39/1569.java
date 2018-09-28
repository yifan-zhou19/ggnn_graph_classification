public class student
{
	public String name = new String(new char[30]);
	public int qimocj;
	public int banjicj;
	public char ganbu;
	public char xibu;
	public int lunwen;
	public int jiangjin;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		student[] ren = {0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
		student max = new student();
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
				ren[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				ren[i].qimocj = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				ren[i].banjicj = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				ren[i].ganbu = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				ren[i].xibu = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				ren[i].lunwen = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (ren[i].qimocj > 80 && ren[i].lunwen >= 1)
			{
				ren[i].jiangjin += 8000;
			}
			if (ren[i].qimocj > 85 && ren[i].banjicj > 80)
			{
				ren[i].jiangjin += 4000;
			}
			if (ren[i].qimocj > 90)
			{
				ren[i].jiangjin += 2000;
			}
			if (ren[i].qimocj > 85 && ren[i].xibu == 'Y')
			{
				ren[i].jiangjin += 1000;
			}
			if (ren[i].banjicj > 80 && ren[i].ganbu == 'Y')
			{
				ren[i].jiangjin += 850;
			}
		}
		max.jiangjin = 0;
		for (i = 0;i < n;i++)
		{
			sum += ren[i].jiangjin;
			if (ren[i].jiangjin > max.jiangjin)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: max=ren[i];
				max.copyFrom(ren[i]);
			}
		}
		System.out.printf("%s\n%d\n%d\n",max.name,max.jiangjin,sum);
		return 0;
	}




}

