package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int k;
	  int man = 0;
	  int woman = 0;
	  String sex = new String(new char[7]);
	  double h;
	  double x;
	  double[] male = new double[40];
	  double[] female = new double[40];
	  final String a = "male";
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sex = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			h = Double.parseDouble(tempVar3);
		}
		if ((strcmp(sex,a)) == 0)
		{
		  male[man] = h;
		  man++;
		}
		else
		{
		  female[woman] = h;
		  woman++;
		}
	  }
	  for (k = 1;k <= man;k++)
	  {
		for (i = 0;i < man - k;i++)
		{
		  if (male[i] > male[i + 1])
		  {
			x = male[i + 1];
			male[i + 1] = male[i];
			male[i] = x;
		  }
		}
	  }
	  for (k = 1;k <= woman;k++)
	  {
		for (i = 0;i < woman - k;i++)
		{
		  if (female[i] > female[i + 1])
		  {
			x = female[i + 1];
			female[i + 1] = female[i];
			female[i] = x;
		  }
		}
	  }
	  for (i = 0;i < man;i++)
	  {
		System.out.printf("%.2lf ",male[i]);
	  }
	  for (i = woman - 1;i > 0;i--)
	  {
		System.out.printf("%.2lf ",female[i]);
	  }
	  System.out.printf("%.2lf",female[0]);
	  return 0;
	}

}

