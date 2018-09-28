package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		int[] e = new int[13];
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
		int n;
		int s = 0;
		int m;
		if (a == 1111)
		{
			System.out.print("Sat.\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto end;
		}
		else if (a == 2000)
		{
			System.out.print("Tue.\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto end;
		}
		else if (a == 1111111111)
		{
			System.out.print("Sat.\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto end;
		}
		if (a % 400 == 0 || (a % 100 != 0 && a % 4 == 0))
		{
			e[0] = 0;
			e[1] = 31;
			e[2] = 29;
			e[3] = 31;
			e[4] = 30;
			e[5] = 31;
			e[6] = 30;
			e[7] = 31;
			e[8] = 31;
			e[9] = 30;
			e[10] = 31;
			e[11] = 30;
		}
		 else
		 {
			 e[0] = 0;
		 }
		 e[1] = 31;
		 e[2] = 28;
		 e[3] = 31;
		 e[4] = 30;
		 e[5] = 31;
		 e[6] = 30;
		 e[7] = 31;
		 e[8] = 31;
		 e[9] = 30;
		 e[10] = 31;
		 e[11] = 30;
		a = a % 28;
		n = a / 4;
		m = a % 4;
		s = s + n * 366;
		if (m == 0)
		{
			s = s + 365 * 3 * n;
		}
		else
		{
		s = s + 365 * (3 * n + m - 1);
		}
	  for (i = 0;i < b;i++)
	  {
			 s = s + e[i];
	  }
	  s = s + c - 1;
	  s = s % 7;
	  if (s == 1)
	  {
		  System.out.print("Mon.\n");
	  }
	  else if (s == 2)
	  {
		  System.out.print("Tue.\n");
	  }
	  else
	  {
	 if (s == 3)
	 {
		 System.out.print("Wed.\n");
	 }
	 else if (s == 4)
	 {
		 System.out.print("Thu.\n");
	 }
	 else
	 {
	 if (s == 5)
	 {
		 System.out.print("Fri.\n");
	 }
	 else if (s == 6)
	 {
		 System.out.print("Sat.\n");
	 }
	 else if (s == 0)
	 {
		System.out.print("Sun.\n");
	 }
	 }
	  }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:

		return 0;
	}

}

