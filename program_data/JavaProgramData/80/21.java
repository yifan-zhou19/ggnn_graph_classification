package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a1;
		int a2;
		int b1;
		int b2;
		int c1;
		int c2;
		int num;
		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			b2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			c2 = Integer.parseInt(tempVar6);
		}

		int pdrun = int;
		int tohead = new int(int,int,int);
		int toend = new int(int,int,int);

		if (a1 == a2)
		{
			num = tohead(a2,b2,c2) - tohead(a1,b1,c1);
		}
		if (a1 != a2)
		{
			num = tohead(a2,b2,c2) + toend(a1, b1, c1);
				  for (i = a1 + 1;i < a2;i = i + 1)
				  {
					  if (pdrun(i) == 1)
					  {
						  num = num + 366;
					  }
					  else
					  {
						  num = num + 365;
					  }
				  }

		}

		System.out.printf("%d",num);
	}

	public static int pdrun(int i)
	{
		int n;
		if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
		{
			n = 1;
		}
		 else
		 {
			 n = 0;
		 }
		 return (n);
	}

//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static tohead(int x,int y,int z)
	{
		int sum;
		int pdrun = int;
		sum = 0;
		switch (y)
		{
			case 12:
				sum = sum + 30;
		case 11:
			sum = sum + 31;
		case 10:
			sum = sum + 30;
		case 9:
			sum = sum + 31;
		case 8:
			sum = sum + 31;
		case 7:
			sum = sum + 30;
		case 6:
			sum = sum + 31;
		case 5:
			sum = sum + 30;
		case 4:
			sum = sum + 31;
		case 3:
			if (pdrun(x) == 1)
			{
				sum = sum + 29;
			}
			else
			{
				sum = sum + 28;
			}
		case 2:
			sum = sum + 31;
		case 1:
			sum = sum + z;

		}
		return (sum);

	}
	public static int toend(int x,int y,int z)
	{
		int sum;


		if (pdrun(x) == 1)
		{
			sum = 366 - tohead(x,y,z);
		}
		else
		{
			sum = 365 - tohead(x,y,z);
		}

		return (sum);

	}
}

