package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int i;
	  int j;
	  int num = 0;
	  double[] a = new double[301];
	  double d;
	  double ave = 0;
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
			  a[i] = Double.parseDouble(tempVar2);
		  }
	  ave += a[i];
	  }
	  ave = ave / n;
	  d = Math.abs(a[0] - ave);
	  for (i = 1;i < n;i++)
	  {
		  d = (Math.abs(a[i] - ave) > d)?Math.abs(a[i] - ave):d;
		  num++;
	  }
	  for (i = 0;i < n;i++)
	  {
		  if (Math.abs(Math.abs(a[i] - ave) - d) < 0.00001)
		  {
			  System.out.printf("%1.0f",a[i]);
			  break;
		  }
	  }
	  for (j = i + 1;j < n;j++)
	  {
		  if (Math.abs(Math.abs(a[j] - ave) - d) < 0.00001)
		  {
			  System.out.printf(",%1.0f",a[j]);
		  }
	  }
		  System.out.print("\n");
	}

}

