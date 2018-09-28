package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int i;
	int j;
	int[][] m = new int[8][8];
	int g;
	int p;
	int q;
	int k;
	int o = 0;
	int n = 0;
	char l;
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	l = ConsoleInput.readToWhiteSpace(true).charAt(0);
	b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < a;i++)
	{
					 for (j = 0;j < b;j++)
					 {
									  m[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					 }
	}
	for (i = 0;i < a;i++)
	{
				 g = m[i][0];
					 for (j = 0;j < b;j++)
					 {
									  if (m[i][j] >= g)
									  {
									  g = m[i][j];
									  p = i;
									  q = j;
									  }
					 }
									  for (k = 0;k < a;k++)
									  {
													   if (m[p][q] > m[k][q])
													   {
													   n++;
													   }
									  }
													   if (n == 0)
													   {
													   System.out.print(p);
													   System.out.print('+');
													   System.out.print(q);
													   System.out.print("\n");
														o++;
													   }
	}
	if (o == 0)
	{
		System.out.print("No");
	}

	return 0;
	}

}

