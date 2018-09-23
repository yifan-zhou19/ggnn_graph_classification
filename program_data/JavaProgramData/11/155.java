package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int A;
		int B;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			A = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			B = Integer.parseInt(tempVar3);
		}
		if (N % 100 != 0 && N % 4 == 0 || N % 400 == 0)
		{
			 for (a = 0,A = A - 1;A != 0;A--)
			 {
				switch (A)
				{
					case 1:
					case 3:
					  case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						a += 31;
						break;
					case 2:
						a += 29;
						break;
					case 4:
					case 6:
					  case 9:
					case 11:
						a += 30;
						break;
				}
			 }
		}
		else
		{
			 for (a = 0,A = A - 1;A != 0;A--)
			 {
				 switch (A)
				 {
					case 1:
					case 3:
					  case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						a += 31;
						break;
					case 2:
						a += 28;
						break;
					case 4:
					case 6:
					  case 9:
					case 11:
						a += 30;
						break;
				 }
			 }
		 a += B;
		}
		System.out.printf("%d",a);
	}

}

