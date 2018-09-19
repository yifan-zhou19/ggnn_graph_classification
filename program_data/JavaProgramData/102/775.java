package <missing>;

public class GlobalMembers
{
	public static double[] a = new double[45];
	public static int m = 0;
	public static double[] b = new double[45];
	public static int f = 0;
	public static String sex = new String(new char[10]);


	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		int i;
		int j = 0;
		int k = 0;
		for (i = 0;i < n;i++)
		{
			sex = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (strcmp(sex,"male") == 0)
			{
				a[m++] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
	//			scanf("%g",&a[m++]);
			else
			{
				b[f++] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
	//			scanf("%g",&b[f++]);
		}
	//	cout<<"male"<<m<<"famle"<<f<<endl;
		sort(a,a + m);
		sort(b,b + f);
		if (m == 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto l;
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.2f ",a[i]);
		}
	//		cout<<a[i]<<" ";
		if (f == 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto l2;
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	l:
	for (i = f - 1;i > 0;i--)
	{
			System.out.printf("%.2f ",b[i]);
	}
	//		cout<<b[i]<<" ";
		System.out.printf("%.2f\n",b[0]);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	l2:
	n = 0;
		return 0;
	}
}

