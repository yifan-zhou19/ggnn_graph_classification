package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n; //??n?????i?j
	 int i;
	 int j;
	 double[] x = new double[100]; //??x?y??????dis?????max???
	 double[] y = new double[100];
	 double dis;
	 double max;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 max = 0;
	 for (i = 1;i <= n;i++)
	 {
	   x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	   y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	 }
	 for (i = 1;i <= n;i++)
	 {
	  for (j = 1;j <= n;j++)
	  {
		dis = Math.sqrt(Math.pow(x[i] - x[j],2) + Math.pow(y[i] - y[j],2)); //????
		if (dis > max)
		{
		 max = dis; //?????
		}
	  }
	 }
	 System.out.printf("%.4f", max);
	 return 0;
	}
}

