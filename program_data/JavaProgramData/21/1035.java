package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] s = new double[310]; //s???????????av?????p???????????????max???????? n??????
		double av = 0;
		double n = 0;
		double max = 0;
		double sum = 0;
		double[] p = new double[310];
		double temp = 0;
		int i = 0;
		int j = 0;
		int ge = 1;
		   n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		   for (i = 1;i <= n;i++) //??
		   {
			  s[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		   }
		   for (i = 1;i <= n;i++)
		   {
			  sum += s[i];
		   }
		   av = sum / n;
		   for (i = 1;i <= n;i++)
		   {
			  if ((s[i] > av) && (s[i] - av > max))
			  {
					max = s[i] - av;
					continue;
			  }
			  if ((av > s[i]) && (av - s[i] > max))
			  {
					max = av - s[i];
					continue;
			  }
		   }
		   ge = 1;
		   for (i = 1;i <= n;i++)
		   {
			  if (Math.abs(Math.abs(s[i] - av) - max) < 0.00001)
			  {
					p[ge] = s[i];
					ge++;
					continue;
			  }
		   }
		   ge--;
		   for (i = 1;i <= ge;i++)
		   {
			  for (j = 1;j <= ge - i;j++)
			  {
					if (p[j] > p[j + 1])
					{
						   temp = p[j];
						   p[j] = p[j + 1];
						   p[j + 1] = temp;
					}
			  }
		   }
		   System.out.print(p[1]);
		   for (i = 2;i <= ge;i++)
		   {
			 System.out.print(",");
			 System.out.print(p[i]);
		   }
	return 0;
	}
}

