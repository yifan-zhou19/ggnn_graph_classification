package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		if ((a % 100 != 0 && a % 4 == 0) || (a % 400 == 0))
		{
										  if (b == 1)
										  {
										  System.out.printf("%d",c);
										  }
										 else if (b == 2)
										 {
										  System.out.printf("%d",c + 31);
										 }
										  else if (b == 3)
										  {
										  System.out.printf("%d",c + 60);
										  }
										  else if (b == 4)
										  {
										  System.out.printf("%d",c + 91);
										  }
										   else if (b == 5)
										   {
										  System.out.printf("%d",c + 121);
										   }
										   else if (b == 6)
										   {
										  System.out.printf("%d",c + 152);
										   }
										   else if (b == 7)
										   {
										  System.out.printf("%d",c + 182);
										   }
										   else if (b == 8)
										   {
										  System.out.printf("%d",c + 213);
										   }
										   else if (b == 9)
										   {
										  System.out.printf("%d",c + 244);
										   }
										   else if (b == 10)
										   {
										  System.out.printf("%d",c + 274);
										   }
										   else if (b == 11)
										   {
										  System.out.printf("%d",c + 305);
										   }
										  else
										  {
											  System.out.printf("%d",c + 335);
										  }
		}
		else
		{
										  if (b == 1)
										  {
										  System.out.printf("%d",c);
										  }
										 else if (b == 2)
										 {
										  System.out.printf("%d",c + 31);
										 }
										  else if (b == 3)
										  {
										  System.out.printf("%d",c + 59);
										  }
										  else if (b == 4)
										  {
										  System.out.printf("%d",c + 90);
										  }
										   else if (b == 5)
										   {
										  System.out.printf("%d",c + 120);
										   }
										   else if (b == 6)
										   {
										  System.out.printf("%d",c + 152);
										   }
										   else if (b == 7)
										   {
										  System.out.printf("%d",c + 181);
										   }
										   else if (b == 8)
										   {
										  System.out.printf("%d",c + 212);
										   }
										   else if (b == 9)
										   {
										  System.out.printf("%d",c + 243);
										   }
										   else if (b == 10)
										   {
										  System.out.printf("%d",c + 273);
										   }
										   else if (b == 11)
										   {
										  System.out.printf("%d",c + 304);
										   }
										  else
										  {
											  System.out.printf("%d",c + 334);
										  }
		}
		System.in.read();
		System.in.read();
	}
}

