package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		float[] a = new float[n];
		float[] b = new float[n];
		float s;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[0] = Float.parseFloat(tempVar3);
		}
		s = b[0] / a[0];
		for (i = 1;i < n;i++)
		{
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  a[i] = Float.parseFloat(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead(" ");
		  if (tempVar5 != null)
		  {
			  b[i] = Float.parseFloat(tempVar5);
		  }
		  if (Math.abs(b[i] / a[i] - s) > 0.05)
		  {
			if (b[i] / a[i] - s > 0F)
			{
			System.out.print("better\n");
			}
			else
			{
			System.out.print("worse\n");
			}
		  }
		  else
		  {
		  System.out.print("same\n");
		  }
		}
		System.in.read();
		System.in.read();
	}
}

