public class in
{
	   public float h;
}

package <missing>;

public class GlobalMembers
{
	public static in[] nan = tangible.Arrays.initializeWithDefaultinInstances(41);
	public static in[] nv = tangible.Arrays.initializeWithDefaultinInstances(41);
	public static int cmp1(Object a, Object b)
	{
		in c = (in)a;
		in d = (in)b;
		return ((c.h - d.h) > 0)?1:-1;
	}
	public static int cmp2(Object a, Object b)
	{
		in c = (in)a;
		in d = (in)b;
		return ((-c.h + d.h) > 0)?1:-1;
	}

	public static int Main()
	{
		int num;
		int i;
		final String ssex = "";
		float hh;
		int numnan = 0;
		int numnv = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(nan,0,41);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(nv,0,41);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ssex = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				hh = Float.parseFloat(tempVar3);
			}
			if (strcmp(ssex,"male") == 0)
			{
			   nan[numnan].h = hh;
			   numnan++;
			}
			else
			{
				nv[numnv].h = hh;
				numnv++;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(ssex,'\0',10);
		}
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		qsort(nan,numnan,sizeof(nan[0]),cmp1);
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		qsort(nv,numnv,sizeof(nv[0]),cmp2);
		for (i = 0;i < numnan;i++)
		{
			System.out.printf("%.2f ",nan[i].h);
		}
		for (i = 0;i < numnv;i++)
		{
			if (i != numnv - 1)
			{
			   System.out.printf("%.2f ",nv[i].h);
			}
			else
			{
				System.out.printf("%.2f\n",nv[i].h);
			}
		}
		   return 0;
	}

}

