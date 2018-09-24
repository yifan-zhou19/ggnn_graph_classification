package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
	   int sum;
	  switch (n)
	  {
		  case 1:
			  sum = 0;
			  break;
	   case 2:
		   sum = 31;
		   break;
		case 3:
			sum = (31 + 28);
			break;
		case 4:
			sum = (31 + 28 + 31);
			break;
		case 5:
			sum = (31 * 2 + 28 + 30);
			break;
		case 6:
			sum = (31 * 3 + 28 + 30);
			break;
		case 7:
			sum = (31 * 3 + 28 + 30 * 2);
			break;
		case 8:
			sum = (31 * 4 + 28 + 30 * 2);
			break;
		case 9:
			sum = (31 * 5 + 28 + 30 * 2);
			break;
		case 10:
			sum = (31 * 5 + 28 + 30 * 3);
			break;
		case 11:
			sum = (31 * 6 + 28 + 30 * 3);
			break;
		case 12:
			sum = (31 * 6 + 28 + 30 * 4);
	  }
	  return (sum);
	}
	public static int Main()
	{
		 int[] month = new int[5];
		 int[] day = new int[5];
		 int[] year = new int[5];
		 int[] d = new int[5];
		 int i;
		 for (i = 0;i <= 4;i++)
		 {
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				year[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				month[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				day[i] = Integer.parseInt(tempVar3);
			}
		 }
		 for (i = 0;i <= 4;i++)
		 {
			 if ((year[i] % 4 == 0 && year[i] % 100 != 0 || year[i] % 400 == 0) && month[i] > 2)
			 {
			   d[i] = f(month[i]) + day[i] + 1;
			 }
			 else
			 {
			   d[i] = f(month[i]) + day[i];
			 }
			System.out.printf("%d\n",d[i]);
		 }
		 return 0;
	}

}

