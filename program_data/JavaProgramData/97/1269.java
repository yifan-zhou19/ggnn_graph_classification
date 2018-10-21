package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum;
		int a1;
		int b1;
		int c1;
		int d1;
		int e1;
		int f1;
		int numa;
		int numb;
		int numc;
		int numd;
		int nume;
		int numf;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sum = Integer.parseInt(tempVar);
		}
		a1 = sum % 100;
		numa = (sum - a1) / 100;
		b1 = (sum - 100 * numa) % 50;
		numb = (sum - 100 * numa - b1) / 50;
		c1 = (sum - 100 * numa - 50 * numb) % 20;
		numc = (sum - 100 * numa - 50 * numb - c1) / 20;
		d1 = (sum - 100 * numa - 50 * numb - 20 * numc) % 10;
		numd = (sum - 100 * numa - 50 * numb - 20 * numc - d1) / 10;
		e1 = (sum - 100 * numa - 50 * numb - 20 * numc - 10 * numd) % 5;
		nume = (sum - 100 * numa - 50 * numb - 20 * numc - 10 * numd - e1) / 5;
		f1 = (sum - 100 * numa - 50 * numb - 20 * numc - 10 * numd - 5 * nume) % 1;
		numf = (sum - 100 * numa - 50 * numb - 20 * numc - 10 * numd - 5 * nume - f1);
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d",numa,numb,numc,numd,nume,numf);
		return 0;
	}
}

