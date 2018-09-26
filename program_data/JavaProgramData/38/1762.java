package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int k;
	  int n;
	  int i;
	  int j;
	  int b = 0;
	  double[] s = new double[1000];
	  double a;
	  double S;
	  double sum;
	  double SS;
	  double[] aa = new double[1000];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  k = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < k;i++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
		sum = 0;
		SS = 0;
		for (j = 0;j < n;j++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s[j] = Double.parseDouble(tempVar3);
		}
		sum += s[j];
		}
	  a = sum / n;
	  for (j = 0;j < n;j++)
	  {
	  SS += (s[j] - a) * (s[j] - a);
	  }
	  S = Math.sqrt(SS / n);
	  aa[b] = S;
	  b++;
	  }
	 for (int h = 0;h < b;h++)
	 {
	 System.out.printf("%.5lf\n",aa[h]);
	 }
	return 0;
	}




}

