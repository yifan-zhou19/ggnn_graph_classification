package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int A = 0;
		int B = 0;
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
							 a = Integer.parseInt(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead(" ");
						 if (tempVar3 != null)
						 {
							 b = Integer.parseInt(tempVar3);
						 }
						 if (a == 0)
						 {
								  if (b == 0)
								  {
										   continue;
								  }
								  else if (b == 1)
								  {
									   A++;
								  }
								  else
								  {
									   B++;
								  }
						 }
						 else if (a == 1)
						 {
								  if (b == 0)
								  {
										   B++;
								  }
								  else if (b == 1)
								  {
									   continue;
								  }
								  else
								  {
									   A++;
								  }
						 }
						 else
						 {
								  if (b == 0)
								  {
										   A++;
								  }
								  else if (b == 1)
								  {
									   B++;
								  }
								  else
								  {
									   continue;
								  }
						 }
		}
		if (A > B)
		{
				System.out.print("A");
		}
		else if (A < B)
		{
					 System.out.print("B");
		}
		else
		{
			 System.out.print("Tie");
		}
			 return 0;
	}

}

