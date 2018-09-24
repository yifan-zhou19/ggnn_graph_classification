package <missing>;

public class GlobalMembers
{
	public static int win = 0;
	public static void jzb(int a,int b)
	{
		 if (a == 0)
		 {
			 if (b == 1)
			 {
				 win++;
			 }
			 else if (b == 2)
			 {
				 win--;
			 }
		 }
		 else if (a == 1)
		 {
			  if (b == 2)
			  {
				  win++;
			  }
			 else if (b == 0)
			 {
				 win--;
			 }
		 }
		 else if (a == 2)
		 {
			  if (b == 0)
			  {
				  win++;
			  }
			 else if (b == 1)
			 {
				 win--;
			 }
		 }
	}
	public static int Main()
	{
		int t;
		int a;
		int b;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 b = Integer.parseInt(tempVar3);
			 }
			 jzb(a, b);
		}
		if (win > 0)
		{
			System.out.print("A");
		}
		else if (win < 0)
		{
			System.out.print("B");
		}
		else if (win == 0)
		{
			System.out.print("Tie");
		}
	}

}

