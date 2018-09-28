package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
		int s = 0;
		int t = 0;
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
			  a = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b = Integer.parseInt(tempVar3);
		  }
		  if ((a >= 90 && a <= 140) && (b >= 60 && b <= 90))
		  {
			t++;
			c = 1;
		  }
		  else if (!((a >= 90 && a <= 140) && (b >= 60 && b <= 90)))
		  {
			t = 0;
		  }
		  if (t > s)
		  {
			  s = t;
		  }
		}
		System.out.printf("%d",s);

		return 0;
	}

}

