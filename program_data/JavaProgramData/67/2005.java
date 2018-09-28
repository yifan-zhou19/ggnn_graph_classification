public class jiegou
{
	   public double renshu;
	   public double youxiao;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		jiegou[] abc = tangible.Arrays.initializeWithDefaultjiegouInstances(20);
		int i = 0;
		for (i = 0;i < n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 abc[i].renshu = Double.parseDouble(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 abc[i].youxiao = Double.parseDouble(tempVar3);
						 }
		}

		for (i = 1;i < n;i++)
		{
											  if ((abc[0].youxiao / abc[0].renshu) < (abc[i].youxiao / abc[i].renshu - 0.05))
											  {
												  System.out.print("better\n");
											  }
											  else if ((abc[0].youxiao / abc[0].renshu) > (abc[i].youxiao / abc[i].renshu + 0.05))
											  {
												  System.out.print("worse\n");
											  }
											  else
											  {
												  System.out.print("same\n");
											  }
		}

											  return 0;
	}


}

