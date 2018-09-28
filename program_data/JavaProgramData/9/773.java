public class x
{
	public String a = new String(new char[10]);
public int b;
}

package <missing>;

public class GlobalMembers
{
	public static x[] y = tangible.Arrays.initializeWithDefaultxInstances(100);
	public static void Main()
	{
		int n;
		int i;
		int j;
		int m;
	String s = new String(new char[10]);
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
			y[i].a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y[i].b = Integer.parseInt(tempVar3);
		}
	}
	for (j = 0;j < n - 1;j++)
	{
	 for (i = 0;i < n - 1 - j;i++)
	 {
		  if (y[i].b < y[i + 1].b && y[i + 1].b >= 60)
		  {
		   s = y[i].a;
		y[i].a = y[i + 1].a;
		y[i + 1].a = s;
		m = y[i].b;
		y[i].b = y[i + 1].b;
		y[i + 1].b = m;
		  }
	 }
	}
	for (i = 0;i < n;i++)
	{
	System.out.printf("%s\n",y[i].a);
	}
	}

}

