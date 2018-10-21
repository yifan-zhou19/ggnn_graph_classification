package <missing>;

public class GlobalMembers
{
	//**************************
	//*????????        *
	//*??????1000012797?*
	//*?????2010?12?    *
	//**************************
	public static int Main()
	{
		int i = 0;
		int j;
		int n;
		int count = 0;
		double[] a = new double[10]; //????a,b,c??????????????????
		double[] b = new double[10];
		double[] c = new double[10];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		} //??????
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct dis //???????????????
	//	{
	//		int x;
	//		int y;
	//		double len;
	//	}
	//	d[45],temp;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d[count].x = i;
				d[count].y = j;
				d[count].len = Math.sqrt(Math.pow(a[i] - a[j],2) + Math.pow(b[i] - b[j],2) + Math.pow(c[i] - c[j],2));
				count++;
			}
		} //?????
		j = n * (n - 1) / 2;
		for (;j > 0;j--)
		{
			for (i = 0;i < n * (n - 1) / 2 - 1;i++)
			{
				if (d[i].len < d[i + 1].len)
				{
					temp = d[i];
					d[i] = d[i + 1];
					d[i + 1] = temp;
				}
			}
		} //?????
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			System.out.print("(");
			System.out.print((int)a[d[i].x]);
			System.out.print(",");
			System.out.print((int)b[d[i].x]);
			System.out.print(",");
			System.out.print((int)c[d[i].x]);
			System.out.print(")");
			System.out.print("-");
			System.out.print("(");
			System.out.print((int)a[d[i].y]);
			System.out.print(",");
			System.out.print((int)b[d[i].y]);
			System.out.print(",");
			System.out.print((int)c[d[i].y]);
			System.out.print(")");
			System.out.print("=");
			System.out.printf("%.2f", d[i].len);
			System.out.printf("%.2f", "\n");
		} //??
		return 0; //??
	}

}

