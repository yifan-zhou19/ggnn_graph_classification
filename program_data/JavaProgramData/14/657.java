public class student
{
	public int nn;
public int nnn;
public int nmn;
public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static student[] st = tangible.Arrays.initializeWithDefaultstudentInstances(100002);
	public static student tmp = new student();
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			st[i].nn = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			st[i].nnn = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			st[i].nmn = Integer.parseInt(tempVar4);
		}
	st[i].sum = st[i].nnn + st[i].nmn;
	}
	for (i = 1;i <= 3;i++)
	{
		  for (j = i + 1;j <= n;j++)
		  {
			  if (st[i].sum < st[j].sum)
			  {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: tmp=st[i];
			  tmp.copyFrom(st[i]);
	  st[i] = st[j];
	  st[j] = tmp;
			  }

		  }
	}
	  for (i = 1;i <= 3;i++)
	  {
		  System.out.printf("%d %d",st[i].nn,st[i].sum);
	  if (i < 3)
	  {
	  System.out.print("\n");
	  }
	  }
	  return 0;
	}
}

