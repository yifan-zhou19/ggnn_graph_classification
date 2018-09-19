public class student
   {
	  public int n;
	  public int y;
	  public int s;
   }

package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
	return (((student)b).y > ((student)a).y != 0?1:-1);
	}

	public static int Main()
	{
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		student[] s = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
		for (int i = 0;i < num;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					s[i].n = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					s[i].y = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					s[i].s = Integer.parseInt(tempVar4);
				}
				s[i].y = s[i].y + s[i].s;
		}
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		qsort(s,num,sizeof(s[0]),cmp);
		for (int i = 0;i < 3;i++)
		{
		 System.out.printf("%d %d\n",s[i].n,s[i].y);
		}
	}
}

