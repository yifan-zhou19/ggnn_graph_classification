public class st
{
	  public int a;
	  public int b;
}

package <missing>;

public class GlobalMembers
{
	public static st[] s = tangible.Arrays.initializeWithDefaultstInstances(100000);
	public static int comp(Object a, Object b)
	{
		return ((st)b).b - ((st)a).b;
	}
	public static int Main()
	{
		int i;
		int n;
		int a;
		int b;
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
							s[i].a = Integer.parseInt(tempVar2);
						}
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							a = Integer.parseInt(tempVar3);
						}
						String tempVar4 = ConsoleInput.scanfRead();
						if (tempVar4 != null)
						{
							b = Integer.parseInt(tempVar4);
						}
						s[i].b = a + b;
		}
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		qsort(s,n,sizeof(st),comp);
		System.out.printf("%d %d\n%d %d\n%d %d",s[0].a,s[0].b,s[1].a,s[1].b,s[2].a,s[2].b);
		//getch();
		return 0;
	}

}

