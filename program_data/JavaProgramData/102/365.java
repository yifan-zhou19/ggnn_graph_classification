package <missing>;

public class GlobalMembers
{
	//int com1(const void*elem1,const void*elem2)
	//{
	//return*((double*)elem1)-*((double*)elem2);//shengxu
	//}
	public static int Main()
	{
			int n;
			int ms = 1;
			int ws = 1;
			double[] m = new double[50];
			double[] w = new double[50];
			double q;
			for (int j = 0;j <= 49;j++)
			{
				m[j] = 0;
				w[j] = 0;
			}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] x = new char[45][10];
		for (int i = 1;i <= n;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					x[i] = tempVar2.charAt(0);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					q = Double.parseDouble(tempVar3);
				}
				if (x[i][0] == 'm') //(strcmp(x[i],"male")==0)    //x[i]=="male"
				{

						m[ms] = q;
						ms++; //cong 1 dao ms-1
				}
				if (x[i][0] == 'f') //(strcmp(x[i],"female")==0)
				{

						w[ws] = q;
						ws++;
				}
		}
	//maopao
		for (int i = 1;i <= ms - 1;i++)
		{
			for (int j = 1;j <= ms - 1 - i;j++)
			{
				if (m[j + 1] < m[j])
				{
						double zhong = m[j + 1];
						m[j + 1] = m[j];
						m[j] = zhong;
				}
			}
		}
		for (int i = 1;i <= ms - 1;i++)
		{
			System.out.printf("%.2lf ",m[i]);
		}

		for (int i = 1;i <= ws - 1;i++)
		{
			for (int j = 1;j <= ws - 1 - i;j++)
			{
				if (w[j + 1] < w[j])
				{
						double zhong = w[j + 1];
						w[j + 1] = w[j];
						w[j] = zhong;
				}
			}
		}
		for (int i = ws - 1;i >= 2;i--)
		{
			System.out.printf("%.2lf ",w[i]);
		}
		System.out.printf("%.2lf",w[1]);



	}

}

