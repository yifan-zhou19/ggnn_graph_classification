public class S
	{
		public int ID;
		public int c;
		public int m;
		public int a;
	}

package <missing>;

public class GlobalMembers
{
	public static int mycmp(Object e1, Object e2)
	{
		return ((S)e2).a - ((S)e1).a;
	}

	public static void Main()
	{
		S[] stu = tangible.Arrays.initializeWithDefaultSInstances(100010);
		int i;
		int j;
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
				(stu + i).ID = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(stu + i).c = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(stu + i).m = tempVar4;
			}
			(stu + i).a = (stu + i).c + (stu + i).m;
		}
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		qsort(stu,n,sizeof(stu),mycmp);
		for (i = 0;i <= 2;i++)
		{
			System.out.printf("%d %d\n",(stu + i).ID,(stu + i).a);
		}
	}
}

