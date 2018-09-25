package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int i;
	   int[] a = new int[5];
	   int[] b = new int[5];
	   int[] c = new int[5];
	   int[] g = new int[5];
	   i = 1;
	   while (i <= 5)
	   {
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a[i] = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   b[i] = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   c[i] = Integer.parseInt(tempVar3);
	   }
	   i++;
	   }
	   i = 1;
	   while (i <= 5)
	   {
	   g[i] = 0;
	   switch (b[i])
	   {
		case 12:
			g[i] += 30;
		case 11:
			g[i] += 31;
		case 10:
			g[i] += 30;
		case 9:
			g[i] += 31;
		case 8:
			g[i] += 31;
		case 7:
			g[i] += 30;
		case 6:
			g[i] += 31;
		case 5:
			g[i] += 30;
		case 4:
			g[i] += 31;
		case 3:
			g[i] += 28;
		case 2:
			g[i] += 31;
		case 1:
			g[i] += 0;
			break;
		default:
			System.out.print("error\n");
	   }
	   if (((a[i] % 4 == 0 && a[i] % 100 != 0) || (a[i] % 400 == 0)) && (b[i] >= 3))
	   {
		   c[i] = c[i] + 1;
	   }
	   System.out.printf("%d\n",g[i] + c[i]);
	   i++;
	   }
	}
}

