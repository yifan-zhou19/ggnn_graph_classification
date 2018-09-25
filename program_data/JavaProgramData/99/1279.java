package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		int sum = 0;
	double ax1 = 0;
	double ax2 = 0;
	double ax3 = 0;
	double ax4 = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] age = new int[n];
	for (int i1 = 0;i1 < n;i1++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		age[i1] = Integer.parseInt(tempVar2);
	}
	if (age[i1] < 19)
	{
		a1++;
	}
	if (age[i1] > 18 && age[i1] < 36)
	{
		a2++;
	}
	if (age[i1] > 35 && age[i1] < 61)
	{
		a3++;
	}
	if (age[i1] > 60)
	{
		a4++;
	}
	}
	sum = a1 + a2 + a3 + a4;
	ax1 = (double)a1 / sum * 100;
	ax2 = (double)a2 / sum * 100;
	ax3 = (double)a3 / sum * 100;
	ax4 = (double)a4 / sum * 100;
	System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\nOver60: %.2lf%%\n",ax1,ax2,ax3,ax4);
	return 0;
	}


}

