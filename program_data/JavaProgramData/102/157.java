package <missing>;

public class GlobalMembers
{
	public static double[] m = new double[40];
	public static double[] f = new double[40];
	public static int Main()
	{
		//freopen("in.txt","r",stdin);
		//freopen("out.txt","w",stdout);
		int n;
		String str = new String(new char[20]);
		double h;
		int b;
		int g;
		while (scanf("%d", n) != EOF)
		{
			b = 0;
			g = 0;
			for (int i = 0;i < n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					str = tempVar.charAt(0);
				}
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					h = Double.parseDouble(tempVar2);
				}
				if (strcmp(str,"male") == 0)
				{
					m[b++] = h;
				}
				else
				{
					f[g++] = h;
				}
			}
			sort(m,m + b);
			sort(f,f + g);
			for (int i = 0;i < b;i++)
			{
				System.out.printf("%.2lf ",m[i]);
			}
				//cout<<<<" ";
			//cout<<g<<endl;      
			for (int i = (g - 1);i > 0;i--)
			{
				System.out.printf("%.2lf ",f[i]);
			}
			System.out.printf("%.2lf\n",f[0]);
			//cout<<f[0]<<endl;
			//cout<<endl;

		}
		return 0;
	}

}

