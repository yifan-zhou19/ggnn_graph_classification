package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
			 int i = 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			 loop:
			 if (i <= 5)
			 {
			 int n = 0;
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
		switch (b)
		{
		case 12:
			n = n + 30;
		case 11:
			n = n + 31;
		case 10:
			n = n + 30;
		case 9:
			n = n + 31;
		case 8:
			n = n + 31;
		case 7:
			n = n + 30;
		case 6:
			n = n + 31;
		case 5:
			n = n + 30;
		case 4:
			n = n + 31;
		case 3:
			n = n + 28;
		case 2:
			n = n + 31;
		case 1:
			n = n + c;
			break;
		}
		if (((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) && b >= 3)
		{
			n = n + 1;
		}
		System.out.printf("%d\n",n);
			 i++;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			 goto loop;
			 }
			return 0;
	}
}

